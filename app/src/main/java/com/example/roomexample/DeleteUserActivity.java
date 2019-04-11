package com.example.roomexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DeleteUserActivity extends AppCompatActivity {

    private EditText userId;
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_user);

        userId    = findViewById(R.id.edt_Id);
        btnDelete = findViewById(R.id.btnDelete);

    }

    public void onClickDelete(View view)
    {
        int id = Integer.parseInt(userId.getText().toString());

        User user = new User();

        user.setId(id);

        MainActivity.myDatabase.myDAO().deleteUser(user);    // <-- ojo


        Toast.makeText(DeleteUserActivity.this, "User Deleted Successfully", Toast.LENGTH_SHORT).show();

        userId.setText("");

        //Navigate to NEXT Activity
        // Intent mIntent = new Intent(MainActivity.this, AddUserActivity.class);
        //Set value to pass on next activity
        //startActivity(mIntent);

    }
}
