package com.example.timely;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ListFragment extends Fragment {

    private TextView text;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        text = (TextView) view.findViewById(R.id.sysTimes);
        text.setMovementMethod(ScrollingMovementMethod.getInstance());


        // Inflate the layout for this fragment
        return view;
    }

    public void addText(String input) {
        text.setText(text.getText() + input);
    }
}