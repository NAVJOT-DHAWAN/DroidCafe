package com.example.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBox1 extends AppCompatActivity {
    CheckBox chocolate,sprinkles,nuts,cherries,cookie;
    Button buttonOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){

        chocolate=(CheckBox)findViewById(R.id.syrup);
        sprinkles=(CheckBox)findViewById(R.id.sprinkle);
        nuts=(CheckBox)findViewById(R.id.nuts);
        cherries=(CheckBox)findViewById(R.id.cherry);
        cookie=(CheckBox)findViewById(R.id.oreo);
        buttonOrder=(Button)findViewById(R.id.button);


        buttonOrder.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if(chocolate.isChecked()){
                    result.append("\nChocolate Syrup 100Rs");
                    totalamount+=100;
                }
                if(sprinkles.isChecked()){
                    result.append("\nSprinkles 50Rs");
                    totalamount+=50;
                }
                if(nuts.isChecked()){
                    result.append("\nCrushed Nuts 120Rs");
                    totalamount+=120;
                }
                if(cherries.isChecked()){
                    result.append("\nCherries 200Rs");
                    totalamount+=200;
                }
                if(cookie.isChecked()){
                    result.append("\nOreo Cookie Crumbles 250Rs");
                    totalamount+=250;
                }
                result.append("\nTotal: "+totalamount+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}