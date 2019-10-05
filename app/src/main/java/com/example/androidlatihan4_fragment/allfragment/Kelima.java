package com.example.androidlatihan4_fragment.allfragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.androidlatihan4_fragment.AfterClass;
import com.example.androidlatihan4_fragment.R;

public class Kelima extends Fragment {
    public static Kelima newInstance(int id) {
        Kelima fr = new Kelima();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_lima, container, false);


        return views;
    }

    @Override
    public void onViewCreated(@NonNull View views, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(views, savedInstanceState);
        final ListView sample = views.findViewById(R.id.sample);

        registerForContextMenu(sample);
        sample.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Bundle b = new Bundle();

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i) {
                    case 0: {
                        b.putString("kota", "jkt");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }
                    break;
                    case 1: {
                        b.putString("kota", "mlg");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 2: {
                        b.putString("kota", "sby");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 3: {
                        b.putString("kota", "bxt");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 4: {
                        b.putString("kota", "bdg");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 5: {
                        b.putString("kota", "jgj");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 6: {
                        b.putString("kota", "mks");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 7: {
                        b.putString("kota", "kdr");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 8: {
                        b.putString("kota", "smd");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                    case 9: {
                        b.putString("kota", "bpp");
                        Intent intent = new Intent(getActivity(), AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);

                    }
                    break;
                }
            }
        });


    }
}