package io.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;

public class LearningConfiguration extends Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName;

    @JsonProperty
    public String getTemplate(){
        return this.template;
    }

    @JsonProperty
    public void setTemplate(String template){
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName(){
        return this.defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name){
        this.defaultName = name;
    }
}
