package org.swinglife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   
public class HomeController {  
      
    /*** 
     * 
     * 使用注解@Controller将HomeController类定义为一个Controller,并且在方法中通过@RequestMapping(“value”)来指定所需要访问的路径或者方法名
     * 
     * 首页 返回至/page/home.jsp页面 
     * @return 
     */

    @RequestMapping("succ")  
    public ModelAndView index(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面  
        ModelAndView mav = new ModelAndView("home");  
        return mav;  
    }  
}  