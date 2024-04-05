package com.example.lab2_20202152_salvador;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.lab2_20202152_salvador.bean.Calculadora;
public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*Intent intent1 = getIntent();
        String indicacionestext =intent1.getStringExtra("indicaciones");

        TextView textView = findViewById(R.id.indicaciones);
        textView.setText(indicacionestext);*/

        Button buttonCalcular = findViewById(R.id.calcularBoton);
        buttonCalcular.setOnClickListener(view -> {
            finish();
        });
    }

}
