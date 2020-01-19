package com.embl.service;

import com.embl.dataaccessobject.PersonRepository;
import com.embl.domainobject.PersonDO;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private static final Logger LOG = LoggerFactory.getLogger(PersonServiceImpl.class);

    private final PersonRepository personRepository;

    public PersonServiceImpl(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonDO create(PersonDO personDO) {
        return personRepository.save(personDO);
    }

    @Override
    public void delete(String firstName, String lastName) {
        List<PersonDO> personList = findByName(firstName, lastName);

        if (personList != null) personRepository.deleteAll(personList);
    }

    @Override
    public PersonDO update(PersonDO personDO) {
        return personRepository.save(personDO);
    }

    @Override
    public List<PersonDO> retrieve() {
        return Lists.newArrayList(personRepository.findAll());
    }


    private List<PersonDO> findByName(String firstName, String lastName) {
        return personRepository.findByName(firstName, lastName);
    }

}
