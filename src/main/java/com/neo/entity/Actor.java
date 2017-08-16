package com.neo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Actor {

    @Id
    @GeneratedValue
    private int actor_id;
    @NotNull
    @Column(unique = true)
    private String name;
    private String realname;
    private int age;
    private int filmid;
    private String disc;

    @ManyToMany(fetch = FetchType.EAGER)//立即从数据库中进行加载数据;
    @JoinTable(name = "Film_Actor", joinColumns = {@JoinColumn(name = "actor_id")},
            inverseJoinColumns = {@JoinColumn(name = "film_id")})
    private List<Film> filmList;


    @Override
    public String toString() {
        return "Actor{" +
                "id=" + actor_id +
                ", name='" + name + '\'' +
                ", realname='" + realname + '\'' +
                ", age=" + age +
                ", filmid=" + filmid +
                ", disc='" + disc + '\'' +
                '}';
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }
}
