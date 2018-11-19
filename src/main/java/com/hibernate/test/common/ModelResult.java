package com.hibernate.test.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * @Description
 * @Author LANRY
 * @Date 2018-11-19 17:08
 * @Company www.midea.com
 */
public class ModelResult<T> implements Serializable {

    private Integer code = 0;

    private String errorMsg;

    private T t;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getResult() {
        return t;
    }

    public void setResult(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        SerializerFeature[] serializerFeatures = new SerializerFeature[]{SerializerFeature.WriteMapNullValue,
                SerializerFeature.UseISO8601DateFormat};
        return JSON.toJSONString(this, serializerFeatures);
    }
}
