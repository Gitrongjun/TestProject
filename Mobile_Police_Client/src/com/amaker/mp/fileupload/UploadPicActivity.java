package com.amaker.mp.fileupload;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.R.integer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.amaker.mp.R;
import com.amaker.util.HttpUtil;

public class UploadPicActivity extends Activity {

	private Button submitBtn, selectBtn;
	private EditText myEditText;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.upload_pic);

		myEditText = (EditText) findViewById(R.id.picPathEditText);

		submitBtn = (Button) findViewById(R.id.submitPicButton);
		selectBtn = (Button) findViewById(R.id.selectButton);

		selectBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())){
					System.out.println("进来了！！！！！！");
					Intent intent = new Intent(UploadPicActivity.this,FileExplorerActivity.class);
					startActivityForResult(intent, 1);
				}else{
					showAlert("没有发现sdcard，请先插入sdcard后再试！");
					//return;
				}	
			}
		});
		
		submitBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String fileName = myEditText.getText().toString();
				if(!validate(fileName)){
					showAlert("您选择的图片格式无效，请重新选择！");
				}else{
					if(uploadFile(fileName).equals("1")){
						showAlert("图片上传成功！");
					}else{
						showAlert("图片上传失败，请检查网络连接是否正常!");
					}
				}
			}
		});
	}
	
	
	private String uploadFile(String fileName){
		String urlStr = HttpUtil.BASE_URL+"servlet/UploadPicServlet";

		try{
			URL url = new URL(urlStr);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			con.setRequestMethod("POST");
			
			DataOutputStream ds = new DataOutputStream(con.getOutputStream());
			File file = new File(fileName);
			
			FileInputStream fis = new FileInputStream(file);
			int bufferSize = 1024;
			byte[] buffer = new byte[bufferSize];
			int length =  -1;
			while((length = fis.read(buffer)) != -1){
				ds.write(buffer, 0, length);
			}
			
			fis.close();
			ds.flush();
			
	      /* 取得Response内容 */
	      InputStream is = con.getInputStream();
	      int ch;
	      StringBuffer b =new StringBuffer();
	      while( ( ch = is.read() ) != -1 )
	      {
	        b.append( (char)ch );
	      }
	      
	      System.out.println("服务器返回值：" + b);
	    
	      ds.close();
	      
	      return b.toString().trim();
	    }
	    catch(Exception e)
	    {
	      showAlert(""+e);
	      return ""+e;
	    }
	    
	   // return null;
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode==1){
			String path = data.getStringExtra("filePath");
			myEditText.setText(path);
		}
	}
	
	private boolean validate(String fileName){
		int idx = fileName.indexOf(".");
		if (idx == -1) {
			return false;
		}
		String subfix = fileName.substring(idx);
		System.out.println("文件后缀是：" + subfix);
		if(fileName.equals(""))return false;
		if(subfix.trim().equals(".jpg")||subfix.trim().equals(".png")||subfix.trim().equals(".bmp")){
			return true;
		}else{
			return false;
		}
	}
	
	private void showAlert(String msg){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(msg)
		       .setCancelable(false)
		       .setPositiveButton("确定", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
	}

}