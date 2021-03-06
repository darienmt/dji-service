package com.codekeepersinc.djiservice;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import com.secneo.sdk.Helper;

public class MApplication extends Application {

    protected DJIServiceApplication application = null;
    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
        if ( this.application == null ) {
            this.application = new DJIServiceApplication();
            this.application.setContext(this);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.application.onCreate();
    }
}