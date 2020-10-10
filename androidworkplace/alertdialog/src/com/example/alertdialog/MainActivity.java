package com.example.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void test01(View view){
		//��δ���һ��AlertDialog
		//1.DlertDialog.Builder
		//2.builder.create() ����һ��AlertDialog����
		//3.dialog.show()
		AlertDialog.Builder builder=new Builder(this);
		builder.setTitle("��ʾ��Ϣ����");
		builder.setMessage("�ҵĵ�һ���Ի���");
		builder.setPositiveButton("����", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "����", 0).show();
			}
		});
		builder.setNegativeButton("������", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "������", 0).show();
			}
		});
		builder.setNeutralButton("һ��", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "һ��", 0).show();
			}
		});
		AlertDialog alertDialog=builder.create();
		alertDialog.show();
	}
	
	
	private String[] ss=new String[]{
			"����",
			"�Ϻ�",
			"����"
	};
	public void test02(View view){
		AlertDialog.Builder builder=new Builder(this);
		builder.setTitle("��ʾ��Ϣ����");
		builder.setItems(ss, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, ss[which], 0).show();
			}
		});
		AlertDialog alertDialog=builder.create();
		alertDialog.show();
	}
	
	public void test03(View view){
		AlertDialog.Builder builder=new Builder(this);
		builder.setTitle("��ʾ��Ϣ����");
		builder.setSingleChoiceItems(ss, 0, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, ss[which], 0).show();
			}
		});
		AlertDialog alertDialog=builder.create();
		alertDialog.show();
	}
	
	public void test04(View view){
		AlertDialog.Builder builder=new Builder(this);
		builder.setTitle("��ʾ��Ϣ����");
		builder.setMultiChoiceItems(ss, new boolean[]{true,false,true}, new OnMultiChoiceClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which, boolean isChecked) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, ss[which], 0).show();
			}
		});
		AlertDialog alertDialog=builder.create();
		alertDialog.show();
	}
	
	public void test05(View view){
		AlertDialog.Builder builder=new Builder(this);
		
		builder.setTitle("��¼����");
		
		View login=this.getLayoutInflater().inflate(R.layout.login, null);
		builder.setView(login);
		AlertDialog alertDialog=builder.create();
		alertDialog.show();
	}
}
