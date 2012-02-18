package com.wearejustlearning.timetable;


import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TimetableActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    Button button;
    TextView label;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        button.setOnClickListener(this);
        button = (Button)findViewById(R.id.button);
        setTime();
        

    }
    
    public void setTime(){
    	TextView label;
    	label = (TextView)findViewById(R.id.textLabel);
    	
        String currentDateTimeString = SimpleDateFormat.getDateInstance().format(new Date());  
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");  
        String formattedDateString = formatter.format(currentDateTimeString);
    	label.setText(formattedDateString);
    }

	public void onClick(View view) {
		setTime();
		
	}
}