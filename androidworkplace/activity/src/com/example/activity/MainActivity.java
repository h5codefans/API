package com.example.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * 1.�̳�Activity��
 * 2.����onCreate
 * 3.�ں��������ļ�AndroidManifest.xml����
 * Application�ڵ��£�����activity����Ϣ��
 *         <activity
            android:name=".MainActivity"
            android:label="@string/app_name" >
        </activity>
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void test(View view){
		
		EditText editText=(EditText) findViewById(R.id.editText1);
		String uname=editText.getText().toString();
		
		Intent intent=new Intent();
		intent.setClass(this, MyActivity.class);
		
		intent.putExtra("uname", uname);
		
		this.startActivity(intent);
	}
}
