package com.lambton.java.project.sem1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.javaprojectsem1.javaprojectsem1.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {


   @BindView(R.id.et_username)  EditText etUsername;
   @BindView(R.id.et_pwd) EditText etPassword;

   @OnClick(R.id.btn_login) void onClickLogin(){

       Intent mainActivity = new Intent(LoginActivity.this,MainActivity.class);
       startActivity(mainActivity);
       finish();
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
   }

}
