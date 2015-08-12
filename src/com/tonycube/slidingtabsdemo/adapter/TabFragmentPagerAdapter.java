package com.tonycube.slidingtabsdemo.adapter;

import java.util.LinkedList;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tonycube.slidingtabsdemo.tab.BasicFragment;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

	LinkedList<BasicFragment> fragments = null;
	
	public TabFragmentPagerAdapter(FragmentManager fm, LinkedList<BasicFragment> fragments) {
		super(fm);
		if (fragments == null) {
			this.fragments = new LinkedList<BasicFragment>();
		}else{
			this.fragments = fragments;
		}
	}

	@Override
	public BasicFragment getItem(int position) {
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return fragments.get(position).getTitle();
	}
	
	public int getIconResId(int position) {
		return fragments.get(position).getIconResId();
	}

}
