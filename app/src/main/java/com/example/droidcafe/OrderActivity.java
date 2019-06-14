package com.example.droidcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //private AdapterView adapterView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Spinner spinner = findViewById(R.id.spinner);
        if(spinner != null){
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,R.array.labels_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if(spinner != null){
            spinner.setAdapter(adapter);
        }


        Intent intent = getIntent();
        String message = "Order: " +intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView text = findViewById(R.id.order_textview);
        text.setText(message);
    }


    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton)view).isChecked();
       // RadioButton r = findViewById(R.id.nextday);
        //r.setChecked(true);
        switch(view.getId()){

            case R.id.sameday:
                if(checked)
                    displayToast(getString(R.string.same));
                break;
            case R.id.nextday:
                if(checked)
                    displayToast(getString(R.string.next));
                break;
            case R.id.pickup:
                if(checked)
                    displayToast(getString(R.string.pick));
                break;
        }
    }

    private void displayToast(String string) {
        Toast.makeText(getApplicationContext(),string,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String spinnerLabel = parent.getItemAtPosition(position).toString();
        displayToast(spinnerLabel);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void launch(View view) {

        Intent i = new Intent(OrderActivity.this,CheckBox1.class);
        startActivity(i);

    }
}
