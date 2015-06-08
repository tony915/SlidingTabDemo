package com.tonycube.slidingtabsdemo;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.tonycube.slidingtabsdemo.fragment.TabFragment;


public class MainActivity extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initMainFragment(savedInstanceState);
		initActionbar();
	}
	
	private void initMainFragment(Bundle savedInstanceState){
		if (savedInstanceState == null) {
    		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            TabFragment fragment = new TabFragment();
            transaction.replace(R.id.content_fragment, fragment);
            transaction.commit();
        }
	}

	
	private void initActionbar() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
	    setSupportActionBar(toolbar);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("SlidingTabs Demo");
	}
	
	

	
}
