package com.tonycube.slidingtabsdemo.fragment;

import com.tonycube.slidingtabsdemo.R;
import com.tonycube.slidingtabsdemo.log.DLog;
import com.tonycube.slidingtabsdemo.tab.BaseFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WoodFragment extends BaseFragment {
	
	private static final String DATA_NAME = "name";
	
	private String title = "";
	
	public static WoodFragment newInstance(String title, int indicatorColor,
            int dividerColor) {
		DLog.d("WoodFragment - newInstance");
		WoodFragment f = new WoodFragment();
		f.setTitle(title);
		f.setIndicatorColor(indicatorColor);
		f.setDividerColor(dividerColor);
		
		//pass data
		Bundle args = new Bundle();
        args.putString(DATA_NAME, title);
        f.setArguments(args);
		
        return f;
    }
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		DLog.d("WoodFragment - onActivityCreated");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DLog.d("WoodFragment - onCreate");
		
		//get data
		title = getArguments().getString(DATA_NAME);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		DLog.d("WoodFragment - onCreateView");
		
		//layout
		View view = inflater.inflate(R.layout.frg_common, container, false);
		
		//view
		TextView txtName = (TextView) view.findViewById(R.id.txtName);
		txtName.setText(title);
		
		return view;
	}



	@Override
	public void onDestroy() {
		DLog.d("WoodFragment - onDestroy");
		super.onDestroy();
	}



	@Override
	public void onDestroyView() {
		DLog.d("WoodFragment - onDestroyView");
		super.onDestroyView();
	}
	
	
	
}
