package com.example.picatabfagments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ChatsFragment extends Fragment {

    String name[] = {"Avataar","Avengers","Avataar","Avengers","Avataar","Avengers","Avataar","Avengers","Avataar","Avengers"};

    Integer image[] = {R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one};

    ListView listView;

    public ChatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = getView().findViewById(R.id.listview);

        MyMoviesAdapter myMoviesAdapter = new MyMoviesAdapter((Activity) getContext(),name,image);
        listView.setAdapter(myMoviesAdapter);
    }
}