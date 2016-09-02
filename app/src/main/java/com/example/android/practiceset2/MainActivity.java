/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 *
 */

package com.example.android.practiceset2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.practiceset2.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the "+3 or +2 or Free" button on time 2 is clicked.
     */
    int scoreTime1 = 0;
    int scoreTime2 = 0;

    public void time1Increment3(View view) {
        scoreTime1 = scoreTime1 + 3;
        displayTime1(scoreTime1);
    }

    public void time1Increment2(View view) {
        scoreTime1 = scoreTime1 + 2;
        displayTime1(scoreTime1);
    }

    public void time1Increment1(View view) {
        scoreTime1++;
        displayTime1(scoreTime1);
    }

    /**
     * This method is called when the "+3 or +2 or Free" button on time 2 is clicked.
     */
    public void time2Increment3(View view) {
        scoreTime2 = scoreTime2 + 3;
        displayTime2(scoreTime2);
    }

    public void time2Increment2(View view) {
        scoreTime2 = scoreTime2 + 2;
        displayTime2(scoreTime2);
    }

    public void time2Increment1(View view) {
        scoreTime2++;
        displayTime2(scoreTime2);
    }

    /**
     * This method is called when the "RESET" button is clicked.
     */
    public void reset(View view) {
        scoreTime1 = 0;
        scoreTime2 = 0;
        displayTime1(scoreTime1);
        displayTime2(scoreTime2);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayTime1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.time1_text_score);
        quantityTextView.setText("" + number);
    }

    private void displayTime2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.time2_text_score);
        quantityTextView.setText("" + number);
    }

}