package demo.dependencias;

import java.util.List;

public class Main {
    static void main(String[] args) {
        PersonService ps=new PersonService(new PersonRepo() {
            @Override
            public List<Person> findAll() {
                return List.of(
                        new Person("Bill","Gates",60),
                        new Person("Richard","Stallman",63),
                        new Person("Paul","Allen",59),
                        new Person("Linus","Torvalds",45)
                );
            }
        });
        var result =ps.getPersonAge(56);
        System.out.println(result);
    }
}
