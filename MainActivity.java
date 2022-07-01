//CAR EMI CALCULATOR JAVA CODE

package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
   EditText principalamt,downpayment,interest,loanterm;
   TextView result;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       getSupportActionBar().hide();
       setContentView(R.layout.activity_main);
       principalamt= findViewById(R.id.principal_amt);
       downpayment= findViewById(R.id.down_payment);
       interest= findViewById(R.id.interest_rate);
       loanterm= findViewById(R.id.loan_term);
       result= findViewById(R.id.emi_result);
   }
   public void calculate(View v)
   {
       float total_amt,emi,p,r,n,d;
       total_amt=Float.parseFloat(principalamt.getText().toString());
       d=Float.parseFloat(downpayment.getText().toString());
       r=Float.parseFloat(interest.getText().toString());
       n=Float.parseFloat(loanterm.getText().toString());

       p=total_amt-d;
       r=r/(12*100);
       emi=(p*r*(float)Math.pow(1+r,n))/((float)Math.pow(1+r,n)-1);
       result.setText(""+emi);

   }
}
