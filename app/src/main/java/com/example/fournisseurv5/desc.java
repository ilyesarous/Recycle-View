package com.example.fournisseurv5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link desc#newInstance} factory method to
 * create an instance of this fragment.
 */
public class desc extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    String name,Fourid, date, montant , echeance , solde;

    public desc() {
        // Required empty public constructor
    }
    public desc(String name,String Fourid,String date, String montant , String echeance ,String solde) {
        this.name = name;
        this.Fourid = Fourid;
        this.date = date;
        this.montant = montant;
        this.echeance = echeance;
        this.solde = solde;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment desc.
     */
    // TODO: Rename and change types and number of parameters
    public static desc newInstance(String param1, String param2) {
        desc fragment = new desc();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_desc, container, false);

        TextView nameA = view.findViewById(R.id.name);
        TextView idA = view.findViewById(R.id.id);
        TextView dateA = view.findViewById(R.id.date);
        TextView montantA = view.findViewById(R.id.montant);
        TextView echeanceA = view.findViewById(R.id.echeance);
        TextView soldeA = view.findViewById(R.id.solde);

        nameA.setText(name);
        idA.setText(Fourid);
        dateA.setText(date);
        montantA.setText(montant);
        echeanceA.setText(echeance);
        soldeA.setText(solde);
        return view;
    }

    public void onBackPressed(){
        AppCompatActivity appCompatActivity = (AppCompatActivity) getContext();
        appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.container,new fournisseur()).addToBackStack(null).commit();
    }
}