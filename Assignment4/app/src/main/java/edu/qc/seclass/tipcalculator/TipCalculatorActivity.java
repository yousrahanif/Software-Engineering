package edu.qc.seclass.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.widget.Toast;

public class TipCalculatorActivity extends AppCompatActivity {


    EditText cA;
    EditText pS;
    Button compute;
    EditText fifteenPercecntTip;
    EditText twentyPercecntTip;
    EditText twentyfivePercecntTip;
    EditText fifteenPercecntTotal;
    EditText twentyPercecntTotal;
    EditText twentyfivePercecntTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cA = (EditText) findViewById(R.id.checkAmountValue);
        pS = (EditText) findViewById(R.id.partySizeValue);


        fifteenPercecntTip = (EditText) findViewById(R.id.fifteenPercentTipValue);
        twentyPercecntTip = (EditText) findViewById(R.id.twentyPercentTipValue);
        twentyfivePercecntTip = (EditText) findViewById(R.id.twentyfivePercentTipValue);
        fifteenPercecntTotal = (EditText) findViewById(R.id.fifteenPercentTotalValue);
        twentyPercecntTotal = (EditText) findViewById(R.id.twentyPercentTotalValue);
        twentyfivePercecntTotal = (EditText) findViewById(R.id.twentyfivePercentTotalValue);
        compute = (Button) findViewById(R.id.buttonCompute);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!cA.getText().toString().equals("") && !pS.getText().toString().equals("")) {
                    double money = Double.parseDouble(cA.getText().toString());
                    int member = Integer.parseInt(pS.getText().toString());
                    double pay;
                    pay = money / member;


                    int tip15 = (int) Math.round((pay * 15) / 100);
                    int total15 = (int) Math.round(tip15 + pay);
                    int tip20 = (int) Math.round((pay * 20) / 100);
                    int total20 = (int) Math.round(tip20 + pay);
                    int tip25 = (int) Math.round((pay * 25) / 100);
                    int total25 = (int) Math.round(tip25 + pay);


                    fifteenPercecntTip.setText(Integer.toString(tip15));
                    twentyPercecntTip.setText(Integer.toString(tip20));
                    twentyfivePercecntTip.setText(Integer.toString(tip25));

                    fifteenPercecntTotal.setText(Integer.toString(total15));
                    twentyPercecntTotal.setText(Integer.toString(total20));
                    twentyfivePercecntTotal.setText(Integer.toString(total25));
                    InputMethodManager display = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    assert display != null;
                    display.hideSoftInputFromWindow(compute.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);


                if (pay <= 0) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Pay something", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }

                    else if (member <= 0) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Where is your members!", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }

                }

                else {

                    Toast toast = Toast.makeText(getApplicationContext(), "Empty", Toast.LENGTH_SHORT);
                    toast.show();

                }


            }
        });
    }
}