package com.example.handlertestactivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class HandlerTestActivity extends Activity {
	private TextView tv;
	private static final int UPDATE = 0;
	private Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			// TODO ������Ϣ����ȥ����UI�߳��ϵĿؼ�����
			if (msg.what == UPDATE) {
				// Bundle b = msg.getData();
				// tv.setText(b.getString("num"));
				tv.setText(String.valueOf(msg.obj));
			}
			super.handleMessage(msg);
		}
	};

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tv = (TextView) findViewById(R.id.tv);

		new Thread() {
			@Override
			public void run() {
				// TODO ���߳���ͨ��handler������Ϣ��handler���գ���handlerȥ����TextView��ֵ
				try {
					for (int i = 0; i < 100; i++) {
						Thread.sleep(500);
						Message msg = new Message();
						msg.what = UPDATE;
						// Bundle b = new Bundle();
						// b.putString("num", "���º��ֵ��" + i);
						// msg.setData(b);
						msg.obj = "���º��ֵ��" + i;
						handler.sendMessage(msg);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

}

