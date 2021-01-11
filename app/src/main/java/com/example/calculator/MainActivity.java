package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    private EditText display;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });

    }

    private void updateText(String strToAdd){
        String oldString = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftString = oldString.substring(0, cursorPos);
        String rightString = oldString.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftString, strToAdd, rightString));

    }


    public void zeroBTN(View view){
        updateText("0");
    }

    public void oneBTN(View view){
        updateText("1");
    }

    public void twoBTN(View view){
        updateText("2");
    }

    public void threeTBN(View view){
        updateText("3");
    }

    public void fourBTN(View view){
        updateText("4");
    }

    public void fiveBTN(View view){
        updateText("5");
    }

    public void sixBTN(View view){
        updateText("6");
    }

    public void sevenBTN(View view){
        updateText("7");
    }

    public void eigthBTN(View view){
        updateText("8");
    }

    public void nineBTN(View view){
        updateText("9");
    }

    public void addBTN(View view){
        updateText("+");
    }

    public void subtractBTN(View view){
        updateText("-");
    }

    public void multiplyBTN(View view){
        updateText("*");
    }

    public void divideBTN(View view){
        updateText("/");
    }

    public void clearBTN(View view){
        updateText("");
    }

    public void bracketsBTN(View view){
        updateText("");
    }

    public void equalsBTN(View view){

    }

    public void pointBTN(View view){
        updateText(".");
    }

    public void backspaceBTN(View view){

    }



}