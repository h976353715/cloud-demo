package com.cloud.hq.business.handler;

import com.cloud.hq.business.enums.BizResultEnum;
import com.cloud.hq.business.exception.BizException;
import com.cloud.hq.business.model.BizResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.UnknownHttpStatusCodeException;

/**
 * @author huangqi
 * @Package com.cloud.hq.business.handler
 * @Description: 全局异常处理
 * @date 2019-07-29 16:54
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = BizException.class)
    public BizResult handle(BizException e) {
        log.error(e.getMessage(), e);
        return new BizResult<>(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = HttpClientErrorException.class)
    public BizResult handle(HttpClientErrorException e) {
        log.error(e.getMessage(), e);
        return new BizResult(BizResultEnum.SERVER_ERROR);
    }

    @ExceptionHandler(value = HttpServerErrorException.class)
    public BizResult handle(HttpServerErrorException e) {
        log.error(e.getMessage(), e);
        return new BizResult(BizResultEnum.SERVER_ERROR);
    }

    @ExceptionHandler(value = UnknownHttpStatusCodeException.class)
    public BizResult handle(UnknownHttpStatusCodeException e) {
        log.error(e.getMessage(), e);
        return new BizResult(BizResultEnum.SERVER_ERROR);
    }

}
