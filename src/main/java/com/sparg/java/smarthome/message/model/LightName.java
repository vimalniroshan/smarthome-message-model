package com.sparg.java.smarthome.message.model;

/**
 * Created by vimalniroshan on 6/13/16.
 */
public enum LightName {
    LIVING_ROOM_LIGHT("Living Room"),
    BED_ROOM_LIGHT("Bed Room");

    private String speechText;

    LightName(String speechText) {
        this.speechText = speechText;
    }

    public String getSpeechText() {
        return speechText;
    }

    public static LightName getLightName(String lightNameSlot) {
        if(lightNameSlot != null) {
            lightNameSlot = lightNameSlot.toLowerCase();
            if(lightNameSlot.contains("living") || lightNameSlot.contains("tv") || lightNameSlot.contains("hall")) {
                return LIVING_ROOM_LIGHT;
            } else if(lightNameSlot.contains("bed")) {
                return BED_ROOM_LIGHT;
            }
        }

        return null;
    }
}
