package com.example.demo.service;

import com.example.demo.exception.ModuleAException;
import com.example.demo.exception.ModuleBException;
import org.springframework.stereotype.Service;

/**
 * Created by Vito Zhuang on 1/2/2019.
 */
@Service
public class DemoService {
    public void moduleAExceptionTest(){
        throw new ModuleAException();
    }

    public void moduleBExceptionTest(){
        throw new ModuleBException();
    }

    public void unknownExceptionTest() throws Exception {
        throw new Exception();
    }
}
