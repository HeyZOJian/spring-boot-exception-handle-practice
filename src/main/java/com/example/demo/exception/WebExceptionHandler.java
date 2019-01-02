package com.example.demo.exception;

import com.example.demo.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Vito Zhuang on 1/2/2019.
 */
@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(ModuleBExceptionHandler.class);

    @ExceptionHandler
    public ResultBean moduleBException(Exception e) {
        log.error("Unknown Exception", e);
        return ResultBean.error(-1, "Unknown Exception");
    }
}
