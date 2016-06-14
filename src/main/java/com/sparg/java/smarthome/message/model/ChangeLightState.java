package com.sparg.java.smarthome.message.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by vimalniroshan on 6/13/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeLightState {
    private LightName lightName;
    private LightState lightState;

    public ChangeLightState() {
    }

    public ChangeLightState(LightName lightName, LightState lightState) {
        this.lightName = lightName;
        this.lightState = lightState;
    }

    public LightName getLightName() {
        return lightName;
    }

    public void setLightName(LightName lightName) {
        this.lightName = lightName;
    }

    public LightState getLightState() {
        return lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }
}
