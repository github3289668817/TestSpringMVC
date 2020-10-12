package per.xgt.entity;

import java.io.Serializable;

/**
 * @Author: 熊根滔
 * @QQ: 3289668817
 * @CreateTime: 2020-07-30 15:40:13
 * @Descirption:
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 8054769357110491578L;

    private Integer personId;
    private String personName;
    private Integer personAge;

    public Person() {
    }

    public Integer getPersonId() {
        return personId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public Person(Integer personId, String personName, Integer personAge) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
    }
}
