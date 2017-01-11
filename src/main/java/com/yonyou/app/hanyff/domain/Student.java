package com.yonyou.app.hanyff.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import com.yonyou.app.hanyff.domain.enumeration.SEX;

/**
 * A Student.
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "grade", precision=10, scale=2)
    private BigDecimal grade;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private SEX sex;

    @Column(name = "sno")
    private String sno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public Student age(Integer age) {
        this.age = age;
        return this;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public Student grade(BigDecimal grade) {
        this.grade = grade;
        return this;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public SEX getSex() {
        return sex;
    }

    public Student sex(SEX sex) {
        this.sex = sex;
        return this;
    }

    public void setSex(SEX sex) {
        this.sex = sex;
    }

    public String getSno() {
        return sno;
    }

    public Student sno(String sno) {
        this.sno = sno;
        return this;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        if (student.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", age='" + age + "'" +
            ", grade='" + grade + "'" +
            ", sex='" + sex + "'" +
            ", sno='" + sno + "'" +
            '}';
    }
}
