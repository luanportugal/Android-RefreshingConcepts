package com.example.praneethambati.differentbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    EditText name,password,pin,email,phone,address,description,time,date,number,numberSigned,numberDecimal;
    Button btn;

    String name1,password1,pin1,email1,phone1,address1,description1,time1,date1,number1,numberSigned1,numberDecimal1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        name= (EditText) findViewById(R.id.editText2);
        password= (EditText) findViewById(R.id.editText3);
        pin= (EditText) findViewById(R.id.editText4);
        email= (EditText) findViewById(R.id.editText5);
        phone= (EditText) findViewById(R.id.editText6);
        address= (EditText) findViewById(R.id.editText7);
        description= (EditText) findViewById(R.id.editText8);
        time= (EditText) findViewById(R.id.editText9);
        date= (EditText) findViewById(R.id.editText10);
        number= (EditText) findViewById(R.id.editText11);
        numberSigned= (EditText) findViewById(R.id.editText12);
        numberDecimal= (EditText) findViewById(R.id.editText13);


        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name1 = name.getText().toString();
                password1 = password.getText().toString();
                pin1 = pin.getText().toString();
                email1 = email.getText().toString();
                phone1 = phone.getText().toString();
                address1 = address.getText().toString();
                description1 = description.getText().toString();
                time1 = time.getText().toString();
                date1 = date.getText().toString();
                number1 = number.getText().toString();
                numberSigned1 = numberSigned.getText().toString();
                numberDecimal1 = numberDecimal.getText().toString();

                Toast.makeText(getApplicationContext(),name1+"\n"+password1+"\n"+pin1+"\n"+email1+"\n"+phone1+"\n"+address1+"\n"+description1+"\n"+time1+"\n"+date1+"\n"+number1+"\n"+numberSigned1+"\n"+numberDecimal1,Toast.LENGTH_LONG).show();
            }
        });

    }
}
