package com.l99.chinafootball.base;

import android.app.Application;
import android.content.Context;

import io.swagger.client.ApiInvoker;

//import cn.smssdk.SMSSDK;

/**
 * 自定义Application
 *
 */
public class BaseApplication extends Application {

	public static Context sContext;

	// 当应用创建的时候,调用此方法
	@Override
	public void onCreate() {
		super.onCreate();
		sContext = getApplicationContext();
		ApiInvoker.initializeInstance();
//		SMSSDK.initSDK(this, "1362441d82828", "27d21be7415d50847e6eb803b780fab6");

	}

}
