package com.example.lab2_20202152_salvador;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.lab2_20202152_salvador.bean.Calculadora;

public class MainActivity4 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent1 = getIntent();
        String texto = intent1.getStringExtra("texto");

        TextView textView = findViewById(R.id.historialscrol);
        textView.setText(texto);

    }
    public void retroceder3(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

}
