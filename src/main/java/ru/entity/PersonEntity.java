package ru.entity;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idperson" , length = 6, nullable = false, columnDefinition = "serial" )
    private long idperson;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "lastname", length = 50)
    private String lastname;
    @Column(name = "age")
    private Integer age;

    public PersonEntity() {}    // Конструктор

    public long getIdperson() {        return idperson;    }
    public void setIdperson(long idperson) {        this.idperson = idperson;    }
    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }
    public String getLastname() {        return lastname;    }
    public void setLastname(String lastname) {        this.lastname = lastname;    }
    public Integer getAge() {        return age;    }
    public void setAge(Integer age) {        this.age = age;    }

}
