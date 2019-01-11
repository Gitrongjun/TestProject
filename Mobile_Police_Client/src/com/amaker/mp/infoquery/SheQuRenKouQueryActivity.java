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

public class SheQuRenKouQueryActivity extends Activity {
	
	private EditText chaxunEditText;
	private Button infoBtn;
	private TextView resultTextView;
	private RadioGroup chaxunleixingRadioGroup;
	private RadioButton chaxunleixingRadioButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shequrenkou_query);
		
		chaxunEditText = (EditText)findViewById(R.id.chaxunneirong);
		resultTextView = (TextView)findViewById(R.id.resultinfo);
//		cheliangImageView = (ImageView)findViewById(R.id.cheliangzhaopian);
//		
        chaxunleixingRadioGroup = (RadioGroup)findViewById(R.id.chaxunleixing);
//		
		infoBtn = (Button)findViewById(R.id.infobtn);
		infoBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(validate()){
					chaxunleixingRadioButton = (RadioButton)findViewById(chaxunleixingRadioGroup.getCheckedRadioButtonId());
					String chaxunleixing = chaxunleixingRadioButton.getText().toString().trim();//����Ҫ��trim�������޷���ȷʶ��ѡ������
					String queryKind;
					if (chaxunleixing.equals("�����֤��ѯ")) {
						queryKind = "sfz";
						Log.e("���֤", chaxunleixing);
					}else{
						queryKind = "xm";
						Log.e("����", chaxunleixing);
					}
					String idno = chaxunEditText.getText().toString().trim();
					String msg = query(idno, queryKind);
					if(msg!=null && !msg.equals("")){
						resultTextView.setText(msg);
					}
					else{
						resultTextView.setText("û�й��ڸ���Ա����ػ�����Ϣ��");
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
		builder.setMessage("���������������֤�ţ�")
		       .setCancelable(false)
		       .setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
	}
	
	private String query(String num, String queryKind){
		if (queryKind == "sfz"){
			String queryString = "shenFengZheng="+num;
			String url = HttpUtil.BASE_URL+"servlet/SheQuRenKouQueryServlet?"+queryString;
			return HttpUtil.queryStringForPost(url);
		}else{
			String queryString = "xingMing="+num;
			String url = HttpUtil.BASE_URL+"servlet/SheQuRenKouQueryServlet?"+queryString;
			return HttpUtil.queryStringForPost(url);
		}
		
		
    }
}