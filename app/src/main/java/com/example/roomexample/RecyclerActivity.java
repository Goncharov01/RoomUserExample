package com.example.roomexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {


    private RecyclerView recyclerView;    //  <-- Handler

    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);    // tell the recycler view , we need the layoutmanager

        // dispkay dthe item

        // create the adapter and the viwholder class responsible for each item or record ..






    }
}
