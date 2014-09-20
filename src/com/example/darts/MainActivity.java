package com.example.darts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		
		requestWindowFeature( Window.FEATURE_NO_TITLE );
		getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
		setContentView( R.layout.activity_main );
		
		findViewById( R.id.practice ).setOnClickListener( new OnBtnClickListener() );
	}
	
	private class OnBtnClickListener implements OnClickListener {

		@Override
		public void onClick( View v ) {

			switch ( v.getId() ) {
			case R.id.practice:
			{
				Intent intent = new Intent();
				intent.setClass( getApplicationContext(), YardActivity.class );
				startActivity( intent );
				break;
			}
			default:break;
			}
		}
		
	}
}
