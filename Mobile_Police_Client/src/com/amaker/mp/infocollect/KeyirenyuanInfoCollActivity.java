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
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class KeyirenyuanInfoCollActivity extends Activity {

	private EditText keyixingmingEditText, keyiidEditText, faxiandidianEditText, keyidizhiEditText, keyixingweiEditText;
	private RadioGroup sexRadioGroup;
	private RadioButton keyixingbieRadioBtn;
	private Button cancelBtn,submitBtn;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.keyirenyuan_info_collect);
		setTitle("可疑人员信息采集");
		
		keyixingmingEditText = (EditText)findViewById(R.id.keyixingming);
		keyiidEditText = (EditText)findViewById(R.id.keyiid);	
		keyixingweiEditText = (EditText)findViewById(R.id.keyixingwei);
		faxiandidianEditText = (EditText)findViewById(R.id.faxiandidian);
		keyidizhiEditText = (EditText)findViewById(R.id.keyidizhi);
		sexRadioGroup = (RadioGroup)findViewById(R.id.sex);
		
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
					showAlert("输入错误，请检查后重新输入！");
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
		String kyxm = keyixingmingEditText.getText().toString();
		String kyid = keyiidEditText.getText().toString();
		String kyxw = keyixingweiEditText.getText().toString();
		String fxdd = faxiandidianEditText.getText().toString();
		String kydz = keyidizhiEditText.getText().toString();
		
		//获取性别的值
		keyixingbieRadioBtn = (RadioButton)findViewById(sexRadioGroup.getCheckedRadioButtonId());
		String kyxb = keyixingbieRadioBtn.getText().toString();
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		
		Date date = new Date();
		String dateStr = new SimpleDateFormat("yy-MM-dd HH:mm", Locale.getDefault()).format(date);
		
		
		params.add(new BasicNameValuePair("keYiXingMing", kyxm));
		params.add(new BasicNameValuePair("keYiID", kyid));
		params.add(new BasicNameValuePair("keYiXingWei", kyxw));
		params.add(new BasicNameValuePair("faXianDiDian", fxdd));
		params.add(new BasicNameValuePair("keYiDiZhi", kydz));
		params.add(new BasicNameValuePair("keYiXingBie", kyxb));
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
		String url = HttpUtil.BASE_URL+"servlet/KeYiRenYuanServlet";
		
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
