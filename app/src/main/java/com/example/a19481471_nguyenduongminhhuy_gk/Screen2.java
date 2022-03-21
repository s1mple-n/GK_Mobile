package com.example.a19481471_nguyenduongminhhuy_gk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Screen2 extends AppCompatActivity {
    private ListView lv;
    private List<Xe> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        lv = findViewById(R.id.lv);
        list = new ArrayList<>();

        list.add(new Xe(R.mipmap.bione,"Red bull one",350,499));
        list.add(new Xe(R.mipmap.bifour,"Blue One",840,950));

        XeAdapter adapter = new XeAdapter(this,R.layout.customlistview,list);
        lv.setAdapter(adapter);


    }
}