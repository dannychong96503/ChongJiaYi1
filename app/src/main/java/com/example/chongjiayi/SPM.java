package com.example.chongjiayi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SPM extends AppCompatActivity {

    public int A = 0;
    public int B = 0;
    public int C = 0;
    public int pass = 0;
    public int F = 0;


    private EditText English;
    private EditText BM;
    private EditText Science;
    private EditText Account;
    private EditText Chinese;
    private EditText History;
    private EditText Math;

    private TextView result;


    private Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spm);

        check = (Button) findViewById(R.id.Check);
        English = (EditText) findViewById(R.id.English);
        BM      = (EditText) findViewById(R.id.BahasaMalaysia);
        Science = (EditText) findViewById(R.id.Science);
        Account = (EditText) findViewById(R.id.Account);
        Chinese = (EditText) findViewById(R.id.Chinese);
        History = (EditText) findViewById(R.id.History);
        Math = (EditText) findViewById(R.id.Math);

        result = (TextView) findViewById(R.id.result);



        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               checkResult();
            }
        });

    }

    private void checkResult() {

        String engValue = English.getText().toString();
        String BMValue = BM.getText().toString();
        String ScienceValue = Science.getText().toString();
        String AccountValue = Account.getText().toString();
        String ChineseValue =Chinese.getText().toString();
        String HistoryValue = History.getText().toString();
        String MathValue = Math.getText().toString();




        if (engValue.equals("A") || engValue.equals("B") || engValue.equals("C")) {
            pass++;
        }
        if ( BMValue.equals("A") ||  BMValue.equals("B") ||  BMValue.equals("C")) {
            pass++;
        }
        if (ScienceValue.equals("A") || ScienceValue.equals("B") || ScienceValue.equals("C")) {
            pass++;
        }
        if (AccountValue.equals("A") || AccountValue.equals("B") ||AccountValue.equals("C")) {
            pass++;
        }
        if (ChineseValue.equals("A") || ChineseValue.equals("B") || ChineseValue.equals("C")) {
            pass++;
        }
        if (HistoryValue.equals("A") || HistoryValue.equals("B") || HistoryValue.equals("C")) {
            pass++;
        }
        if ( MathValue.equals("A")||  MathValue.equals("B") ) {
            pass++;
        }
        if (pass >= 5){

            result.setText(R.string.passMsg);

        }

        if (pass < 5 || engValue.equals("F")||BMValue.equals("F")||MathValue.equals("C")||MathValue.equals("F")){
            result.setText(R.string.TARUCFAIl);

        }
    }

}
