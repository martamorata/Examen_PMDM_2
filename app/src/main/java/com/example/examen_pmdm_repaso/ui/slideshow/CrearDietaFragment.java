package com.example.examen_pmdm_repaso.ui.slideshow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.examen_pmdm_repaso.R;
import com.example.examen_pmdm_repaso.databinding.FragmentCrearDietaBinding;


public class CrearDietaFragment extends Fragment {


    private Button btnIr;
    private FragmentCrearDietaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCrearDietaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        btnIr = binding.button;

        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.verDietaFragment);
            }
        });

        // Inflate the layout for this fragment
        return root;
    }

}