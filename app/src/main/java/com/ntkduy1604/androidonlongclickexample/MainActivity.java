package com.ntkduy1604.androidonlongclickexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView = (TextView) findViewById(R.id.long_click_text_view);

        //Response on a long click
        txtView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v){
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(),"You have pressed it long :)", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        //Response on a short or normal click
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Not Long Enough :(",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
