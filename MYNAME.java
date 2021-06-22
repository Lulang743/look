package com.example.heritage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class MYNAME extends RecyclerView.Adapter<MYNAME.myviewHolder> {

    private List<details> detailsList;

    public MYNAME(List<details> detailsList) {
        View view = LayoutInflater.from(parent.getContext().Inflate)
        this.detailsList = detailsList;
    }

    @Override
    public void onAttachedToRecyclerView( @org.jetbrains.annotations.RecyclerView recyclerView) {


        holder.tittle.setText(detailsList.get(position).getTittle());
        holder.description.setText(detailsList.get(position).getDescription());
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class myviewHolder extends  RecyclerView.ViewHolder{
        TextView title;
        TextView description;


        public myviewHolder( @org.jetbrains.annotations.View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.head);
            description = itemView.findViewById(R.id.description);
        }
    }
}
