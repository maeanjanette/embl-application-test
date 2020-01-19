package com.embl.datatransferobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonDTO {
    @JsonIgnore
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Integer age;

    @NotNull
    private String favoriteColor;

    @NotNull
    private List<String> hobby;

    private PersonDTO() {
    }

    public PersonDTO(Long id, String firstName, String lastName, Integer age, String favoriteColor, List<String> hobby) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.hobby = hobby;
    }

    public static PersonDTOBuilder newBuilder() {
        return new PersonDTOBuilder();
    }

    @JsonProperty
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public static class PersonDTOBuilder {
        private Long id;
        private String firstName;
        private String lastName;
        private Integer age;
        private String favoriteColor;
        private List<String> hobby;

        public PersonDTOBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public PersonDTOBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonDTOBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonDTOBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public PersonDTOBuilder setFavoriteColor(String favoriteColor) {
            this.favoriteColor = favoriteColor;
            return this;
        }

        public PersonDTOBuilder setHobby(List<String> hobby) {
            this.hobby = hobby;
            return this;
        }

        public PersonDTO createPersonDTO() {
            return new PersonDTO(id, firstName, lastName, age, favoriteColor, hobby);
        }

    }
}
