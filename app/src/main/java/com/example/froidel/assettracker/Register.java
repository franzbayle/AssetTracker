package com.example.froidel.assettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    EditText ATEmpID, ATNewPassword, ATConfirmNewPassword;
    Button ATBDOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ATEmpID = (EditText) findViewById(R.id.ATEmpID);
        ATNewPassword = (EditText) findViewById(R.id.ATNewPassword);
        ATConfirmNewPassword = (EditText) findViewById(R.id.ATConfirmNewPassword);
        ATBDOne = (Button) findViewById(R.id.ATBDone);

        ATBDOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ATBDone:
                startActivity(new Intent(this, Login.class));
        }
    }
}
