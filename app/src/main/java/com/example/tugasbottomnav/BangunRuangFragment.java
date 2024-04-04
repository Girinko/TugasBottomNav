package com.example.tugasbottomnav;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BangunRuangFragment extends Fragment {

    private CardView kubus;
    private  CardView balok;
    private CardView kerucut;
    private CardView tabung;
    private CardView bola;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bangun_ruang, container, false);

        kubus = view.findViewById(R.id.kubus);
        balok = view.findViewById(R.id.balok);
        kerucut = view.findViewById(R.id.kerucut);
        tabung = view.findViewById(R.id.tabung);
        bola = view.findViewById(R.id.bola);

        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kekubus = new Intent(getActivity(), kubus.class);
                startActivity(kekubus);
            }
        });

        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebalok = new Intent(getActivity(), balok.class);
                startActivity(kebalok);
            }
        });

        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kekerucut = new Intent(getActivity(), kerucut.class);
                startActivity(kekerucut);
            }
        });

        tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ketabung = new Intent(getActivity(), tabung.class);
                startActivity(ketabung);
            }
        });

        bola.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebola = new Intent(getActivity(), bola.class);
                startActivity(kebola);
            }
        }));

        return view;
    }
}