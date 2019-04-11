package com.example.roomexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DeleteUserActivity extends AppCompatActivity {

    private EditText userId,userName,userEmail;
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);

        userId    = findViewById(R.id.edt_Id);
        userName  = findViewById(R.id.edtName);
        userEmail = findViewById(R.id.edtEmail);
        btnDelete = findViewById(R.id.btnDelete);

    }

    public void onClickSearch(View view)
    {
        int idSearch = Integer.parseInt(userId.getText().toString());

        List<User> users = MainActivity.myDatabase.myDAO().getUsers();   // <-- ojo

        for (User user : users)
        {
            int id = user.getId();
            String name = user.get_name();
            String email = user.get_email();

            if (idSearch == id )
            {
                userName.setText(name);
                userEmail.setText(email);
                Toast.makeText(DeleteUserActivity.this, "User found!", Toast.LENGTH_SHORT).show();
                break;

            }
            else
            {
                userName.setText("");
                userEmail.setText("");
                Toast.makeText(DeleteUserActivity.this, "User Id Not found!", Toast.LENGTH_SHORT).show();
            }

        }


    }


    public void onClickDelete(View view)
    {
        int id = Integer.parseInt(userId.getText().toString());

        User user = new User();

        user.setId(id);

        MainActivity.myDatabase.myDAO().deleteUser(user);    // <-- ojo


        Toast.makeText(DeleteUserActivity.this, "User Deleted Successfully", Toast.LENGTH_SHORT).show();

        userId.setText("");
        userName.setText("");
        userEmail.setText("");

    }
}
