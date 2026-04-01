package com.example.demo.observer;

import com.example.demo.model.Application;

public interface ApplicationObserver {
    void onStateChanged(Application app);
}