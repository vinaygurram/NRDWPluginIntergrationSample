package com.backend.integrations;

import com.codahale.metrics.health.HealthCheck;

/**
 * Health Check resource
 */
public class AppHealthCheck extends HealthCheck{
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
