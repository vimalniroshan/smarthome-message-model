package com.sparg.java.smarthome.message.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by vimalniroshan on 6/13/16.
 */
public class JSONUtil {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJSON(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T toObject(String jsonString, Class<T> objectType) {
        try {
            return mapper.readValue(jsonString, objectType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static <T> T toObject(byte[] bytes, Class<T> objectType) {
        try {
            return mapper.readValue(bytes, objectType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
