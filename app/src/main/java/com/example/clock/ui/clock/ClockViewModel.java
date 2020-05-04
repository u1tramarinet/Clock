package com.example.clock.ui.clock;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClockViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public ClockViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Clock fragment.");
    }

    public LiveData<String> getText() {
        return text;
    }
}
