package com.cloud.hq.business.model;

import com.alibaba.fastjson.JSON;
import com.cloud.hq.business.enums.BizResultEnum;

import java.io.Serializable;

/**
 * @author huangqi
 * @Package com.cloud.hq.business.model
 * @Description: 返回实体
 * @date 2019-07-29 16:46
 */
public class BizResult<T> implements Serializable {

    /**
     * 返回编码
     */
    private String respCode;
    /**
     * 返回描述
     */
    private String respDesc;

    /**
     * 返回实体数据
     */
    private T respData;

    public BizResult() {
    }

    public BizResult(BizResultEnum BizResultEnum) {
        this.respCode = BizResultEnum.getCode();
        this.respDesc = BizResultEnum.getDesc();
    }

    public BizResult(BizResultEnum BizResultEnum, T respData) {
        this.respCode = BizResultEnum.getCode();
        this.respDesc = BizResultEnum.getDesc();
        this.respData = respData;
    }

    public BizResult(String respCode, String respDesc) {
        this.respCode = respCode;
        this.respDesc = respDesc;
    }

    public BizResult(String respCode, String respDesc, T respData) {
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.respData = respData;
    }

    public static <T> BizResult<T> ok() {
        return new BizResult<>(BizResultEnum.SUCCESS.getCode(), BizResultEnum.SUCCESS.getDesc());
    }

    public static <T> BizResult<T> ok(T t) {
        return new BizResult<>(BizResultEnum.SUCCESS.getCode(), BizResultEnum.SUCCESS.getDesc(), t);
    }

    public static <T> BizResult<T> fail() {
        return new BizResult<>(BizResultEnum.FAIL.getCode(), BizResultEnum.FAIL.getDesc());
    }

    public static <T> BizResult<T> fail(T t) {
        return new BizResult<>(BizResultEnum.FAIL.getCode(), BizResultEnum.FAIL.getDesc(), t);
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
