package wt.example.springbucks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wt.example.springbucks.model.CoffeeOrder;
import wt.example.springbucks.request.NewCoffeeRequest;
import wt.example.springbucks.request.NewOrderRequest;

/**
 * Created by wangtie on 2021/2/24
 */

@RestController
@RequestMapping("/order")
@Slf4j
public class CoffeeOrderController {

    public CoffeeOrder getOrder(@PathVariable("id") Long id) {

    }

    public CoffeeOrder create(@RequestBody NewOrderRequest newOrder) {

    }
}
