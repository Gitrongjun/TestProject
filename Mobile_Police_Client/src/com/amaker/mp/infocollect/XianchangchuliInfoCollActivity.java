package com.amaker.mp.infocollect;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import com.amaker.mp.R;
import com.amaker.util.HttpUtil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class XianchangchuliInfoCollActivity extends Activity {

	private EditText fashengdidianEditText, xiangxixinxiEditText, dangshirenEditText, dangshirenidEditText;
	private Spinner weifaleixingSpinner, chufaleixingSpinner;
	private Button cancelBtn,submitBtn;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xianchangchuli_info_collect);
		setTitle("现场违法处理");
		
		fashengdidianEditText = (EditText)findViewById(R.id.fashengdidian);
		xiangxixinxiEditText = (EditText)findViewById(R.id.xiangxixinxi);	
		weifaleixingSpinner = (Spinner)findViewById(R.id.weifaleixing);
		chufaleixingSpinner = (Spinner)findViewById(R.id.chufaleixing);
		dangshirenEditText = (EditText)findViewById(R.id.dangshiren);
		dangshirenidEditText = (EditText)findViewById(R.id.dangshirenid);
		cancelBtn = (Button)findViewById(R.id.cancelButton);
		submitBtn = (Button)findViewById(R.id.submitButton);
		
		cancelBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//System.out.println("finished!");
				finish();
			}
		});
		
		submitBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(validate()){
					if(submit()){
						showAlert("信息提交成功！");
						finish();
					}else{
						showAlert("由于网络或数据库原因提交失败，请检查数据及网络设置!");
					}
				}else{
					showAlert("输入错误，请重新输入！");
				}
			}
		});
	}



	private void showAlert(String msg) {
		// TODO Auto-generated method stub
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

	private UrlEncodedFormEntity makeEntity(){
		String fsdd = fashengdidianEditText.getText().toString();
		String xxxx = xiangxixinxiEditText.getText().toString();
		String dss = dangshirenEditText.getText().toString();
		String dssid = dangshirenidEditText.getText().toString();
		
		String wflx = weifaleixingSpinner.getSelectedItem().toString();
		String cflx = chufaleixingSpinner.getSelectedItem().toString();
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		
		Date date = new Date();
		String dateStr = new SimpleDateFormat("yy-MM-dd HH:mm", Locale.getDefault()).format(date);
		
		
		params.add(new BasicNameValuePair("faShengDiDian", fsdd));
		params.add(new BasicNameValuePair("xiangXiXinXi", xxxx));
		params.add(new BasicNameValuePair("dangShiRen", dss));
		params.add(new BasicNameValuePair("dangShiRenID", dssid));
		params.add(new BasicNameValuePair("weiFaLeiXing", wflx));
		params.add(new BasicNameValuePair("chuFaLeiXing", cflx));
		params.add(new BasicNameValuePair("createTime", dateStr));
		
		
		try {
			return new UrlEncodedFormEntity(params,HTTP.UTF_8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	private boolean submit() {
		// TODO Auto-generated method stub
		String url = HttpUtil.BASE_URL+"servlet/XianChangChuLiServlet";
		
		HttpPost request = HttpUtil.getHttpPost(url);
		request.setEntity(makeEntity());
		
		String result= HttpUtil.queryStringForPost(request);
		if(result!=null&&result.equals("1"))return true;
		
		return false;
	}



	private boolean validate() {
		// TODO Auto-generated method stub
		return true;
	}
}
