package com.embl.dataaccessobject;

import com.embl.domainobject.PersonDO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<PersonDO, Long> {
    List<PersonDO> findByName(String firstName, String lastName);
}
