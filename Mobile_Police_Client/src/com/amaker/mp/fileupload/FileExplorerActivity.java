package com.amaker.mp.fileupload;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.R.integer;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.amaker.mp.R;

public class FileExplorerActivity extends ListActivity {

	private List<String> items = null;

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.directory_list);
		//fill(new File("/").listFiles());
		fillWithSDcard();
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		int selectionRowID = (int) position;
		if (selectionRowID == 0) {
			fillWithSDcard();
		} else {
			File file = new File(items.get(selectionRowID));
			if (file.isDirectory()) {
				fill(file.listFiles());
			} else {
				String path = file.getAbsolutePath();
				Intent intent = this.getIntent();
				intent.putExtra("filePath", path);
				FileExplorerActivity.this.setResult(1, intent);
				FileExplorerActivity.this.finish();
			}
		}
	}

	private void fillWithSDcard() {
		fill(new File("/mnt/sdcard/").listFiles());
	}

	private void fill(File[] files) {
		items = new ArrayList<String>();
		items.add(getString(R.string.to_top));
		for (File file : files)
			items.add(file.getPath());
		ArrayAdapter<String> fileList = new ArrayAdapter<String>(this,
				R.layout.file_row, items);
		setListAdapter(fileList);
	}
	
	//响应返回按键,不处理的话，点击返回键将导致崩溃
	public boolean onKeyDown(int keycode, KeyEvent event){
		if (keycode == KeyEvent.KEYCODE_BACK){
			Intent intent = this.getIntent();
			FileExplorerActivity.this.setResult(RESULT_CANCELED, intent);
			FileExplorerActivity.this.finish();
		}
		
		return super.onKeyDown(keycode, event);
		
	}
}