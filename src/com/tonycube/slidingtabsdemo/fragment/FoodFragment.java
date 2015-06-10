package com.tonycube.slidingtabsdemo.fragment;

import com.tonycube.slidingtabsdemo.R;
import com.tonycube.slidingtabsdemo.log.DLog;
import com.tonycube.slidingtabsdemo.tab.BaseFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FoodFragment extends BaseFragment {
	
	private static final String DATA_NAME = "name";
	
	private String title = "";
	
	public static FoodFragment newInstance(String title, int indicatorColor,
            int dividerColor) {
		DLog.d("FoodFragment - newInstance");
		FoodFragment f = new FoodFragment();
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
		DLog.d("FoodFragment - onActivityCreated");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DLog.d("FoodFragment - onCreate");
		
		//get data
		title = getArguments().getString(DATA_NAME);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		DLog.d("FoodFragment - onCreateView");
		
		//layout
		View view = inflater.inflate(R.layout.frg_common, container, false);
		
		//view
		TextView txtName = (TextView) view.findViewById(R.id.txtName);
		txtName.setText(title);
		
		return view;
	}



	@Override
	public void onDestroy() {
		DLog.d("FoodFragment - onDestroy");
		super.onDestroy();
	}



	@Override
	public void onDestroyView() {
		DLog.d("FoodFragment - onDestroyView");
		super.onDestroyView();
	}
	
	
	
}
