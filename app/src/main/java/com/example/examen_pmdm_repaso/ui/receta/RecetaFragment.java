package com.example.examen_pmdm_repaso.ui.receta;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.examen_pmdm_repaso.R;
import com.example.examen_pmdm_repaso.databinding.FragmentRecetaBinding;
import com.example.examen_pmdm_repaso.ui.alimento.AlimentoFragment;
import com.example.examen_pmdm_repaso.ui.alimento.fragments.anadiralimentos.AnadirAlimentoFragment;

public class RecetaFragment extends Fragment {

    // Nuevo
    private FragmentRecetaBinding binding;
    private FragmentTransaction fragmentTransaction;
    private AlimentoFragment alimentoFragment;
    private Button btnTrans;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RecetaViewModel galleryViewModel =
                new ViewModelProvider(this).get(RecetaViewModel.class);

        binding = FragmentRecetaBinding.inflate(inflater, container, false);

        // Nuevo
        btnTrans = binding.btnTransaction;
        alimentoFragment = new AlimentoFragment();
        fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();


        // Botón que nos lleva desde un fragment a otro.
        btnTrans.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                // Importante hacer el commit al final y agregarle manualmente un ID al Fragment origen.
                fragmentTransaction.replace(R.id.fragmentReceta, alimentoFragment);
                fragmentTransaction.commit();
            }
        });

        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}