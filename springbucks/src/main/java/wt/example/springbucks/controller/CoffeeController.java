package wt.example.springbucks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import wt.example.springbucks.request.NewCoffeeRequest;

import javax.validation.Valid;


/**
 * Created by wangtie on 2021/2/23
 */
@RestController
@RequestMapping("/coffee")
@Slf4j
public class CoffeeController {

    public String addCoffeeWithoutBindingResult(@Valid NewCoffeeRequest newCoffee) {

    }

    public String addJsonCoffeeWithoutBindingResult(@Valid @RequestBody NewCoffeeRequest newCoffee) {

    }

    public List<Coffee> batchAddCoffee(@RequestParam("file") MultipartFile file) {

    }

    public List<Coffee>getAll() {}

    public Coffee getById(@PathVariable Long id) {

    }

    public Coffee getByName(@RequestParam String name) {

    }


}
