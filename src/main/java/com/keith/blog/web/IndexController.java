package com.keith.blog.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name) {
//        String blog = null;
//        if (blog == null) {
//            throw  new NotFoundExcption("博客不存在");
//        }
        System.out.println("-----index-----");
//        int i = 9 / 0;
        return "index";
    }
}
