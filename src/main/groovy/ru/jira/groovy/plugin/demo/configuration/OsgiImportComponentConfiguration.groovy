package ru.jira.groovy.plugin.demo.configuration

import com.atlassian.event.api.EventPublisher
import com.atlassian.plugins.osgi.javaconfig.OsgiServices
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OsgiImportComponentConfiguration {

    @Bean
    EventPublisher eventPublisher() {
        return OsgiServices.importOsgiService(EventPublisher)
    }
}
