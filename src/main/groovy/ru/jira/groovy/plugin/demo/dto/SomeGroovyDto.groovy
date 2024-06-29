package ru.jira.groovy.plugin.demo.dto

import org.codehaus.jackson.annotate.JsonIgnoreProperties
import org.codehaus.jackson.annotate.JsonProperty

class SomeGroovyDto {
    @JsonProperty("someStr")
    String someStr
    @JsonProperty("someInt")
    int someInt
    @JsonProperty("someInnerGroovyDto")
    SomeInnerGroovyDto someInnerGroovyDto

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class SomeInnerGroovyDto {
        @JsonProperty("data")
        Map<String, Object> data
    }
}
