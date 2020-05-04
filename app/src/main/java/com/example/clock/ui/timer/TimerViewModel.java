package com.example.clock.ui.timer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimerViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public TimerViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Timer fragment.");
    }

    public LiveData<String> getText() {
        return text;
    }
}
