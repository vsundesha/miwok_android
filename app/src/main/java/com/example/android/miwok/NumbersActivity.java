package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "uno"));
        words.add(new Word("two", "dos"));
        words.add(new Word("three", "tres"));
        words.add(new Word("four", "cuatro"));
        words.add(new Word("five", "cinco"));
        words.add(new Word("six", "seis"));
        words.add(new Word("seven", "siete"));
        words.add(new Word("eight", "ocho"));
        words.add(new Word("nine", "nueve"));


        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
