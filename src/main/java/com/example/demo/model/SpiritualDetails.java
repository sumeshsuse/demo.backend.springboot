package com.example.demo.model;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;



@Getter
@Setter
@ToString
@Entity
@Component
public class SpiritualDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    String owner;
    @Column(length = 200000)
    String message;
//    @JsonFormat(pattern="yyyy-MM-dd")
//    @Column(name = "date")
  //  Date date;
    String date;
    String poster;
    String label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
