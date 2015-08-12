package com.tonycube.slidingtabsdemo.fragment;

import com.tonycube.slidingtabsdemo.R;
import com.tonycube.slidingtabsdemo.log.DLog;
import com.tonycube.slidingtabsdemo.tab.BasicFragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BookFragment extends BasicFragment {
	
	private static final String DATA_NAME = "name";
	
	private String title = "";
	
	public static BookFragment newInstance(String title, int indicatorColor, int dividerColor, int iconResId) {
		DLog.d("BookFragment - newInstance");
		BookFragment f = new BookFragment();
		f.setTitle(title);
		f.setIndicatorColor(indicatorColor);
		f.setDividerColor(dividerColor);
		f.setIconResId(iconResId);

		
		//pass data
		Bundle args = new Bundle();
        args.putString(DATA_NAME, title);
        f.setArguments(args);
		
        return f;
    }
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DLog.d("BookFragment - onCreate");
		
		//get data
		title = getArguments().getString(DATA_NAME);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		DLog.d("BookFragment - onCreateView");
		return inflater.inflate(R.layout.frg_common, container, false);
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		DLog.d("BookFragment - onViewCreated");
		TextView txtName = (TextView) view.findViewById(R.id.txtName);
		txtName.setText(title);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		DLog.d("BookFragment - onActivityCreated");
	}

	@Override
	public void onDestroy() {
		DLog.d("BookFragment - onDestroy");
		super.onDestroy();
	}



	@Override
	public void onDestroyView() {
		DLog.d("BookFragment - onDestroyView");
		super.onDestroyView();
	}
	
	
	
}
