package com.example.lab2_20202152_salvador.bean;
import java.io.Serializable;
public class Calculadora implements Serializable{
    private int num1;
    private int num2;

    private int respuesta;

    public Calculadora(int num1){
        this.num1= num1;
    }

    public int getNum1(){
        return num1;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum2(){
        return num2;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getRespuesta(){
        return respuesta;
    }

    public void setRespuesta(int respuesta){
        this.respuesta = respuesta;
    }

}
