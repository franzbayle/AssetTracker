package com.example.froidel.assettracker;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button ATBLogin;
    EditText ATUsername, ATPassword;
    TextView ATTVRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ATUsername = (EditText) findViewById(R.id.ATUsername);
        ATPassword = (EditText) findViewById(R.id.ATPassword);
        ATBLogin = (Button) findViewById(R.id.ATBLogin);
        ATTVRegister = (TextView) findViewById(R.id.ATTVRegister);

        ATBLogin.setOnClickListener(this);
        ATTVRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ATBLogin:
                if (ValidateLogin()==true){
                    startActivity(new Intent(this, Home.class));
                }
                else {


                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle(getResources().getString(R.string.invalid_Login_Title));
                    dlgAlert.setMessage(getResources().getString(R.string.invalid_Login_text));
                    dlgAlert.setPositiveButton(getResources().getString(R.string.txt_ok), null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                    dlgAlert.setPositiveButton((getResources().getString(R.string.txt_ok)),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });
                }
                break;
            case R.id.ATTVRegister:
                startActivity(new Intent(this, Register.class));
                break;

        }
    }
    public boolean ValidateLogin(){
        String uname = "131590";
        String pword = "123";
        if(ATUsername.getText().toString().equals(uname) &&
                ATPassword.getText().toString().equals(pword) ){
            return true;
        }
        else {
            return false;
        }

    }


}
