package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import io.bloco.faker.Faker;

public class MainActivity extends AppCompatActivity {

    List<ItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            Faker faker = new Faker();
            items.add(new ItemModel(faker.name.name(),faker.lorem.sentence(),faker.lorem.paragraph(), "12:34 PM",R.drawable.test_pic));
        }
        ItemAdapter adapter = new ItemAdapter(items);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
