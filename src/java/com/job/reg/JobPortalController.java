/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.job.reg;

  
import java.util.List;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class JobPortalController {
    private JobseekerDAO jobseekerdao;
    @RequestMapping("/form")
      public ModelAndView showform(){  
 
        return new ModelAndView("form","command",new Jobseeker());  
    }  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("jobseeker") Jobseeker jobseeker){
        jobseekerdao.saveJobSeeker(jobseeker);
          
        System.out.println(jobseeker.getName()+" your registration is successful ");  
          
        return new ModelAndView("redirect:/success");//will redirect to viewemp request mapping  
    }  
      
    @RequestMapping(value="/view",method = RequestMethod.POST)  
    public ModelAndView view(@ModelAttribute("jobseeker")Jobseeker jobseeker){  
        List<Jobseeker> list ;
        list=jobseekerdao.getDetails();
        return new ModelAndView("viewdetails","list",list);
        
    }  
   
}
