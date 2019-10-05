package com.example.androidlatihan4_fragment.allfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidlatihan4_fragment.R;

public class Kedua extends Fragment {
    public static Kedua newInstance(int id) {
        Kedua fr = new Kedua();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_dua, container, false);

        return views;
    }

    @Override
    public void onViewCreated(@NonNull View views, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(views, savedInstanceState);
        final EditText edit = views.findViewById(R.id.edit);
        Button btn = views.findViewById(R.id.btn);
        final Bundle b = new Bundle();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "halo" + edit.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
