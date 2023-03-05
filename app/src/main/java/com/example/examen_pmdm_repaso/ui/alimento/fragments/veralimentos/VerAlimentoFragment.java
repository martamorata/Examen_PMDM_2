package com.example.examen_pmdm_repaso.ui.alimento.fragments.veralimentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.examen_pmdm_repaso.databinding.FragmentVerAlimentoBinding;
import com.example.examen_pmdm_repaso.modelo.dao.DaoAlimento;


public class VerAlimentoFragment extends Fragment {

    // Nuevo
    RecyclerView recyclerView;
    private DaoAlimento daoAlimento;
    private FragmentVerAlimentoBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Nuevo
        binding = FragmentVerAlimentoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = binding.alimentos;
        daoAlimento = new DaoAlimento();

        // Creación del RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(daoAlimento.getAll());
        recyclerView.setAdapter(adapter);

        return root;
    }

}