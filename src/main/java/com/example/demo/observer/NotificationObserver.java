package com.example.demo.observer;

import com.example.demo.model.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationObserver implements ApplicationObserver {

    private static final Logger log = LoggerFactory.getLogger(NotificationObserver.class);

    @Override
    public void onStateChanged(Application app) {
        log.info("[Notification] Alert: '{}' at '{}' is now {}",
                app.getRoleName(), app.getCompanyName(), app.getStatus());
    }
}