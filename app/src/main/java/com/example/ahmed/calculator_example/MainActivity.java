package com.example.ahmed.calculator_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView t1;

    String equation ="" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView3);

    }



    public  void click(View view){


        switch (view.getId()){

            case R.id.button3 :

                equation = t1.getText().toString() + "1" ;

                t1.setText(equation);

                break;


            case R.id.button2 :

                equation = t1.getText().toString() + "2" ;

                t1.setText(equation);

                break;


            case R.id.button :

                equation = t1.getText().toString() + "3" ;

                t1.setText(equation);

                break;

            case R.id.button6 :

                equation = t1.getText().toString() + "4" ;

                t1.setText(equation);

                break;

            case R.id.button5 :

                equation = t1.getText().toString() + "5" ;

                t1.setText(equation);

                break;

            case R.id.button4 :

                equation = t1.getText().toString() + "6" ;

                t1.setText(equation);

                break;

            case R.id.button9 :

                equation = t1.getText().toString() + "7" ;

                t1.setText(equation);

                break;

            case R.id.button8 :

                equation = t1.getText().toString() + "8" ;

                t1.setText(equation);

                break;

            case R.id.button7 :

                equation = t1.getText().toString() + "9" ;

                t1.setText(equation);

                break;

            case R.id.button11 :

                equation = t1.getText().toString() + "0" ;

                t1.setText(equation);

                break;

            case R.id.button15 :

                calculate();
                break;

            case R.id.button12 :

                equation = t1.getText().toString() + "+" ;

                t1.setText(equation);
                break;

            case R.id.button10 :

                equation = t1.getText().toString() + "-" ;

                t1.setText(equation);
                break;

            case R.id.button13 :

                String str = t1.getText().toString();

                equation = str.substring(0,str.length()-1) ;

                t1.setText(equation);
                break;

        }


    }



    private  void calculate(){

        String equ = t1.getText().toString();

        int sum=0;
        int temp=0;
        int sign =1;

        for (int i=0 ; i < equ.length() ; i++){

            char c = equ.charAt(i);

            if (c=='+'){

                sum += (sign * temp);
                temp=0;
                sign=1;

            }
            else if (c=='-'){

                sum += (sign * temp);
                temp=0;
                sign= -1;
            }
            else{

                int x = Integer.parseInt(String.valueOf(c));

                temp = temp*10 + x;

            }
        }

        sum += (sign * temp);


        t1.setText(String.valueOf(sum));

    }


}
