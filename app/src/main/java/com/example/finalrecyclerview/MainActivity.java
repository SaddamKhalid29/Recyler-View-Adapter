package com.example.finalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager,gridLayoutManager;
    RVAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleView);
        layoutManager=new LinearLayoutManager(this);
        gridLayoutManager=new GridLayoutManager(this,2);
        adapter=new RVAdapter();
        adapter.toDoItemList.add(new ToDoItem("Item 1","This is item 1 description",false));
        adapter.toDoItemList.add(new ToDoItem("Item 2","This is item 2 description",true));
        adapter.toDoItemList.add(new ToDoItem("Item 3","This is item 3 description",false));
        adapter.toDoItemList.add(new ToDoItem("Item 4","This is item 4 description",true));
        adapter.toDoItemList.add(new ToDoItem("Item 5","This is item 5 description",false));
        adapter.toDoItemList.add(new ToDoItem("Item 6","This is item 6 description",true));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}