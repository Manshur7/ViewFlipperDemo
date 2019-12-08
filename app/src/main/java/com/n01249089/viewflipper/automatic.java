package com.n01249089.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ViewFlipper;

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

        viewFlipper.setFlipInterval(2000);
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
