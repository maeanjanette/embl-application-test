package com.embl.domainobject;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "person"
)
public class PersonDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String favoriteColor;

    @ElementCollection
    @Column(nullable = false)
    private List<String> hobby;

    private PersonDO() {
    }

    public PersonDO(Long id, String firstName, String lastName, Integer age, String favoriteColor, List<String> hobby) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.hobby = hobby;
    }

    public Long getId() {
        return id;
    }

    public PersonDO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public PersonDO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonDO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public PersonDO setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public PersonDO setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
        return this;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public PersonDO setHobby(List<String> hobby) {
        this.hobby = hobby;
        return this;
    }
}
