package per.xgt.service.impl;

import org.springframework.stereotype.Service;
import per.xgt.dao.IPerson;
import per.xgt.entity.Person;
import per.xgt.service.PersonService;

import javax.annotation.Resource;

/**
 * @Author: 熊根滔
 * @QQ: 3289668817
 * @CreateTime: 2020-07-30 15:45:08
 * @Descirption:
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    private IPerson iPerson;

    @Override
    public Person getPerson() {
        return iPerson.getPerson();
    }
}
