package net.oneread.facebooklogin;

import android.app.Application;

import com.vk.sdk.VKSdk;

/**
 * ---------------------------------------------------
 * Created by Sermilion on 27/12/2016.
 * Project: FacebookLogin
 * ---------------------------------------------------
 * <a href="http://www.ucomplex.org">ucomplex.org</a>
 * <a href="http://www.github.com/sermilion>github</a>
 * ---------------------------------------------------
 */

public class LoginApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(getApplicationContext());
    }
}
