package com.example.kenzack.myapplication.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.kenzack.myapplication.R;
import com.example.kenzack.myapplication.service.AuthentificationService;

public class Register extends AppCompatActivity {
    EditText ET_name,ET_User_NAME,ET_USER_PASS;
    String name,user_name,user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ET_name=(EditText)findViewById(R.id.name);
        ET_User_NAME=(EditText)findViewById(R.id.new_user_name);
        ET_USER_PASS=(EditText)findViewById(R.id.new_user_pass);
    }
    public void userReg(View view){
        AuthentificationService authentificationService = new AuthentificationService();
        name=ET_name.getText().toString();
        user_name=ET_User_NAME.getText().toString();
        user_pass=ET_USER_PASS.getText().toString();
        if(authentificationService.authentifier(user_name,user_pass) == null){
            //aucun message d'erreur donc on va afficher un truc pr succes
        }
        else {
            //afficher le message d'erreur
        }
    }
}
