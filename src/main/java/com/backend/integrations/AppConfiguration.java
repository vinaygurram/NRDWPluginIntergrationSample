package com.backend.integrations;

import io.dropwizard.Configuration;

/**
 * Stores application configuration.
 */
public class AppConfiguration extends Configuration{
    private boolean greetingStatus;

    public boolean isGreetingStatus() {
        return greetingStatus;
    }

    public void setGreetingStatus(boolean greetingStatus) {
        this.greetingStatus = greetingStatus;
    }
}
