package com.example.swiperanimactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SlideSecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slide_second);
		
		Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {  
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SlideSecondActivity.this, MainActivity.class);
                startActivity(intent);
                //�����л����������ұ߽��룬����˳�
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);                
            }
        });
	}
}