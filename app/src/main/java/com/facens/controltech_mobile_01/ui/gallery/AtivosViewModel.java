package com.facens.controltech_mobile_01.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AtivosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AtivosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ativos Cara!! Legal!!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}