package com.example.examen_pmdm_repaso.ui.alimento;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;


import com.example.examen_pmdm_repaso.databinding.FragmentAlimentoBinding;
import com.google.android.material.tabs.TabLayout;

public class AlimentoFragment extends Fragment {

    // Nuevo
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    MyViewPagerAdapter myViewPagerAdapter;


    private FragmentAlimentoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AlimentoViewModel homeViewModel =
                new ViewModelProvider(this).get(AlimentoViewModel.class);

        binding = FragmentAlimentoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        // Nuevo
        tabLayout = binding.tabLayout;
        viewPager2 = binding.viewPager;
        myViewPagerAdapter = new MyViewPagerAdapter(this.getActivity());
        viewPager2.setAdapter(myViewPagerAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}