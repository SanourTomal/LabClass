package com.example.sanourtomal.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt_name,txt_pass;
    private Button signin;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(Check()==true){
                    Intent intent=new Intent(getApplicationContext(),Registration.class);
                    Toast.makeText(getApplicationContext(),"Log in Successful",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(),"Wrong Input",Toast.LENGTH_SHORT).show();
            }

        });

    }

    private void initialize() {

        txt_name=(EditText)findViewById(R.id.email);
        txt_pass=(EditText)findViewById(R.id.pass);
        signin=(Button)findViewById(R.id.btn_signin);
    }
    public boolean Check(){

        person=new Person("tomal","123");

        if(txt_name.getText().toString().equals(person.getName())&& txt_pass.getText().toString().equals(person.getPass())){
            Log.d("",txt_name.getText().toString());
            return true;
        }
        else return false;

    }
}
