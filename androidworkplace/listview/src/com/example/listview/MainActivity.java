package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
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
		
		final ListView listview=(ListView) findViewById(R.id.listView1);
		
		ViewGroup group=(ViewGroup) getLayoutInflater().inflate(R.layout.footer, null);
//		listview.addFooterView(v);
		
		Button button=(Button) group.findViewById(R.id.button1);
		final EditText editText=(EditText) group.findViewById(R.id.editText1);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				String indexString=editText.getText().toString();
				listview.setSelection(Integer.valueOf(indexString));
			}
		});
		
		listview.addHeaderView(group);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ss);
		listview.setAdapter(adapter);
	}
}
