package com.cloud.hq.business.exception;

import com.cloud.hq.business.enums.BizResultEnum;

/**
 * @author huangqi
 * @Package com.cloud.hq.business.exception
 * @Description: 自定义业务异常
 * @date 2019-07-29 17:01
 */
public class BizException extends RuntimeException {

    private String code;

    public BizException(String message) {
        super(message);
        this.code = BizResultEnum.FAIL.getCode();
    }

    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(BizResultEnum statusEnum) {
        super(statusEnum.getDesc());
        this.code = statusEnum.getCode();
    }

    public BizException(String code, String message, Object... args) {
        super(String.format(message, args));
        this.code = code;
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
