package com.resume.backend.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class WebController {

    @RequestMapping("/hello")
    fun hello(): String {
        return "hello"
    }

    @RequestMapping("/")
    fun index(): ModelAndView {
        var mv = ModelAndView()

        // 웹 화면 이름
        mv.setViewName("index")

        // 속성이름
        mv.addObject("greeting","Hello World!!!!")

        return mv
    }

    @RequestMapping("/resume_detail")
    fun resume_detail(): ModelAndView{
        var mv = ModelAndView()

        mv.setViewName("resume_detail");

        return mv
    }

    @RequestMapping("/resume_search")
    fun resume_search(): ModelAndView{
        var mv = ModelAndView()
        mv.setViewName("resume_search")
        return mv
    }

    @RequestMapping("/resume_insert")
    fun resume_insert(): ModelAndView{
        var mv = ModelAndView()
        mv.setViewName("resume_insert")
        return mv
    }
}
