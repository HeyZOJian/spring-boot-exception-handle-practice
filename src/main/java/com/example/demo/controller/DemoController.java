package com.example.demo.controller;

import com.example.demo.exception.ModuleAException;
import com.example.demo.exception.ModuleBException;
import com.example.demo.service.DemoService;
import com.example.demo.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * Created by Vito Zhuang on 1/2/2019.
 */
@RestController
@RequestMapping("/")
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("")
    public ResultBean testResultBean(){
        return ResultBean.success(Collections.singleton("data"));
    }

    @GetMapping("/a")
    public ResultBean moduleAExceptionTest() throws Exception {
        demoService.moduleAExceptionTest();
        return ResultBean.success();
    }

    @GetMapping("/b")
    public ResultBean moduleBExceptionTest() throws Exception {
        demoService.moduleBExceptionTest();
        return ResultBean.success();
    }

    @GetMapping("/unknown")
    public ResultBean unknownExceptionTest() throws Exception {
        demoService.unknownExceptionTest();
        return ResultBean.success();
    }
}
