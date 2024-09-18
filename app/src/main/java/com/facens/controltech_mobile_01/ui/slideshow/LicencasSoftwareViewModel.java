package com.facens.controltech_mobile_01.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LicencasSoftwareViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LicencasSoftwareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Licenças!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}