package com.example.andy.androidproject1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Main Activity for the Base Converter App - This app only contains this activity
 * @author Andrew Jarombek
 * @since 9/5/2016
 */

public class MainActivity extends AppCompatActivity {

    Spinner inputBases;
    Spinner outputBases;
    EditText numberInput;
    Button enter;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Populate the spinner bases with the array of base options
        inputBases = (Spinner) findViewById(R.id.inputbase);
        ArrayAdapter<CharSequence> inputAdapter = ArrayAdapter.createFromResource(this,
                R.array.bases, android.R.layout.simple_spinner_item);
        inputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputBases.setAdapter(inputAdapter);

        outputBases = (Spinner) findViewById(R.id.outputbase);
        ArrayAdapter<CharSequence> outputAdapter = ArrayAdapter.createFromResource(this,
                R.array.bases, android.R.layout.simple_spinner_item);
        outputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        outputBases.setAdapter(outputAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        numberInput = (EditText) findViewById(R.id.numberinput);
        enter = (Button) findViewById(R.id.enter);
        result = (TextView) findViewById(R.id.result);

        // Listener for when the user hits the submit button
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = numberInput.getText().toString();
                String selectedInputBase = inputBases.getSelectedItem().toString();
                String selectedOutputBase = outputBases.getSelectedItem().toString();
                BaseStringConverter bsc = new BaseStringConverter();

                // Verify the inputs
                if (selectedInputBase.equals("Base 2") && input.matches("[0-1]+") ||
                        selectedInputBase.equals("Base 8") && input.matches("[0-7]+") ||
                        selectedInputBase.equals("Base 10") && input.matches("\\d+") ||
                        selectedInputBase.equals("Base 16") && input.matches("[0-9a-f]+")) {
                    // If verified, display the output text with the number conversion
                    result.setText(bsc.convertBase(input, selectedInputBase, selectedOutputBase));
                } else {
                    // Otherwise display a toast error message
                    Toast.makeText(MainActivity.this, "Invalid Number",
                            Toast.LENGTH_SHORT).show();
                    numberInput.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                }
            }
        });
    }
}
