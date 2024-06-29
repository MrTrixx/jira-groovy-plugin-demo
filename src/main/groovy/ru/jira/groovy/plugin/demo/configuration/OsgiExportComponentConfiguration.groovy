package ru.jira.groovy.plugin.demo.configuration

import com.atlassian.plugins.osgi.javaconfig.ExportOptions
import com.atlassian.plugins.osgi.javaconfig.OsgiServices
import org.osgi.framework.ServiceRegistration
import org.springframework.beans.factory.FactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import ru.jira.groovy.plugin.demo.service.SimpleGroovyService

@Configuration
class OsgiExportComponentConfiguration {

    @Bean
    FactoryBean<ServiceRegistration> exportSimpleGroovyService(SimpleGroovyService simpleGroovyService) {
        return OsgiServices.exportOsgiService(simpleGroovyService, ExportOptions.as(SimpleGroovyService));
    }
}
