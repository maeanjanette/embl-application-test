package com.embl.controller.mapper;

import com.embl.datatransferobject.PersonDTO;
import com.embl.domainobject.PersonDO;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper {
    public static PersonDO makePersonDO(PersonDTO personDTO) {
        return new PersonDO(personDTO.getId(), personDTO.getFirstName(), personDTO.getLastName(),
                personDTO.getAge(), personDTO.getFavoriteColor(), personDTO.getHobby());
    }


    public static PersonDTO makePersonDTO(PersonDO personDO) {
        return PersonDTO.newBuilder()
                .setId(personDO.getId())
                .setFirstName(personDO.getFirstName())
                .setLastName(personDO.getLastName())
                .setAge(personDO.getAge())
                .setFavoriteColor(personDO.getFavoriteColor())
                .setHobby(personDO.getHobby())
                .createPersonDTO();
    }


    public static List<PersonDTO> makePersonDTOList(Collection<PersonDO> persons) {
        return persons.stream()
                .map(PersonMapper::makePersonDTO)
                .collect(Collectors.toList());
    }
}
