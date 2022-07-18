package com.suranjana.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberOne, numberTwo;
    Button add, subtract, multiply;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();


        numberOne = findViewById(R.id.numberOne);
        numberTwo = findViewById(R.id.numberTwo);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        resultView = findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstNumberString = numberOne.getText().toString();
                String secondNumberString = numberTwo.getText().toString();

                int firstNumber = getIntFromString(firstNumberString);
                int secondNumber = getIntFromString(secondNumberString);

                int result = addTwoNumbers(firstNumber,secondNumber);

                resultView.setText(getStringFromInt(result));

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstNumberString = numberOne.getText().toString();
                String secondNumberString = numberTwo.getText().toString();

                int firstNumber = getIntFromString(firstNumberString);
                int secondNumber = getIntFromString(secondNumberString);

                int result = subtractTwoNumbers(firstNumber, secondNumber);

                resultView.setText(getStringFromInt(result));

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String firstNumberString = numberOne.getText().toString();
                String secondNumberString = numberTwo.getText().toString();

                int firstNumber = getIntFromString(firstNumberString);
                int secondNumber = getIntFromString(secondNumberString);

                int result = multiplyTwoNumbers(firstNumber, secondNumber);

                resultView.setText(getStringFromInt(result));
            }
        });
    }

    int addTwoNumbers(int a, int b){
        return a+b;
    }

    int subtractTwoNumbers(int a, int b){
        int tempMax, tempMin = 0;
        tempMax = Math.max(a, b);
        tempMin = Math.min(a,b);
        return tempMax - tempMin;
    }

    int multiplyTwoNumbers(int a, int b){
        return a*b;
    }

    String getStringFromInt(int value){
        return String.valueOf(value);
    }

    int getIntFromString(String string){
        return Integer.parseInt(string);
    }
}
