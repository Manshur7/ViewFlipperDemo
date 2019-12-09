package com.n01249089.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

/*
    Author: Manshur Ramhith
    Description: This activity implements manual switches from one view of the ViewFlipper to another
                    Also I added a textview Dynamically to show that it is not mandatory to add it in the XML File
    Date: 12/05/19

 */
public class manual extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    private Button vfbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        setupTitleandHomeButton();

        viewFlipper = findViewById(R.id.view_flipper);
        vfbutton = findViewById(R.id.vfbutton);
        vfbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toastMessage("Button Clicked...Hello");

            }
        });
        TextView textView = new TextView(this);
        textView.setText("This TextView is added in code dynamically ");
        textView.setGravity(Gravity.CENTER);
        //Dynamically adding a textview to a ViewFlipper
        viewFlipper.addView(textView);

    }
    //Buttons & Methods to alternate through the different views of the ViewFlipper
    public void previousView(View v){
        viewFlipper.showPrevious();
    }
    public void nextView(View v){
        viewFlipper.showNext();
    }
    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
    private void setupTitleandHomeButton() {
        getSupportActionBar().setSubtitle("Manually Flip");
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
