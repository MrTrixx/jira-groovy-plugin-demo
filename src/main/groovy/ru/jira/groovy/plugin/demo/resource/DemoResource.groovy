package ru.jira.groovy.plugin.demo.resource

import groovy.transform.CompileStatic
import ru.jira.groovy.plugin.demo.dto.SomeGroovyDto

import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/demo")
@CompileStatic
class DemoResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    SomeGroovyDto demoResource(final SomeGroovyDto someGroovyDto) {
        return someGroovyDto
    }
}
