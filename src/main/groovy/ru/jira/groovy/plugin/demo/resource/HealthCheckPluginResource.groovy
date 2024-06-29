package ru.jira.groovy.plugin.demo.resource

import groovy.transform.CompileStatic

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/healthcheck")
@CompileStatic
class HealthCheckPluginResource {

    @GET
    String healthCheck() {
        return "OK"
    }
}
