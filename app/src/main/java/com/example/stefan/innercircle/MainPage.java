package com.example.stefan.innercircle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends AppCompatActivity {


    private List<Person> persons;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.recyclerview);

        rv=findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Stefan Is the Shit", "Fuck yeah", R.drawable.emma));
        persons.add(new Person("About time this POS worked", "-Everybody", R.drawable.lavery));
        persons.add(new Person("Now that it works...", "Time to have some fun!", R.drawable.lillie));
        persons.add(new Person("JK, it's Monday", "I have to go to work tomorrow", R.drawable.emma));
        persons.add(new Person("More updates tomorrow", "Or maybe Wednesday", R.drawable.lavery));
        persons.add(new Person("More pretty faces", "God...", R.drawable.lillie));
        persons.add(new Person("The guy that made this tutorial needs a gf", "I could probably do with one too", R.drawable.emma));
        persons.add(new Person("lol jk", "I'm good.", R.drawable.lavery));
        persons.add(new Person("Got shit to do", "Plus I am too cheap rn to have a gf", R.drawable.lillie));

    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }

}
