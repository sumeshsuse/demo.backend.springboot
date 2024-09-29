package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Entity
@Component
public class ExpenditureUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String secondname;
    private String monthofexpense;
    private String yearofexepnse;
    private int totalexpense;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getMonthofexpense() {
        return monthofexpense;
    }

    public void setMonthofexpense(String monthofexpense) {
        this.monthofexpense = monthofexpense;
    }

    public String getYearofexepnse() {
        return yearofexepnse;
    }

    public void setYearofexepnse(String yearofexepnse) {
        this.yearofexepnse = yearofexepnse;
    }

    public int getTotalexpense() {
        return totalexpense;
    }

    public void setTotalexpense(int totalexpense) {
        this.totalexpense = totalexpense;
    }
}
