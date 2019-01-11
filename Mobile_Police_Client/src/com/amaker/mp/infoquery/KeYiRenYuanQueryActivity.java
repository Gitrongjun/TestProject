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

public class KeYiRenYuanQueryActivity extends Activity {
	
	private EditText chaxunEditText;
	private Button infoBtn;
	private TextView resultTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.keyirenyuan_query);
		
        chaxunEditText = (EditText)findViewById(R.id.chaxunneirong);
        resultTextView = (TextView)findViewById(R.id.resultinfo);

		infoBtn = (Button)findViewById(R.id.infobtn);
		infoBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(validate()){
					String idno = chaxunEditText.getText().toString().trim();
					String msg = query(idno);
					if(msg!=null && !msg.equals("")){
						resultTextView.setText(msg);
					}
					else{
						resultTextView.setText("没有关于此身份证号码的相关信息！");
					}
						
				}
			}
		});
	}
	
	private boolean  validate(){
		String no = chaxunEditText.getText().toString();
		if(no==null||no.equals("")){
			showAlert();
			return false;
		}
		return true;
	}
	
	private void showAlert(){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("请输入要查询的身份证号！")
		       .setCancelable(false)
		       .setPositiveButton("确定", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
	}
	
	private String query(String num){   
		String queryString = "shenFengZheng="+num;
		String url = HttpUtil.BASE_URL+"servlet/KeYiRenYuanQueryServlet?"+queryString;
		return HttpUtil.queryStringForPost(url);
    }
}