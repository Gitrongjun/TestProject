package com.amaker.mp.infoquery;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InfoQueryActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] menus = { "在逃人员查询", "被盗车辆查询", "交通违法查询", "社区人口信息查询" , "可疑人员查询", "治安案件查询" };
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, menus));
		getListView().setTextFilterEnabled(true);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = null;
		switch (position) {
		case 0:
			intent = new Intent(InfoQueryActivity.this,EscapedQueryActivity.class);
			startActivity(intent);
			break;
		case 1:
			intent = new Intent(InfoQueryActivity.this,BeiDaoCheLiangQueryActivity.class);
			startActivity(intent);
			break;
		case 2:
			intent = new Intent(InfoQueryActivity.this,JiaoTongWeiFaQueryActivity.class);
			startActivity(intent);
			break;
		case 3:
			intent = new Intent(InfoQueryActivity.this,SheQuRenKouQueryActivity.class);
			startActivity(intent);
			break;
		case 4:
			intent = new Intent(InfoQueryActivity.this,KeYiRenYuanQueryActivity.class);
			startActivity(intent);
			break;
		case 5:
			intent = new Intent(InfoQueryActivity.this,ZhiAnAnJianQueryActivity.class);
			startActivity(intent);
			break;
		}
	}
}