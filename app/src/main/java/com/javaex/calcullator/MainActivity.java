package com.javaex.calcullator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //field

    private TextView txtResult;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiple;
    private Button btnDivide;
    private Button btnEquation;
    private Button btnClear;

    String num1 = "";
    String num2 = "";
    String history = "";
    String plus = "";
    String minus = "";
    String multiple = "";
    String divide = "";
    String symbol = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View.OnClickListener listener = new View.OnClickListener() {



            @Override
            public void onClick(View view) {

                Log.d("javaStudy","클릭이벤트 확인");
                Log.d("javaStudy",""+view.getId());

                switch (view.getId()) {

                    case R.id.btn1:

                        Log.d("javaStudy","btn1 버튼 클릭" + R.id.btn1);

                        txtResult.setText(txtResult.getText().toString() + 1);

                        break;

                    case R.id.btn2:

                        txtResult.setText(txtResult.getText().toString() + 2);

                        break;

                    case R.id.btn3:

                        txtResult.setText(txtResult.getText().toString() + 3);

                        break;

                    case R.id.btn4:

                        txtResult.setText(txtResult.getText().toString() + 4);

                        break;

                    case R.id.btn5:

                        txtResult.setText(txtResult.getText().toString() + 5);

                        break;

                    case R.id.btn6:

                        txtResult.setText(txtResult.getText().toString() + 6);

                        break;

                    case R.id.btn7:

                        txtResult.setText(txtResult.getText().toString() + 7);

                        break;

                    case R.id.btn8:

                        txtResult.setText(txtResult.getText().toString() + 8);

                        break;

                    case R.id.btn9:

                        txtResult.setText(txtResult.getText().toString() + 9);

                        break;

                    case R.id.btn0:

                        txtResult.setText(txtResult.getText().toString() + 0);

                        break;

                    case R.id.btnClear:

                        txtResult.setText("");

                    case R.id.btnPlus:

                        num1 = txtResult.getText().toString();
                        history = txtResult.getText().toString() + "+";
                        txtResult.setText(history);

                        symbol = plus;

                        break;

                    case R.id.btnMinus:

                        num1 = txtResult.getText().toString();
                        history = txtResult.getText().toString() + "-";

                        symbol = minus;

                        break;

                    case R.id.btnMultiple:

                        num1 = txtResult.getText().toString();
                        history = txtResult.getText().toString() + "*";

                        symbol = multiple;

                        break;

                    case R.id.btnDivide:

                        num1 = txtResult.getText().toString();
                        history = txtResult.getText().toString() + "/";

                        symbol = divide;

                        break;

                    case R.id.btnEquation:

                        int result = 0;

                        num2 = txtResult.getText().toString();

                        int n1 = Integer.parseInt(num1);
                        int n2 = Integer.parseInt(num2);

                        history = history + txtResult.getText().toString();
                        txtResult.setText(history);

                        if (symbol == plus) {

                            result = n1+n2;
                            txtResult.setText("" + result);

                        }

                        num1 = txtResult.getText().toString();

                        break;




















                }


            }
        };

        txtResult = (TextView) findViewById(R.id.txtResult);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiple = (Button) findViewById(R.id.btnMultiple);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnEquation = (Button) findViewById(R.id.btnEquation);
        btnClear = (Button) findViewById(R.id.btnClear);

        txtResult.setOnClickListener(listener);
        btn0.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btnPlus.setOnClickListener(listener);
        btnMinus.setOnClickListener(listener);
        btnMultiple.setOnClickListener(listener);
        btnDivide.setOnClickListener(listener);
        btnEquation.setOnClickListener(listener);
        btnClear.setOnClickListener(listener);

        txtResult = (TextView) findViewById(R.id.txtResult);









    }
}