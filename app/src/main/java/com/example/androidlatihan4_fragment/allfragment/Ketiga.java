package com.example.androidlatihan4_fragment.allfragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.example.androidlatihan4_fragment.R;

public class Ketiga extends Fragment {
    public static Ketiga newInstance(int id) {
        Ketiga fr = new Ketiga();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_tiga, container, false);
        return views;
    }


    @Override
    public void onViewCreated(@NonNull View views, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(views, savedInstanceState);
        final Switch switchs = views.findViewById(R.id.switchs);
        switchs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()).setTitle("Menyala")
                            .setMessage("Turn Off?").setCancelable(false)
                            .setPositiveButton("OK Bro", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    switchs.setChecked(false);
                                }
                            });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });


    }
}
