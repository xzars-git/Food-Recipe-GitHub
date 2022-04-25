package com.example.foodrecipeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipeapp.Models.Equipment;
import com.example.foodrecipeapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class InstructionsEquipmentsAdapter extends RecyclerView.Adapter<InstructionsEquipmentsViewHolder>{

    Context context;
    List<Equipment> list;

    public InstructionsEquipmentsAdapter(Context context, List<Equipment> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionsEquipmentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionsEquipmentsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions_step_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionsEquipmentsViewHolder holder, int position) {
        holder.textView_instruction_steps_items.setText(list.get(position).name);
        holder.textView_instruction_steps_items.setSelected(true);
        Picasso.get().load("https://spoonacular.com/cdn/equipment_100x100/"+list.get(position).image).into(holder.imageView_instructions_steps_items);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class InstructionsEquipmentsViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView_instructions_steps_items;
    TextView textView_instruction_steps_items;

    public InstructionsEquipmentsViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView_instructions_steps_items = itemView.findViewById(R.id.imageView_instructions_steps_items);
        textView_instruction_steps_items = itemView.findViewById(R.id.textView_instruction_steps_items);

    }
}