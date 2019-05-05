package com.example.refreshtoken.net.proxy;

import com.example.refreshtoken.net.RetrofitUtils;

import java.lang.reflect.Proxy;

/**
 * 添加代理，实现token过期自动刷新
 */
public class IdeaApiProxy implements IGlobalManager {

    // TODO
    @SuppressWarnings("unchecked")
    public <T> T getApiService(Class<T> tClass,String baseUrl) {
        T t = RetrofitUtils.getRetrofitBuilder(baseUrl)
                .build().create(tClass);
        return (T) Proxy.newProxyInstance(tClass.getClassLoader(), new Class<?>[] { tClass }, new ProxyHandler(t, this));
    }

    @Override
    public void exitLogin() {

    }
}

