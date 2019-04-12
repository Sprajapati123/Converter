package com.e.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num;
    Button btncalculate;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num=findViewById(R.id.num);
        btncalculate=findViewById(R.id.btncalculate);
        display=findViewById(R.id.display);

      btncalculate.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int number;
              number= Integer.parseInt(num.getText().toString());

              Converter_sandis converter_sandis=new Converter_sandis(number);
              display.setText(converter_sandis.Words());

          }
      });

    }
}
