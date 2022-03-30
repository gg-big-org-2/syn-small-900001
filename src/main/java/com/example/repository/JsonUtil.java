package com.example.github;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static JsonNode parseJson(String jsonString) throws IOException {
        return mapper.readTree(jsonString);
    }

    public static <T> T deserialize(String json, Class<T> clazz) throws IOException {
        return mapper.readValue(json, clazz);
    }

    public static String serialize(Object obj) throws IOException {
        return mapper.writeValueAsString(obj);
    }
}
