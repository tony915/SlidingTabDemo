package com.tonycube.slidingtabsdemo.helper;

import com.tonycube.slidingtabsdemo.R;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

public class ActionBarHelper {
	private final ActionBar actionBar;
	private CharSequence drawerTitle;
	private CharSequence title;
	
	private ActionBarActivity activity;

	public ActionBarHelper(ActionBarActivity activity) {
		this.activity = activity;
		actionBar = activity.getSupportActionBar();
	}

	public void init() {
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setIcon(R.drawable.ic_launcher);
		title = drawerTitle = activity.getTitle();
	}

	/**
	 * When the drawer is closed we restore the action bar state reflecting the
	 * specific contents in view.
	 */
	public void onDrawerClosed() {
		actionBar.setTitle(title);
	}

	/**
	 * When the drawer is open we set the action bar to a generic title. The
	 * action bar should only contain data relevant at the top level of the nav
	 * hierarchy represented by the drawer, as the rest of your content will be
	 * dimmed down and non-interactive.
	 */
	public void onDrawerOpened() {
		actionBar.setTitle(drawerTitle);
	}

	public void setTitle(CharSequence title) {
		this.title = title;
	}
	
	public ActionBar getActionBar(){
		return actionBar;
	}
}
