package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yangyu on 2017/1/18.
 */

/**
 * 使用SpringMVC中DispatcherServlet的processDispatchResult方法将异常转发到这里进行处理
 *
 */
@ControllerAdvice
@RestControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest request,Exception e){
        return "对不起，服务器出现问题，请联系管理员";
    }
}
