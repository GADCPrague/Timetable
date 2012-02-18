package com.wearejustlearning.timetable;


import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TimetableActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView label = (TextView)findViewById(R.id.label);
        String currentDateTimeString = SimpleDateFormat.getDateInstance().format(new Date());  
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");  
        String formattedDateString = formatter.format(currentDateTimeString);
        label.setText(formattedDateString);
    }
}