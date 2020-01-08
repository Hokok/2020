package com.example.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * json 工具类.
 *
 * @author PC 2020/1/8 14:13
 */
public final class JsonUtils {

    /*** objectMapper ***/
    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * json 转换成 Bean.
     *
     * @param json
     * @param clazz
     * @param <T>
     * @return
     * @throws JsonProcessingException
     */
    public static <T> T toBean(String json, Class<T> clazz) throws JsonProcessingException {
        verify(json, clazz);
        return objectMapper.readValue(json, clazz);
    }


    /**
     * 基本校验.
     *
     * @param resource
     * @param clazz
     */
    private static void verify(String resource, Class<?> clazz) {
        if (StringUtils.isBlank(resource)) {
            // TODO :
        }
        if (Objects.isNull(clazz)) {
            //
        }
    }

    private JsonUtils() {
    }

}
