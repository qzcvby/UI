package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_bt();
    }
    public void image_bt(){
        ImageButton button = findViewById(R.id.cb);
        ImageButton bt3 = findViewById(R.id.ma);
//        buttonClickListener lis_2 = new buttonClickListener();
//        bt2.setOnClickListener(lis_2);
//        buttonClickListener lis_1 = new buttonClickListener();
//        button.setOnClickListener(lis_1);
    }

    class buttonClickListener implements View.OnClickListener{

        public void onClick(View v){
            switch (v.getId()){
                case R.id.cb:
                    System.out.println(v.getId());
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                    MainActivity.this.finish();
                    break;
                case R.id.eb1:
                    System.out.println(66666);
                    break;
            }

        }
    }
}