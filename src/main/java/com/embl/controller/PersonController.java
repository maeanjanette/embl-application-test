package com.embl.controller;

import com.embl.controller.mapper.PersonMapper;
import com.embl.datatransferobject.PersonDTO;
import com.embl.domainobject.PersonDO;
import com.embl.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(final PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonDTO create(@Valid @RequestBody PersonDTO personDTO) {
        PersonDO personDO = PersonMapper.makePersonDO(personDTO);
        return PersonMapper.makePersonDTO(personService.create(personDO));
    }

    @DeleteMapping
    public void delete(@RequestParam String firstName, @RequestParam String lastName) {
        personService.delete(firstName, lastName);
    }


    @PutMapping
    public PersonDTO update(@Valid @RequestBody PersonDTO personDTO) {
        PersonDO personDO = PersonMapper.makePersonDO(personDTO);
        return PersonMapper.makePersonDTO(personService.update(personDO));
    }


    @GetMapping
    public List<PersonDTO> retrieve() {
        return PersonMapper.makePersonDTOList(personService.retrieve());
    }
}
