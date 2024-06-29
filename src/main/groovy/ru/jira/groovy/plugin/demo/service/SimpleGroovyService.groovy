package ru.jira.groovy.plugin.demo.service

import groovy.util.logging.Slf4j

@Slf4j("LOG")
class SimpleGroovyService {

    void someMethod() {
        LOG.debug("SimpleGroovyService#someMethod fired")
    }
}
