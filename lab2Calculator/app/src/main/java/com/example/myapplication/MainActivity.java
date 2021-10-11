package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void additionFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String num1 = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String num2 = secondNumber.getText().toString();
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);
        int answer = (firstNum + secondNum);
        String str = ""+answer;
        goToActivity2(str);
    }

    public void subtractionFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String num1 = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String num2 = secondNumber.getText().toString();
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);
        int answer = (firstNum - secondNum);
        String str = ""+answer;
        goToActivity2(str);
    }

    public void multiplyFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String num1 = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String num2 = secondNumber.getText().toString();
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);
        int answer = (firstNum * secondNum);
        String str = ""+answer;
        goToActivity2(str);
    }

    public void divideFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        String num1 = firstNumber.getText().toString();
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String num2 = secondNumber.getText().toString();
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);
        Float answer = ((float)firstNum / secondNum);
        String str = ""+answer;
        goToActivity2(str);
    }

    private void goToActivity2(String str) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", str);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
