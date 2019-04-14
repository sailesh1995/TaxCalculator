package edu.softwarica.android.assignment.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etxt_salary;
    TextView txt_tax;
    Button btn_calculate;
    CalculateTax calculateTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt_salary = findViewById(R.id.etxt_salary);
        txt_tax = findViewById(R.id.txt_tax);
        btn_calculate = findViewById(R.id.btn_calculate);
        btn_calculate.setOnClickListener(this);
        calculateTax = new CalculateTax();
    }

    @Override
    public void onClick(View v) {
        String displayTax;
        switch (v.getId()) {
            case R.id.btn_calculate:
                calculateTax.setSalary(Float.parseFloat(etxt_salary.getText().toString()));
                displayTax = calculateTax.displayTax();
                txt_tax.setText("You have to pay " + displayTax + " tax annually");
                break;
            default:
                break;
        }
    }
}
