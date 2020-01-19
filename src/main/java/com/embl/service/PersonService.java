package com.embl.service;

import com.embl.domainobject.PersonDO;

import java.util.List;

public interface PersonService {
    PersonDO create(PersonDO personDO);

    void delete(String firstName, String lastName);

    PersonDO update(PersonDO personDO);

    List<PersonDO> retrieve();

}
