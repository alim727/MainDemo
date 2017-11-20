package com.example.ali.maindemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button buttonLogMeIn;
    private EditText loginName;
    private EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogMeIn = (Button) findViewById(R.id.buttonLogMeIn);

        buttonLogMeIn.setOnClickListener(this);

        loginName = (EditText)findViewById(R.id.loginName);

        passwordText = (EditText) findViewById(R.id.passwordText);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View view) {


        if(loginName.getText().toString().equals("ross") &&
                passwordText.getText().toString().equals("to426")) {
            Toast.makeText(getApplicationContext(),
                    "Login Successful",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Access Denied",Toast.LENGTH_SHORT).show();

    }
}
}
