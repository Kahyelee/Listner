package com.example.kahye.myapplication1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
                                                      //Activity Listener
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this.getApplication().getApplicationContext();
        bt = (Button) this.findViewById(R.id.button);
        /* 익명 inner class의 임시 객체 사용
        bt.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(mContext, "Click Button", Toast.LENGTH_LONG).show();
            }
        });
*/

        bt.setOnClickListener(this);
    }
        @Override
        public  void onClick(View v) {
            if (v == (Button) bt) {
                Toast.makeText(mContext, "Click Button", Toast.LENGTH_LONG).show();

            }
        }
}