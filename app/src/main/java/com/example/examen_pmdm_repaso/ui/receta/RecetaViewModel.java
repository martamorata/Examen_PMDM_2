package com.example.examen_pmdm_repaso.ui.receta;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecetaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RecetaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}