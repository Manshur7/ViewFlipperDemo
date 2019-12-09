package com.n01249089.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ViewFlipper;
/*
    Author: Manshur Ramhith
    Description: This activity implements automatic switches from one view of the ViewFlipper to another with a fixed interval in between them
                    Also I added a textview Dynamically to show that it is not mandatory to add it in the XML File
    Date: 12/05/19

 */

public class automatic extends AppCompatActivity {

    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automatic);
        setupTitleandHomeButton();

        viewFlipper = findViewById(R.id.view_flipper);
        TextView textView = new TextView(this);
        textView.setText("This TextView is added in code dynamically ");
        textView.setGravity(Gravity.CENTER);

        viewFlipper.addView(textView);

        //Set a fixed interval between switches
        viewFlipper.setFlipInterval(2000);
        //Start the flipping process automatically
        viewFlipper.startFlipping();


    }
    private void setupTitleandHomeButton() {
        getSupportActionBar().setSubtitle("Automatic Flipping");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
