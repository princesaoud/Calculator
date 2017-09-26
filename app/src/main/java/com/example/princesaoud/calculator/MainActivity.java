package com.example.princesaoud.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;
import static java.lang.String.*;

public class MainActivity extends AppCompatActivity {

    EditText number_one;
    EditText number_two;
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcul_addition(View v){
        try{
            tv_result = (TextView) findViewById(R.id.tv_result);
            number_one = (EditText) findViewById(R.id.number_one);
            number_two = (EditText) findViewById(R.id.number_two);
            int a = Integer.parseInt(number_one.getText().toString());
            int b = Integer.parseInt(number_two.getText().toString());

            switch(v.getId()){
                case 2131427424:
                    number_two.setText("");
                    number_one.setText("");
                    tv_result.setText(Integer.toString(a+b));
                    break;
                case 2131427425:
                    number_one.setText("");
                    number_two.setText("");
                    tv_result.setText(Integer.toString(a-b));
                    break;
                case 2131427426:
                    number_one.setText("");
                    number_two.setText("");
                    tv_result.setText(Integer.toString(a*b));
//                    Toast.makeText(this,Integer.toString(v.getId()),Toast.LENGTH_LONG).show();
                    break;
                case 2131427427:
                    number_one.setText("");
                    number_two.setText("");
                    tv_result.setText(Integer.toString(a/b));
                    break;

            }
        }catch (Exception e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }

    }


}
