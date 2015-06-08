package com.tonycube.slidingtabsdemo.log;

import android.util.Log;

public class DLog {
	private static final boolean DEBUG = true;
	private static final String TAG = "SlidingTabsDemo";
	
	public static void d(String msg){
		if (DEBUG) {
			Log.d(TAG, ">>> " + msg);
		}
	}
	
}
