package com.example.prwithrecycleviewraspisanie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHold> {

    Context context;
    List<Item> items;

    public Adapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHold(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHold holder, int position) {
        holder.DenNedeli.setText(items.get(position).getDenNedeli());

        holder.P1.setText(items.get(position).Para1);
        Drawable drawable1 = context.getResources().getDrawable(items.get(position).Photo1);
        holder.P1.setBackground(drawable1);

        holder.P2.setText(items.get(position).Para2);
        Drawable drawable2 = context.getResources().getDrawable(items.get(position).Photo2);
        holder.P2.setBackground(drawable2);

        holder.P3.setText(items.get(position).Para3);
        Drawable drawable3 = context.getResources().getDrawable(items.get(position).Photo3);
        holder.P3.setBackground(drawable3);

        holder.P4.setText(items.get(position).Para4);
        Drawable drawable4 = context.getResources().getDrawable(items.get(position).Photo4);
        holder.P4.setBackground(drawable4);

        holder.P5.setText(items.get(position).Para5);
        Drawable drawable5 = context.getResources().getDrawable(items.get(position).Photo5);
        holder.P1.setBackground(drawable5);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
