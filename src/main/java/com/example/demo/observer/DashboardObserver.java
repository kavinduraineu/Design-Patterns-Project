package com.example.demo.observer;

import com.example.demo.model.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DashboardObserver implements ApplicationObserver {

    private static final Logger log = LoggerFactory.getLogger(DashboardObserver.class);

    @Override
    public void onStateChanged(Application app) {
        log.info("[Dashboard] Application '{}' at '{}' changed to {}",
                app.getRoleName(), app.getCompanyName(), app.getStatus());
    }
}