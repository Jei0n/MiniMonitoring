package org.monitoring.healthcheck.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HealthCheckControllerTest {

    @Test
    void whenPing_thenReturnActive() {
        HealthCheckController controller = new HealthCheckController();

        String response = controller.ping();

        assertEquals("active", response);
    }
}