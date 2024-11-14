package com.example.projectakhir_risty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.projectakhir_risty.adapter.MasyarakatAdapter;
import com.example.projectakhir_risty.db.DbHelper;
import com.example.projectakhir_risty.Model.Masyarakat;
import java.util.ArrayList;


public class ListMasyarakatActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MasyarakatAdapter adapter;
    private ArrayList<Masyarakat> masyarakatArrayList;
    private DbHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_masyarakat);
        recyclerView = (RecyclerView) findViewById(R.id.rtampil);
        adapter = new MasyarakatAdapter(this);
        dbHelper = new DbHelper(this);
        masyarakatArrayList = dbHelper.getAllUsers();
        adapter.setListMasyarakat(masyarakatArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListMasyarakatActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        masyarakatArrayList = dbHelper.getAllUsers();
        adapter.setListMasyarakat(masyarakatArrayList);
        adapter.notifyDataSetChanged();
    }

}
