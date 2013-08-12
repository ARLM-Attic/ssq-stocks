/*Contributor: Johnny Y. (20130811Sun)*/


package com.testflip.simplestockquotes;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class MyApplication extends Application {
	String strStocks;
	
	   public void SavePreferences(String key, String value) {
		    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());//getPreferences(MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedPreferences.edit();
		    editor.putString("ssq_stocks", strStocks + "+" + value);
		    editor.commit();
	   }
		  
	   public void LoadPreferences() {
	    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());//getPreferences(MODE_PRIVATE);
	    	strStocks = sharedPreferences.getString("ssq_stocks", "");
	    

	   }
	   
/*	   
		@Override
		public void onConfigurationChanged(Configuration newConfig) {
			super.onConfigurationChanged(newConfig);
		}
*/
		@Override
		public void onCreate() {
			super.onCreate();
			
			LoadPreferences();
		}
	 
		@Override
		public void onLowMemory() {
			super.onLowMemory();
		}
	 
		@Override
		public void onTerminate() {
			super.onTerminate();
			
			
		}	   
	   
}
