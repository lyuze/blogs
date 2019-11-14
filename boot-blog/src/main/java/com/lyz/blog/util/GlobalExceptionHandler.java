package com.lyz.blog.util;

import com.lyz.blog.vo.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Response jsonErrorHandler(MyException e) throws Exception {
        Response r = new Response(false, e.getMessage());
        return r;
    }
}
