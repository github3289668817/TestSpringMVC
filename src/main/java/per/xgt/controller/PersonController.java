package per.xgt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import per.xgt.service.PersonService;

import javax.annotation.Resource;

/**
 * @Author: 熊根滔
 * @QQ: 3289668817
 * @CreateTime: 2020-07-30 15:45:57
 * @Descirption:
 */
@RestController
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping("/getPerson")
    public ModelAndView getPerson(){
        ModelAndView modelAndView = new ModelAndView("/person");
        modelAndView.addObject("person", personService.getPerson());
        return modelAndView;
    }

}
