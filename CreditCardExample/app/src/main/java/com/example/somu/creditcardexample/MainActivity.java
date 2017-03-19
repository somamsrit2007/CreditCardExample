package com.example.somu.creditcardexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1,editText2,editText3,editText4,editText5;
    TextView textView,textView1,textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editText=(EditText)findViewById(R.id.edit);
        textView=(TextView)findViewById(R.id.text);
        editText1=(EditText)findViewById(R.id.edit1);
        textView1=(TextView)findViewById(R.id.text1);
        editText2=(EditText)findViewById(R.id.edit2);
        textView2=(TextView)findViewById(R.id.text2);
        editText3=(EditText)findViewById(R.id.edit3);
        textView3=(TextView)findViewById(R.id.text3);
        editText4=(EditText)findViewById(R.id.edit4);
        textView4=(TextView)findViewById(R.id.text4);
        editText5=(EditText)findViewById(R.id.edit5);
        textView5=(TextView)findViewById(R.id.text5);
    }
}
