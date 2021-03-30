    package com.example.es_portindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("ALTEREGO");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.alterego);
        models.add(m);

        m = new Model();
        m.setTitle("EVOS");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.evos);
        models.add(m);

        m = new Model();
        m.setTitle("BIGETRON");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.bigetron);
        models.add(m);

        m = new Model();
        m.setTitle("RRQ");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.rrq);
        models.add(m);

        m = new Model();
        m.setTitle("BOOM ESPORT");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.boom);
        models.add(m);

        m = new Model();
        m.setTitle("ONIC");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.onic);
        models.add(m);

        m = new Model();
        m.setTitle("MORPH ESPORT");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.morph);
        models.add(m);

        m = new Model();
        m.setTitle("GEEK FAM");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.geekfam);
        models.add(m);

        m = new Model();
        m.setTitle("AURA ESPORT");
        m.setDescription("This is newfeed description..");
        m.setImg(R.drawable.aura);
        models.add(m);

        return models;

    }
}