package com.backend.integrations;

import com.backend.integrations.api.TestResource;

import java.util.concurrent.Executors;

import io.dnbg.newrelic.dropwizard.Main;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Application main class. This class is used to initialize application environment.
 */
public class App extends Application<AppConfiguration> {

    // Run method
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    // Initialize the environment
    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        // Create test resource
        TestResource testResource = new TestResource(configuration.isGreetingStatus());

        // Health Check
        AppHealthCheck healthCheck = new AppHealthCheck();

        // Register resources
        environment.jersey().register(testResource);

        // Register healthchecks
        environment.healthChecks().register("test", healthCheck);

        // Start new relic reporting
        setUpNewRelicDWPluginReporter(configuration);
    }

    /**
     * @param configuration application configuration. contains new relic configs
     */
    private static void setUpNewRelicDWPluginReporter(AppConfiguration configuration) {
        try {
            Thread tt = new Thread(new Runnable() {
                public void run() {
                    Main.main(new String[0]);
                }
            });
            Executors.newSingleThreadExecutor().submit(tt);
        } catch (Exception e) {
        }
    }
}
