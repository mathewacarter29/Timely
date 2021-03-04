package com.example.timely;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements RecordFragment.OnFragmentInteractionListener {

    private RecordFragment recordFrag;
    private ListFragment listFrag;
    private String times;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recordFrag = (RecordFragment) getSupportFragmentManager().findFragmentById(R.id.recordFrag);
        listFrag = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.listFrag);

        times = "";

    }

    @Override
    public void onButtonClicked(int id) {
        if (id == 1) {
            String curr_time = recordFrag.getTime() + "\n";
            listFrag.addText(curr_time);
            times += curr_time;
        }
    }
}