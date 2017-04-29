package com.example.homework_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        textView1 = (TextView) findViewById(R.id.rl_1_tv);
        textView2 = (TextView) findViewById(R.id.rl_2_tv);


        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView textV1 = (TextView) findViewById(R.id.rl_1_tv_3);
        TextView textV2 = (TextView) findViewById(R.id.rl_2_tv_3);


        switch (v.getId()) {
            case R.id.rl_1_tv:
                textV2.setVisibility(View.GONE);
                if(textV1.getVisibility() == View.GONE)
                    textV1.setVisibility(View.VISIBLE);
                else textV1.setVisibility(View.GONE);
                break;
            case R.id.rl_2_tv:
                textV1.setVisibility(View.GONE);
                if(textV2.getVisibility() == View.GONE)
                    textV2.setVisibility(View.VISIBLE);
                else textV2.setVisibility(View.GONE);
                break;
        }
    }
}
