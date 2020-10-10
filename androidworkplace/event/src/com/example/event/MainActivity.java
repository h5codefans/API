package com.example.event;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//����1
		Button button=(Button)findViewById(R.id.button1);
		Button button2=(Button)findViewById(R.id.button2);
		Button button3=(Button)findViewById(R.id.button3);
//		button.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(MainActivity.this, "button�������", Toast.LENGTH_SHORT).show();
//			}
//		});
		button.setOnClickListener(myListener);
		button2.setOnClickListener(myListener);
		button3.setOnClickListener(myListener);
	}
	
			//����2�����÷�ʽ������ť��ֻ���ڵ���¼���
			//	public void test(View view){
			//		view.setX(view.getX()+10);
			//	}
	
	
		//����3������
		private View.OnClickListener myListener=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch(v.getId()){
					case R.id.button1:
						Toast.makeText(MainActivity.this, "button1�������", Toast.LENGTH_SHORT).show();
						break;
					case R.id.button2:
						Toast.makeText(MainActivity.this, "button2�������", Toast.LENGTH_SHORT).show();
						break;
					case R.id.button3:
						Toast.makeText(MainActivity.this, "button3�������", Toast.LENGTH_SHORT).show();
						break;
				}
			}
		};

}
