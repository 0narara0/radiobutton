package com.cmy.www.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onclickwidget(View view){
        int id = view.getId();
        String text;
        TextView textView = (TextView)findViewById(R.id.textview);

        switch (id){
            case R.id.radiobutton01:
                text = ((RadioButton)view).getText().toString() + "-" + ((RadioButton)view).isChecked();
//                text = text + "-"+((RadioButton)view).isChecked();
                break;
            case R.id.radiobutton02:
                text = ((RadioButton)view).getText().toString() + "-" + ((RadioButton)view).isChecked();
//                text = text + "-"+((RadioButton)view).isChecked();
                break;
            case R.id.checkbox1:
                text = ((CheckBox)view).getText().toString()+ "-" + ((CheckBox)view).isChecked();
                break;
            case R.id.checkbox2:
                text= ((CheckBox)view).getText().toString()+ "-" + ((CheckBox)view).isChecked();
                break;
                default:
                    text = "Nothing!";
        }
          textView.setText(text);


//        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();

    }


}
