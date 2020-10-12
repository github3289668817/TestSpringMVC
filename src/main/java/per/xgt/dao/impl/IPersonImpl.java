package per.xgt.dao.impl;

import org.springframework.stereotype.Component;
import per.xgt.dao.IPerson;
import per.xgt.entity.Person;

/**
 * @Author: 熊根滔
 * @QQ: 3289668817
 * @CreateTime: 2020-07-30 15:43:18
 * @Descirption:
 */

@Component
public class IPersonImpl implements IPerson {
    @Override
    public Person getPerson() {
        Person person = new Person(1,"熊根滔",24);
        return person;
    }
}
