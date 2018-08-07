package com.example.tristam.studentjobsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class SearchJobs extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mToggle;

    private FirebaseAuth firebaseAuth;

    //
    private EditText searchValue;
    private Button searchButton;
    public String test1 = "potato";
    public String test2 = "tomato";
    public String test3 = "potatomato";
    public ArrayList<String> list = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this layout is content the "content_search_jobs"
        setContentView(R.layout.activity_search_jobs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get value from editText(search)
        searchValue = findViewById(R.id.editText);
        searchButton = findViewById(R.id.searchButton);
        //Search list
        list.add("qwer001");
        list.add("qwer002");
        list.add("001asdf");
        list.add("002asdf");

        firebaseAuth = FirebaseAuth.getInstance();

        drawerLayout = findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        //the button is on "content_search_jobs" not on "activity_search_jobs"; reason for cannot resolve?
        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startSearch();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        switch(item.getItemId()){
            case R.id.logoutMenu:
                Logout();

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_jobs, menu);
        return true;
    }

    private void startSearch() {
        String search = searchValue.getText().toString();

        if (TextUtils.isEmpty(search)) {
            Toast.makeText(SearchJobs.this, "唔講我知搵咩, 我搵鬼到呀?", Toast.LENGTH_SHORT).show();
        } else if (search.equals(test1)) {
            Toast.makeText(SearchJobs.this, test1+"? 食薯仔啦頂你~", Toast.LENGTH_SHORT).show();
        } else if (search.equals(test2)) {
            Toast.makeText(SearchJobs.this, test2+"? 食蕃茄啦頂你~", Toast.LENGTH_SHORT).show();
        } else if (search.equals(test3)) {
            Toast.makeText(SearchJobs.this, test3+"? 溝埋變做蕃薯茄仔呀笨!", Toast.LENGTH_SHORT).show();
        } else if (list.contains(search)) {
            Toast.makeText(SearchJobs.this, search + "? 搵到都唔話你知呀頂你!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(SearchJobs.this, search + "? 搵唔到呀頂你!", Toast.LENGTH_SHORT).show();
        }
    }

    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(SearchJobs.this, Login.class));
    }
}