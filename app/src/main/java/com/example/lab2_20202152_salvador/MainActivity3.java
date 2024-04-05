package com.example.lab2_20202152_salvador;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.lab2_20202152_salvador.bean.Calculadora;
public class MainActivity3 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
    public void historialBoton(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void retroceder2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
