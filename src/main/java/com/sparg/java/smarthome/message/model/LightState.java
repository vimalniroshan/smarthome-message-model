package com.sparg.java.smarthome.message.model;

/**
 * Created by vimalniroshan on 6/13/16.
 */
public enum LightState {
    ON,
    OFF;

    public static LightState getLightState(String lightStateSlot) {
        if(lightStateSlot != null) {
            lightStateSlot = lightStateSlot.toLowerCase();
            if(lightStateSlot.contains("on")) {
                return ON;
            } else if(lightStateSlot.contains("off")) {
                return OFF;
            }
        }

        return null;
    }
}
