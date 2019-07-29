package com.cloud.hq.business.aop;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author huangqi
 * @Package com.cloud.hq.business.aop
 * @Description: 日志
 * @date 2019-07-29 16:28
 */
@Aspect
@Component
public class WebLogAspect {

    private static Logger log = LoggerFactory.getLogger(WebLogAspect.class);

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    /**
     * 所有@RequestMapping注解的方法
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void webLog() {
    }

    /**
     * 请求前日志
     *
     * @param joinPoint
     * @throws Throwable
     */
    @Before("webLog()")
    public void reqLog(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
        //请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.info("请求IP:" + request.getRemoteAddr());
        log.info("请求地址:" + request.getRequestURL().toString());
        log.info("请求方式:" + request.getMethod());
        log.info("请求类方法:" + joinPoint.getSignature());
        log.info("请求类方法参数:" + JSONObject.toJSONString(joinPoint.getArgs(), true));
    }

    /**
     * 请求后日志
     *
     * @param returnMsg
     * @throws Throwable
     */
    @AfterReturning(returning = "returnMsg", pointcut = "webLog()")
    public void respLog(Object returnMsg) throws Throwable {
        log.debug("请求返回：", JSONObject.toJSONString(returnMsg));
        log.info("请求完毕，耗时: {}ms", System.currentTimeMillis() - startTime.get());
    }


}
