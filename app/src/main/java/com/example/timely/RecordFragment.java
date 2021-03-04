package com.example.timely;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RecordFragment extends Fragment implements View.OnClickListener {

    private Button recordBut;
    private OnFragmentInteractionListener mListener;

    public RecordFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_record, container, false);
        recordBut = (Button) view.findViewById(R.id.recordButton);
        recordBut.setOnClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }

    //Called when frag is first attached to activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            this.mListener = (OnFragmentInteractionListener) context;
        }
        else {
            throw new RuntimeException(context.toString()+"must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == recordBut.getId()) {
            mListener.onButtonClicked(1);
        }
    }

    public String getTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        return format.format(cal.getTime());
    }

    public interface OnFragmentInteractionListener {
        public void onButtonClicked(int id);
    }
}