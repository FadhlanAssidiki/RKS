package com.fadhlan.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class maroon extends AppCompatActivity {
    private ListView listViewmaroon;
    private ArrayAdapter<String> arrayAdapter;
    private String[] programmingLang = {
            "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu", "List Lagu",
            "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu", "List Lagu","List Lagu",
            "List Lagu", "List Lagu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maroon);

        listViewmaroon=(ListView) findViewById(R.id.listviewmaroon);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listViewmaroon.setAdapter(arrayAdapter);
    }
}