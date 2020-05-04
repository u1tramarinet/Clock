package com.example.clock.ui.stopwatch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StopWatchViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public StopWatchViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is StopWatch fragment.");
    }

    public LiveData<String> getText() {
        return text;
    }
}
