package com.mywebview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
 
public class MainActivity extends Activity  implements OnClickListener {
 
	private Button button1 ,button2;
	final Context context = this;
 
	public void onCreate(Bundle savedInstanceState) {
		
 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
 
		button1 = (Button) findViewById(R.id.buttonUrl1);
		button2 = (Button) findViewById(R.id.buttonUrl2);
 
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);  //coment
		
	}

	@Override
	public void onClick(View arg0) {
		
		int button_site = button1.getId();
		int button_go = button2.getId();
		
		Button click = (Button)arg0;
		int clickId = click.getId();
		
		if(button_site == clickId){
			 Intent intent = new Intent(context, WebViewActivity.class);
			    startActivity(intent);
		}
		if(button_go == clickId){
			
			 Intent intent = new Intent(context, WebViewActivity2.class);
			    startActivity(intent);
			
		}
	
		
	}
		
	
 
}