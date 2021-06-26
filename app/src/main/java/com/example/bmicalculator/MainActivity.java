package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalculate(View view) {
        EditText BMIheight = findViewById(R.id.height);
        EditText BMIweight = findViewById(R.id.weight);
        float height= Float.parseFloat(BMIheight.getText().toString());
        height*=0.0254;
        height=height*height;
        float weight=Float.parseFloat(BMIweight.getText().toString());
        result=findViewById(R.id.result);
        result.setText("Your Result: "+(weight/height));
    }
}











