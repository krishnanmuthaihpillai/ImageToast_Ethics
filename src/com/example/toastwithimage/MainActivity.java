package com.example.toastwithimage;

import com.example.mediavolume.R;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//				int currentVolume = audio.getStreamVolume(AudioManager.STREAM_MUSIC);
//				Log.d("mediavolume", ""+currentVolume+"");
//				Toast.makeText(getApplicationContext(), ""+currentVolume+"", Toast.LENGTH_LONG).show();
				
				
				
				Toast toast = new Toast(getApplicationContext());
			    ImageView view = new ImageView(getApplicationContext()); 
			    view.setImageResource(R.drawable.bluetooth); 
			    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
			    toast.setDuration(Toast.LENGTH_LONG);
			    toast.setView(view); 
			    toast.show();
				
			}
		});
	}

}
