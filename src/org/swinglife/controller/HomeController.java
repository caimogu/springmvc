package org.swinglife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   
public class HomeController {  
      
    /*** 
     * 
     * ʹ��ע��@Controller��HomeController�ඨ��Ϊһ��Controller,�����ڷ�����ͨ��@RequestMapping(��value��)��ָ������Ҫ���ʵ�·�����߷�����
     * 
     * ��ҳ ������/page/home.jspҳ�� 
     * @return 
     */

    @RequestMapping("succ")  
    public ModelAndView index(){  
        //����ģ�͸���ͼ��������Ⱦҳ�档����ָ��Ҫ���ص�ҳ��Ϊhomeҳ��  
        ModelAndView mav = new ModelAndView("home");  
        return mav;  
    }  
}  