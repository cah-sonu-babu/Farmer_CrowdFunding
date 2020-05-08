package com.example.crowdfunding.uifarmer.sellcropsfarmer;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.crowdfunding.R;



public class SellcropsfarmerFragment extends Fragment {
    Intent i;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_sellcrops_farmer, container, false);

        return root;
    }


}