package com.sgupta.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mIncreaseButton;
    private Button mDecreaseButton;
    private TextView mQuantity;
    private TextView mSummary;
    private Button mOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] quantity = {0};

        mIncreaseButton = (Button) findViewById(R.id.increaseButton);
        mDecreaseButton = (Button) findViewById(R.id.decreaseButton);
        mQuantity = (TextView) findViewById(R.id.quantityTextView);
        mSummary = (TextView) findViewById(R.id.summaryTextView);
        mOrder = (Button) findViewById(R.id.orderButton);

        mIncreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity[0] = quantity[0] + 1;
                updateQuantity(quantity[0]);

            }
        });
        mDecreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity[0] = quantity[0] - 1;
                updateQuantity(quantity[0]);

            }
        });
        mOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSummary(quantity[0]);
            }
        });
    };

    private void updateSummary(int quantity) {
        mSummary.setText("$" + (quantity * 5));
    }

    private void updateQuantity(int quantity) {
        mQuantity.setText("" + quantity);
    }
}
