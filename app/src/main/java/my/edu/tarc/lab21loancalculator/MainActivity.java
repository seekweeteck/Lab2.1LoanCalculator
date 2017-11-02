package my.edu.tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateLoan(View view){
        //TODO: calculate monthly payment and determine the loan status
        double monthlyPayment =0;
        String status = "Approved";

        //Create an Explicit Intent
        Intent intent = new Intent(this, ResultActivity.class);
        //TODO: passing data using putExtra method
        //format : putExtra(TAG, value)
        intent.putExtra(MONTHLY_PAYMENT, monthlyPayment);
        intent.putExtra(LOAN_STATUS, status);
        startActivity(intent);
    }
}
