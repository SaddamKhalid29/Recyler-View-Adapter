package com.example.finalrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyItemViewHolder> {

    public List<ToDoItem> toDoItemList=new ArrayList<>();
    @NonNull
    @Override
    public MyItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_detail,parent,false);
        MyItemViewHolder myItemViewHolder=new MyItemViewHolder(view);
        return myItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyItemViewHolder holder, int position) {
        holder.etTitle.setText(toDoItemList.get(position).getTitle());
        holder.etDesc.setText(toDoItemList.get(position).getDescription());
        holder.isActive.setChecked(toDoItemList.get(position).isActive());
    }

    @Override
    public int getItemCount() {
        return toDoItemList.size();
    }

    public class MyItemViewHolder extends RecyclerView.ViewHolder{
        //Creating References
        TextView etTitle,etDesc;
        Switch isActive;
        public MyItemViewHolder(@NonNull View itemView) {
            super(itemView);
           etTitle=itemView.findViewById(R.id.etTitle);
           etDesc=itemView.findViewById(R.id.etDesc);
           isActive=itemView.findViewById(R.id.switch1);

        }
    }
}
