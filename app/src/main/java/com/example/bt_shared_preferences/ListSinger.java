package com.example.bt_shared_preferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListSinger extends AppCompatActivity {
    private RecyclerView rcvSinger;
    private SingerAdapter singerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_singer);
        rcvSinger= findViewById(R.id.rcv_singer);
        singerAdapter = new SingerAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvSinger.setLayoutManager(linearLayoutManager);

        singerAdapter.setData(getListSinger());
        rcvSinger.setAdapter(singerAdapter);
    }
    private List<Singer> getListSinger(){
        List<Singer> list = new ArrayList<>();
        list.add(new Singer("Nguyễn Việt Hoàng","MoNo", "Việt Nam","4 ", R.drawable.mono));
        list.add(new Singer("Nguyễn Thanh Tùng","Sơn tùng MTP", "Việt Nam","5 ", R.drawable.sontung));
        list.add(new Singer("Nguyễn Việt Hoàng","MoNo", "Việt Nam","4 ", R.drawable.mono));

        return list;
    }
}