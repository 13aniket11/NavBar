package com.example.navbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navbar.R;
import com.example.navbar.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity {
    private TextView status;
    private Button start , stop ;
    public int flg=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        status = findViewById(R.id.status);
        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flg=1;
                status.setText("Connected");
                status.setTextColor(Color.parseColor("#008037"));
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flg=0;
                status.setText("Disconnected");
                status.setTextColor(Color.parseColor("#FF1616"));
            }
        });
    }

}
