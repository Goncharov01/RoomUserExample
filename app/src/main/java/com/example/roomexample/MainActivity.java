package com.example.roomexample;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public static MyDatabase myDatabase;

    private Button btnAddUser;
    private Button btnViewUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabase = Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"userdb").allowMainThreadQueries().build();


        btnAddUser = findViewById(R.id.btnAdd);
        btnViewUsers = findViewById(R.id.btnView);



    }


    public void onClickAdd(View view)
    {


        //Navigate to NEXT Activity
        Intent mIntent = new Intent(MainActivity.this, AddUserActivity.class);
        //Set value to pass on next activity
        startActivity(mIntent);

    }

    public void onClickView(View view)
    {


        //Navigate to NEXT Activity
        Intent mIntent = new Intent(MainActivity.this, ViewUsersActivity.class);
        //Set value to pass on next activity
        startActivity(mIntent);

    }

    public void onClickDelete(View view)
    {


        //Navigate to NEXT Activity
        Intent mIntent = new Intent(MainActivity.this, DeleteUserActivity.class);
        //Set value to pass on next activity
        startActivity(mIntent);

    }

    public void onClickUpdate(View view)
    {


        //Navigate to NEXT Activity
        Intent mIntent = new Intent(MainActivity.this, UpdateUserActivity.class);
        //Set value to pass on next activity
        startActivity(mIntent);

    }
}
