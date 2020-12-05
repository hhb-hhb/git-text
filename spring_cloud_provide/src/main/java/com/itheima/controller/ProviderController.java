package com.itheima.controller;

import com.itheima.domin.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @GetMapping("/findById/{id}")
    public Goods findById(@PathVariable("id") int id){
        return new Goods(1,"华为手机",1000,100);
    }
}
