package com.example.tugasbottomnav;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BangunDatarFragment extends Fragment {

    private CardView persegi;
    private  CardView segitiga;
    private  CardView lingkaran;
    private  CardView jajargenjang;
    private  CardView persegipanjang;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bangun_datar, container, false);

        persegi = view.findViewById(R.id.persegi);
        segitiga = view.findViewById(R.id.segitiga);
        lingkaran = view.findViewById(R.id.lingkaran);
        jajargenjang = view.findViewById(R.id.jajargenjang);
        persegipanjang = view.findViewById(R.id.persegipanjang);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent kepersegi = new Intent(getActivity(), persegi.class);
                 startActivity(kepersegi);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kesegitiga = new Intent(getActivity(), segitiga.class);
                startActivity(kesegitiga);
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kelingkaran = new Intent(getActivity(), lingkaran.class);
                startActivity(kelingkaran);
            }
        });

        jajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kejajargenjang = new Intent(getActivity(), jajargenjang.class);
                startActivity(kejajargenjang);
            }
        });

        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kepersegipanjang = new Intent(getActivity(), persegipanjang.class);
                startActivity(kepersegipanjang);
            }
        });


        return view;
    }
}