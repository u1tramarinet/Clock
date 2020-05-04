package com.example.clock.ui.alarm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlarmViewModel extends ViewModel {

    private final MutableLiveData<String> text;

    public AlarmViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is Alarm fragment.");
    }

    public LiveData<String> getText() {
        return text;
    }
}
