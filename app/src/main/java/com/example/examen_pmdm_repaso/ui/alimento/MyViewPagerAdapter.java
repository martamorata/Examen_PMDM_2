package com.example.examen_pmdm_repaso.ui.alimento;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.examen_pmdm_repaso.ui.alimento.fragments.anadiralimentos.AnadirAlimentoFragment;
import com.example.examen_pmdm_repaso.ui.alimento.fragments.veralimentos.VerAlimentoFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position) {
            case 1:
                return new AnadirAlimentoFragment();
            default:
                return new VerAlimentoFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
