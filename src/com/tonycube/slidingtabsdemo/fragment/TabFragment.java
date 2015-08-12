package com.tonycube.slidingtabsdemo.fragment;

import java.util.LinkedList;

import com.tonycube.slidingtabsdemo.R;
import com.tonycube.slidingtabsdemo.adapter.TabFragmentPagerAdapter;
import com.tonycube.slidingtabsdemo.tab.BasicFragment;
import com.tonycube.slidingtabsdemo.tab.SlidingTabLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragment extends Fragment {

	private SlidingTabLayout tabs;
	private ViewPager pager;
	private FragmentPagerAdapter adapter;
	
	public static Fragment newInstance(){
		TabFragment f = new TabFragment();
		return f;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.frg_tab, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		//adapter
		final LinkedList<BasicFragment> fragments = getFragments();
		adapter = new TabFragmentPagerAdapter(getFragmentManager(), fragments);
		//pager
		pager = (ViewPager) view.findViewById(R.id.pager);
		pager.setAdapter(adapter);
		//tabs
		tabs = (SlidingTabLayout) view.findViewById(R.id.tabs);
		tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
			
			@Override
			public int getIndicatorColor(int position) {
				return fragments.get(position).getIndicatorColor();
			}
			
			@Override
			public int getDividerColor(int position) {
				return fragments.get(position).getDividerColor();
			}
		});
		tabs.setBackgroundResource(R.color.color_primary);
		tabs.setCustomTabView(R.layout.tab_title, R.id.txtTabTitle, R.id.imgTabIcon);
		tabs.setViewPager(pager);
		
	}
	
	private LinkedList<BasicFragment> getFragments(){
		int indicatorColor = Color.parseColor(this.getResources().getString(R.color.color_accent));
		int dividerColor = Color.TRANSPARENT;
		
		LinkedList<BasicFragment> fragments = new LinkedList<BasicFragment>();
		fragments.add(BookFragment.newInstance("Book", indicatorColor, dividerColor, android.R.drawable.ic_dialog_info));
		fragments.add(CookFragment.newInstance("Cook", indicatorColor, dividerColor, android.R.drawable.ic_dialog_map));
		fragments.add(FoodFragment.newInstance("Food", indicatorColor, dividerColor, android.R.drawable.ic_dialog_email));
		fragments.add(GoodFragment.newInstance("Good", Color.BLUE, dividerColor, android.R.drawable.ic_lock_power_off));
		fragments.add(LookFragment.newInstance("Look", Color.CYAN, dividerColor, android.R.drawable.ic_dialog_dialer));
		fragments.add(WoodFragment.newInstance("Wood", Color.MAGENTA, dividerColor, android.R.drawable.ic_media_play));
		return fragments;
	}
	
}
