package com.example.examen_pmdm_repaso.ui.alimento.fragments.anadiralimentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.example.examen_pmdm_repaso.databinding.FragmentAnadirAlimentoBinding;
import com.example.examen_pmdm_repaso.modelo.Alimento;
import com.example.examen_pmdm_repaso.modelo.dao.DaoAlimento;
import com.example.examen_pmdm_repaso.ui.alimento.fragments.veralimentos.MyRecyclerViewAdapter;
import com.example.examen_pmdm_repaso.ui.alimento.fragments.veralimentos.VerAlimentoFragment;


public class AnadirAlimentoFragment extends Fragment {

    // Nuevo
    EditText nombreAlimento;
    EditText nKalAlimento;
    DaoAlimento daoAlimento;
    Button btnAnadir;
    MyRecyclerViewAdapter adapter;


    private FragmentAnadirAlimentoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Nuevo
        binding = FragmentAnadirAlimentoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        nombreAlimento = binding.txtNombre;
        nKalAlimento = binding.txtKal;
        btnAnadir = binding.btnAceptar;
        daoAlimento = new DaoAlimento();
        adapter = new MyRecyclerViewAdapter(daoAlimento.getAll());

        btnAnadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alimento a = new Alimento(nombreAlimento.getText().toString(), Float.parseFloat(nKalAlimento.getText().toString()));
                adapter.updateLista(a);

                nombreAlimento.setText("");
                nKalAlimento.setText("");
            }
        });


        return root;
    }




}