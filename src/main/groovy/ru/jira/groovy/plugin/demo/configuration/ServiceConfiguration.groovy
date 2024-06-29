package ru.jira.groovy.plugin.demo.configuration

import com.atlassian.event.api.EventPublisher
import groovy.transform.CompileStatic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.jira.groovy.plugin.demo.service.PluginEventListener
import ru.jira.groovy.plugin.demo.service.SimpleGroovyService

@Configuration
@CompileStatic
class ServiceConfiguration {

    @Bean
    PluginEventListener pluginEventListener(final EventPublisher eventPublisher) {
        return new PluginEventListener(eventPublisher)
    }

    @Bean
    SimpleGroovyService simpleGroovyService() {
        return new SimpleGroovyService()
    }
}