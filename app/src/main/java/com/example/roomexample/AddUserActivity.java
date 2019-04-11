package com.example.roomexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddUserActivity extends AppCompatActivity {

    private EditText userId, userName, userEmail;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        userId    = findViewById(R.id.edtId);
        userName  = findViewById(R.id.edtName);
        userEmail = findViewById(R.id.edtEmail);
        btnSave   = findViewById(R.id.btnAdd);


    }

    public void onClickSave(View view)
    {
        int id = Integer.parseInt(userId.getText().toString());
        String name  = userName.getText().toString();
        String email = userEmail.getText().toString();

        User user = new User();
        user.setId(id);
        user.set_name(name);
        user.set_email(email);

        MainActivity.myDatabase.myDAO().addUser(user);



        Toast.makeText(AddUserActivity.this, "User Added Successfully", Toast.LENGTH_SHORT).show();


        //Navigate to NEXT Activity
       // Intent mIntent = new Intent(MainActivity.this, AddUserActivity.class);
        //Set value to pass on next activity
        //startActivity(mIntent);

    }
}
