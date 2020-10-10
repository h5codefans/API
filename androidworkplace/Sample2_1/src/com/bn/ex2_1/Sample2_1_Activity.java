package com.bn.ex2_1;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class Sample2_1_Activity extends Activity {
	private Button sendStaticButton;	//�����Զ��徲̬ע��㲥�İ�ť
	private Button sendDynamicButton;	//�����Զ��嶯̬ע��㲥�İ�ť
	private static final String STATICACTION = "com.bn.pp2.staticreceiver";	//��̬�㲥��Action�ַ���
	private static final String DYNAMICACTION = "com.bn.pp2.dynamicreceiver";	//��̬�㲥��Action�ַ���
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		sendStaticButton = (Button) findViewById(R.id.send_static);		//��ȡButton��ť����
		sendDynamicButton = (Button) findViewById(R.id.send_dynamic);
		sendStaticButton.setOnClickListener(new DIYOnClickListener());	//ΪButton��ť��Ӽ�����
		sendDynamicButton.setOnClickListener(new DIYOnClickListener());
	}
	class DIYOnClickListener implements OnClickListener{		//�ڲ���OnClick������
		public void onClick(View v) {
			if(v.getId() == R.id.send_static){		// �����Զ��徲̬ע��㲥��Ϣ
				Intent intent = new Intent();
				intent.setAction(STATICACTION);		//����Action
				intent.putExtra("msg", "���վ�̬ע��㲥�ɹ���");	//��Ӹ�����Ϣ
				sendBroadcast(intent);				//����Intent
			}
			else if(v.getId() == R.id.send_dynamic){	// �����Զ��嶯̬ע��㲥��Ϣ
				Intent intent = new Intent();
				intent.setAction(DYNAMICACTION);		//����Action
				intent.putExtra("msg", "���ն�̬ע��㲥�ɹ���");		//��Ӹ�����Ϣ
				sendBroadcast(intent);					//����Intent
	}}}
	@Override
	protected void onStart() {
		super.onStart();
		IntentFilter dynamic_filter = new IntentFilter();
		dynamic_filter.addAction(DYNAMICACTION);			//��Ӷ�̬�㲥��Action
		registerReceiver(dynamicReceiver, dynamic_filter);	// ע���Զ��嶯̬�㲥��Ϣ
	}
	
	private BroadcastReceiver dynamicReceiver 				//��̬�㲥��Receiver
	= new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			if(intent.getAction().equals(DYNAMICACTION)){	//�������
				String msg = intent.getStringExtra("msg");
				Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
}}};}