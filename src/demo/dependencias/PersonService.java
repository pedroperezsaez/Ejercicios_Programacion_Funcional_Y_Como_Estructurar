package demo.dependencias;

import java.util.List;

public class PersonService {

        PersonRepo personRepo;
    public PersonService(PersonRepo personRepo){
        this.personRepo=personRepo;
    }
    public List<PersonDTO> getPersonAge(int age){
       return personRepo.findAll().stream().filter(p->p.getAge()>18).map(p->new PersonDTO(p.getFirstName(),p.getAge())).toList();
    };
}
