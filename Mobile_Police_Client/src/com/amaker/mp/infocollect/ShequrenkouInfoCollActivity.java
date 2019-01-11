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
import android.widget.Spinner;

public class ShequrenkouInfoCollActivity extends Activity {

	private EditText juzhudizhiEditText, huzhuxingmingEditText, huzhuidEditText, juzhurenshuEditText;
	private Spinner juzhuleixingSpinner, yuhuzhuguanxiSpinner;
	private Button cancelBtn,submitBtn;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shequrenkou_info_collect);
		setTitle("社区人口信息采集");
		
		juzhudizhiEditText = (EditText)findViewById(R.id.juzhudizhi);
		huzhuxingmingEditText = (EditText)findViewById(R.id.huzhuxingming);	
		huzhuidEditText = (EditText)findViewById(R.id.huzhuid);
		juzhurenshuEditText = (EditText)findViewById(R.id.juzhurenshu);
		juzhuleixingSpinner = (Spinner)findViewById(R.id.xinxileixing);
		yuhuzhuguanxiSpinner = (Spinner)findViewById(R.id.yuhuzhuguanxi);
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
		String jzdz = juzhudizhiEditText.getText().toString();
		String hzxm = huzhuxingmingEditText.getText().toString();
		String hzid = huzhuidEditText.getText().toString();
		String jzrs = juzhurenshuEditText.getText().toString();
		
		String jzlx = juzhuleixingSpinner.getSelectedItem().toString();
		String yhzgx = yuhuzhuguanxiSpinner.getSelectedItem().toString();
		
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		
		Date date = new Date();
		String dateStr = new SimpleDateFormat("yy-MM-dd HH:mm", Locale.getDefault()).format(date);
		
		
		params.add(new BasicNameValuePair("juZhuDiZhi", jzdz));
		params.add(new BasicNameValuePair("huZhuXingMing", hzxm));
		params.add(new BasicNameValuePair("huZhuID", hzid));
		params.add(new BasicNameValuePair("juZhuRenShu", jzrs));
		params.add(new BasicNameValuePair("juZhuLeiXing", jzlx));
		params.add(new BasicNameValuePair("yuHuZhuGuanXi", yhzgx));
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
		String url = HttpUtil.BASE_URL+"servlet/SheQuRenKouServlet";
		
		HttpPost request = HttpUtil.getHttpPost(url);
		request.setEntity(makeEntity());
		
		String result= HttpUtil.queryStringForPost(request);
		if(result!=null&&result.equals("1"))return true;
		
		return false;
	}



	private boolean validate() {
		// TODO Auto-generated method stub
		try {
			String jzrs = juzhurenshuEditText.getText().toString();
			int num = Integer.valueOf(jzrs);
		} catch (NumberFormatException e){
			return false;
		}
		return true;
	}
}
