package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
	private String[] ss=new String[]{
			"����",
			"����",
			"�Ϻ�",
			"����",
			"����",
			"����",
			"����",
			"���",
			"����",
			"����",
			"����",
			"�˲�",
			"�麣",
			"����",
			"ɽ��",
			"ɽ��",
			"��ɳ",
			"����",
			"����",
			"����",
			"����",
			"����",
			"����",
			"�ǿ�",
			"���",
			"����"
			
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		ListView listview=(ListView) findViewById(R.id.listView1);
	}
}
