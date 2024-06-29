package ru.jira.groovy.plugin.demo

import com.atlassian.event.api.EventPublisher
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import ru.jira.groovy.plugin.demo.service.PluginEventListener

import static org.mockito.Mockito.verify

@ExtendWith(MockitoExtension)
class PluginEventListenerTest {

    @Mock
    EventPublisher eventPublisher;

    @InjectMocks
    PluginEventListener listener;

    @Test
    void "should register plugin event listener"() {
        listener.afterPropertiesSet()

        verify(eventPublisher).register(listener)
    }

    @Test
    void "should unregister plugin event listener"() {
        listener.destroy()

        verify(eventPublisher).unregister(listener)
    }

}
