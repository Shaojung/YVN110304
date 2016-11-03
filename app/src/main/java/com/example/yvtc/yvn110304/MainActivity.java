package com.example.yvtc.yvn110304;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String cities[] = {"台北", "台中", "台南", "高雄"};
    String codes[] = {"02", "04", "06", "07"};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
