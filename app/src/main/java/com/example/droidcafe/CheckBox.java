package com.example.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CheckBox extends AppCompatActivity {
    private Button btnDisplay;
    private CheckBox chkIos, chkAndroid, chkWindows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);



    }






    public void launch(View view) {
        chkIos = findViewById(R.id.syrup);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkWindows = (CheckBox) findViewById(R.id.chkWindows);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        StringBuffer result = new StringBuffer();
        result.append("IPhone check : ").append(chkIos.isChecked());
        result.append("\nAndroid check : ").append(chkAndroid.isChecked());
        result.append("\nWindows Mobile check :").append(chkWindows.isChecked());

        Toast.makeText(CheckBox.this, result.toString(),
                Toast.LENGTH_LONG).show();
    }
}
