package com.amaker.mp.infoquery;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.amaker.mp.R;
import com.amaker.util.HttpUtil;

public class BeiDaoCheLiangQueryActivity extends Activity {
	
	private EditText chaxunEditText;
	private Button infoBtn,picBtn;
	private TextView resultTextView;
	private ImageView cheliangImageView;
	private RadioGroup chaxunleixingRadioGroup;
	private RadioButton chaxunleixingRadioButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.beidaocheliang_query);
		
		chaxunEditText = (EditText)findViewById(R.id.chaxunneirong);
		resultTextView = (TextView)findViewById(R.id.resultinfo);
		cheliangImageView = (ImageView)findViewById(R.id.cheliangzhaopian);
		
		chaxunleixingRadioGroup = (RadioGroup)findViewById(R.id.chaxunleixing);
		
		infoBtn = (Button)findViewById(R.id.infobtn);
		infoBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(validate()){
					chaxunleixingRadioButton = (RadioButton)findViewById(chaxunleixingRadioGroup.getCheckedRadioButtonId());
					String chaxunleixing = chaxunleixingRadioButton.getText().toString().trim();//必须要加trim，否则无法正确识别选择类型
					String queryKind;
					if (chaxunleixing.equals("按车牌号查询")) {
						queryKind = "cph";
						Log.e("车牌号查询", chaxunleixing);
					}else{
						queryKind = "fdj";
						Log.e("按发动机号查询！", chaxunleixing);
					}
					String idno = chaxunEditText.getText().toString().trim();
					String msg = query(idno, queryKind);
					if(msg!=null && !msg.equals("")){
						resultTextView.setText(msg);
					}
					else{
						resultTextView.setText("没有关于此号码的被盗车辆信息！");
						cheliangImageView.setImageBitmap(null);
					}
						
				}
			}
		});
		
		picBtn = (Button)findViewById(R.id.picbtn);
		picBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(validate()){
					chaxunleixingRadioButton = (RadioButton)findViewById(chaxunleixingRadioGroup.getCheckedRadioButtonId());
					String chaxunleixing = chaxunleixingRadioButton.getText().toString().trim();
					String queryKind;
					if (chaxunleixing.equals("按车牌号查询")) {
						queryKind = "cph";
					}else{
						queryKind = "fdj";
					}
					String idno = chaxunEditText.getText().toString().trim();
					String picPath = queryPicPath(idno, queryKind);
					if (picPath != null && !picPath.equals("")){
						String urlStr = HttpUtil.BASE_URL + picPath;
						Log.e("mylog", "开始显示图片");
						showPic(urlStr);					
					}else{
						showAlert("没有发现对应的照片信息！");
					}
				}
			}
		});
	}
	
	private void showPic(String urlStr){
		try {
			URL url = new URL(urlStr);
			URLConnection conn = url.openConnection();
			conn.connect();
			InputStream in = conn.getInputStream();
			Bitmap map = BitmapFactory.decodeStream(in);
			cheliangImageView.setImageBitmap(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean  validate(){
		String no = chaxunEditText.getText().toString();
		if(no==null||no.equals("")){
			showAlert("请输入发动机号或车牌号！");
			return false;
		}
		return true;
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
	
	private String queryPicPath(String num, String queryKind){  
		if (queryKind == "cph"){
			String queryString = "chePaiHao="+num;
			String url = HttpUtil.BASE_URL+"servlet/BeiDaoCheImgQueryServlet?"+queryString;
			return HttpUtil.queryStringForPost(url);
		}else{
			String queryString = "faDongJiHao="+num;
			String url = HttpUtil.BASE_URL+"servlet/BeiDaoCheImgQueryServlet?"+queryString;
			return HttpUtil.queryStringForPost(url);
		}
    }
	
	private String query(String num, String queryKind){   
		if (queryKind == "cph"){
			String queryString = "chePaiHao="+num;
			String url = HttpUtil.BASE_URL+"servlet/BeiDaoCheQueryServlet?"+queryString;
			return HttpUtil.queryStringForPost(url);
		}else{
			String queryString = "faDongJiHao="+num;
			String url = HttpUtil.BASE_URL+"servlet/BeiDaoCheQueryServlet?"+queryString;
			return HttpUtil.queryStringForPost(url);
		}
		
		
    }
}