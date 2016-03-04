package com.example.niuxm.practice.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

/**
 * Created by niuxm on 2016/3/4.
 */
public class JsonUtils {

    private static Gson sGson = new Gson();


    /**
     * 将json对象序列化为String
     */
    public static <T> String serialize(T object) {
        return sGson.toJson(object);
    }


    /**
     * 将json string反序列化object
     */
    public static <T> T deserialize(String json, Class<T> clazz)
            throws JsonSyntaxException {
        return sGson.fromJson(json, clazz);
    }


    /**
     * 将JsonObject转化成实体类
     */
    public static <T> T deserialize(JsonObject jsonObject, Class<T> clazz)
            throws JsonSyntaxException {
        return sGson.fromJson(jsonObject, clazz);
    }


    public static <T> T deserialize(String json, java.lang.reflect.Type type)
            throws JsonSyntaxException {
        return sGson.fromJson(json, type);
    }
}
