package com.example.refreshtoken.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.refreshtoken.R;
import com.example.refreshtoken.module.reponse.MeiZi;
import com.example.refreshtoken.net.RetrofitHelper;
import com.example.refreshtoken.net.common.DefaultObserver;
import com.example.refreshtoken.utils.RxUtil;

import java.util.List;

/**
 * 关于token:
 *
 * 登录成功后我们可将token和refreshToekn存储到本地
 *
 * （一）Rxjava2+Retrofit完美封装
 * https://blog.csdn.net/qq_20521573/article/details/70991850
 * （二）Rxjava2+Retrofit之Token自动刷新
 * https://blog.csdn.net/qq_20521573/article/details/76100558
 * （如果失效则调用刷新token接口重新获取token。如果refreshToekn也过期那么我们需要重新登录。）
 *
 * RxJava+Retrofit实现全局过期token自动刷新Demo篇
 * http://alighters.com/blog/2016/08/22/rxjava-plus-retrofitshi-xian-zhi-demo/
 * AndroidDemos
 * https://github.com/alighters/AndroidDemos
 *
 */
public class MainActivity extends BaseActivity {

    private Button btn;
    ProgressBar progressBar;
    TextView mTvPercent;
    // TODO 下载文件
//    private DownloadUtils downloadUtils;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initView();
    }

    private void initView() {
//        progressBar = (ProgressBar) findViewById(R.id.progressBar);
//        mTvPercent = (TextView) findViewById(R.id.tv_percent);
//        btn = (Button) findViewById(R.id.btn_download);
//        downloadUtils = new DownloadUtils();
    }


    /**
     * Get请求
     *
     * @param view
     */
    public void getData(View view) {
        RetrofitHelper.getApiService()
                .getMezi()
                .compose(RxUtil.<List<MeiZi>>rxSchedulerHelper(this))
                .subscribe(new DefaultObserver<List<MeiZi>>() {
                    @Override
                    public void onSuccess(List<MeiZi> response) {
                        showToast("请求成功，妹子个数为" + response.size());
                    }
                });
    }

    /**
     * Post请求
     */
    public void login(View view) {
//        LoginRequest loginRequest = new LoginRequest(this);
//        loginRequest.setUserId("123456");
//        loginRequest.setPassword("123123");
//        String appKey = loginRequest.getAppKey();
//        RetrofitHelper.getApiService()
//                .login(loginRequest)
//                .compose(RxUtil.<LoginResponse>rxSchedulerHelper(this))
//                .subscribe(new DefaultObserver<LoginResponse>() {
//                    @Override
//                    public void onSuccess(LoginResponse response) {
//                        ToastUtils.show("登录成功");
//                    }
//                });


    }

}
