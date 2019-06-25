package com.project.siva.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter  mAdapter;
    ArrayList<String> stringArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        stringArrayList.add("AndroidMonks");
        stringArrayList.add("TextView");
        stringArrayList.add("Buttons");
        stringArrayList.add("EditText");
        stringArrayList.add("ImageView");
        stringArrayList.add("Relative Layout");
        stringArrayList.add("Linear Layout");
        //      add the adapter here
        mAdapter = new RecyclerAdapter(stringArrayList);
        //      Create the ItemTouchHelper
        ItemTouchHelper.Callback callback =
                new ItemMoveCallback(mAdapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);

        recyclerView.setAdapter(mAdapter);
    }
}
