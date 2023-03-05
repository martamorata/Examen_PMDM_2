package com.example.examen_pmdm_repaso.ui.alimento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlimentoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AlimentoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Fragment alimento general.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}