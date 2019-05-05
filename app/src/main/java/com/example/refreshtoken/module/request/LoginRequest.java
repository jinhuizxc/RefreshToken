package com.example.refreshtoken.module.request;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;

import com.example.refreshtoken.utils.KeyTools;

/**
 * Created by zhpan on 2017/10/25.
 * Description:登录请求实体类
 */

public class LoginRequest extends BasicRequest {

    private static final int REQUEST_CODE = 1;
    private String userId;
    private String password;
    private String appKey;

    public LoginRequest(Activity activity) {
        appKey = generateAppKey(activity);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * imei + timestamp md5 得到app key
     *
     * @param context
     * @return
     */
    public static String generateAppKey(Activity context) {

        if (ContextCompat.checkSelfPermission(context,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(context,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_CODE);
        } else {

        }

        String deviceId = ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
        String timeStamp = System.currentTimeMillis() + "";
        return KeyTools.getMD5(deviceId+timeStamp);
    }
}
