package my.edu.tarc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //To receive data from another Activity
        Intent intent = getIntent(); //Asking "who called me?"
        double payment = intent.getDoubleExtra(MainActivity.MONTHLY_PAYMENT, 0);
        String status = intent.getStringExtra(MainActivity.LOAN_STATUS);
        //TODO: Display the outputs
    }

    public void closeActivity(View view){
        //Terminate the current activity
        finish();
    }
}
