package com.earthchen.spring.boot.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 主页控制器.
 */
@Controller
@RequestMapping("/blogs")
@Slf4j
public class BlogController {

    @GetMapping
    public String listBlogs(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
                            @RequestParam(value = "tag", required = false) Long tag) {
        log.info("order:" + order + ";tag:" + tag);
        return "redirect:/index?order=" + order + "&tag=" + tag;
    }

}