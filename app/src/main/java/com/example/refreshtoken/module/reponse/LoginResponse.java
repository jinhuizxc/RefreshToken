package com.example.refreshtoken.module.reponse;


import com.example.refreshtoken.bean.BasicResponse;

/**
 * Created by zhpan on 2017/10/25.
 * Description:
 *
 * 登录时我们需要两个参数：
 * 用户名username、密码password以及appkey作为一个唯一id，每次登录成功服务器会返回token和refreshToken
 *
 */

public class LoginResponse extends BasicResponse {

    private String token;
    private String refresh_token;
    private String expired;
    private String refresh_secret;
    /**
     * accessToken : *******
     * tokenType : *******
     * expiresIn : *******
     * refreshToken : *******
     * scope : *******
     */

    private String accessToken;
    private String tokenType;
    private String expiresIn;
    private String refreshToken;
    private String scope;

    public String getRefresh_secret() {
        return refresh_secret;
    }

    public void setRefresh_secret(String refresh_secret) {
        this.refresh_secret = refresh_secret;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
