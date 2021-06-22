package com.example.heritage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<details>detailsList;
   ImageView image;

    private Object MyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleview);
        detailsList = new ArrayList<>();
        image= (ImageView)findViewById(R.id.image);



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);


        for (int i=0;i<10;i++){
            details Details=new details("qiloane","This place is fiund in maseru near THABA BOSIU");


        }
         image.setOnLongClickListener(new View.OnLongClickListener() {
             @Override
             public boolean onLongClick(View v) {
                 Intent intent = new Intent(context, details.class);
                 intent.putExtra( "data1",tittle[position]);

                 intent.putExtra( "myImage",image[position]);
                 context.startActivity(intent);
                 return false;
             }
         });

    }
}