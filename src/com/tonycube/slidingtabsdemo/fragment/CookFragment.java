package com.tonycube.slidingtabsdemo.fragment;

import com.tonycube.slidingtabsdemo.R;
import com.tonycube.slidingtabsdemo.log.DLog;
import com.tonycube.slidingtabsdemo.tab.BasicFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CookFragment extends BasicFragment {
	
	private static final String DATA_NAME = "name";
	
	private String title = "";
	
	public static CookFragment newInstance(String title, int indicatorColor,
            int dividerColor) {
		DLog.d("CookFragment - newInstance");
		CookFragment f = new CookFragment();
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
		DLog.d("CookFragment - onActivityCreated");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DLog.d("CookFragment - onCreate");
		
		//get data
		title = getArguments().getString(DATA_NAME);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		DLog.d("CookFragment - onCreateView");
		
		//layout
		View view = inflater.inflate(R.layout.frg_common, container, false);
		
		//view
		TextView txtName = (TextView) view.findViewById(R.id.txtName);
		txtName.setText(title);
		
		return view;
	}



	@Override
	public void onDestroy() {
		DLog.d("CookFragment - onDestroy");
		super.onDestroy();
	}



	@Override
	public void onDestroyView() {
		DLog.d("CookFragment - onDestroyView");
		super.onDestroyView();
	}
	
	
	
}
