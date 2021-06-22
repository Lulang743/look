package com.example.heritage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder>  {

    private List<details>detailsList;

    public MyAdapter(List<details> detailsList) {
        this.detailsList = detailsList;
    }

    @NonNull

    @Override
    public MyviewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.rv_item_list,
                parent,
                false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.MyviewHolder holder, int position) {
      holder.tittle.setText(detailsList.get(position).getTittle());
      holder.description.setText(detailsList.get(position).getTittle());
    }

    @Override
    public int getItemCount() {
        return detailsList.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder{

        TextView tittle;
        TextView description;

        public MyviewHolder(@NonNull  View itemView) {
            super(itemView);
            tittle=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
        }
    }
}
