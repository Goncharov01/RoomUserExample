package com.example.roomexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ViewUsersActivity extends AppCompatActivity {

    private TextView  txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);

        txtInfo = findViewById(R.id.tvInfo);

        List<User> users = MainActivity.myDatabase.myDAO().getUsers();   // <-- ojo

        String info = "";

        for (User user : users)
        {
            int id = user.getId();
            String name = user.get_name();
            String email = user.get_email();

            info = info + "\n\n" + "ID:"+ id + "\n Name:" + name + "\n Email:" + email;
        }

        txtInfo.setText(info);
    }
}
