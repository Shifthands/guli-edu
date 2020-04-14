package com.cxh.servicebase.handler;

import com.cxh.commonutils.R;
import com.cxh.servicebase.exception.GuliException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * GlobalExceptionHandler
 *
 * @Author: 陈晓翰
 * @CreateTime: 2020-04-11
 * @Description:
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GuliException.class)
    @ResponseBody
    public R error2(GuliException e){
        e.printStackTrace();
        return R.error().message(e.getMsg()).code(e.getCode());
    }
}