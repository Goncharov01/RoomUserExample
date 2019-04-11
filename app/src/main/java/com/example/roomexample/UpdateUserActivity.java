package com.example.roomexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class UpdateUserActivity extends AppCompatActivity {

    private EditText userId, userName, userEmail;
    private Button btnUpdate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);


        userId    = findViewById(R.id.edtId);
        userName  = findViewById(R.id.edtName);
        userEmail = findViewById(R.id.edtEmail);
        btnUpdate   = findViewById(R.id.btnAdd);


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
                Toast.makeText(UpdateUserActivity.this, "User found!", Toast.LENGTH_SHORT).show();
                break;

            }
            else
            {
                userName.setText("");
                userEmail.setText("");
                Toast.makeText(UpdateUserActivity.this, "User Id Not found!", Toast.LENGTH_SHORT).show();
            }

        }


    }

    public void onClickUpdate(View view)
    {
        int id = Integer.parseInt(userId.getText().toString());
        String name  = userName.getText().toString();
        String email = userEmail.getText().toString();

        User user = new User();
        user.setId(id);
        user.set_name(name);
        user.set_email(email);

        MainActivity.myDatabase.myDAO().updateUser(user);    // <-- ojo



        Toast.makeText(UpdateUserActivity.this, "User updated successfully!", Toast.LENGTH_LONG).show();


        //Navigate to NEXT Activity
        // Intent mIntent = new Intent(MainActivity.this, AddUserActivity.class);
        //Set value to pass on next activity
        //startActivity(mIntent);

    }
}
