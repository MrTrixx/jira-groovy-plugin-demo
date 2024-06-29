package ru.jira.groovy.plugin.demo.service

import com.atlassian.event.api.EventListener
import com.atlassian.event.api.EventPublisher
import com.atlassian.plugin.event.events.PluginEnabledEvent
import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean

@TupleConstructor(includes = ['eventPublisher'], includeFields = true, includeProperties = false, force = true)
@CompileStatic
@Slf4j("LOG")
class PluginEventListener implements InitializingBean, DisposableBean {
    private static final String PLUGIN_KEY = "ru.jira.groovy.plugin.demo.jira-groovy-plugin-demo"

    private final EventPublisher eventPublisher

    @EventListener
    void listen(final PluginEnabledEvent pluginEnabledEvent) {
        if (PLUGIN_KEY == pluginEnabledEvent.plugin.key) {
            LOG.debug("Plugin $PLUGIN_KEY enabled")
        }
    }

    @Override
    void destroy() throws Exception {
        LOG.debug("PluginEventListener#destroy fired")
        eventPublisher.unregister(this)
    }

    @Override
    void afterPropertiesSet() throws Exception {
        LOG.debug("PluginEventListener#afterPropertiesSet fired")
        eventPublisher.register(this)
    }
}
