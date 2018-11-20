package com.hibernate.test.common;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Description
 * @Author LANRY
 * @Date 2018-11-19 17:08
 * @Company www.midea.com
 */
public class ModelResult<T> extends BaseResult {

    @ApiModelProperty("返回结果")
    private T t;

    public T getResult() {
        return t;
    }

    public void setResult(T t) {
        this.t = t;
    }
}
