package com.itheima.controller;

import com.itheima.domin.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("findById/{id}")
    public Goods findById(@PathVariable("id") int id) {
        //return new Goods(2, "苹果手机", 1000, 100);
        String url = "http://localhost:8000/provider/findById/" + id;
        Goods goods = restTemplate.getForObject(url, Goods.class);
        return goods;
    }
}
