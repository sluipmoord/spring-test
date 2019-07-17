package hello;

import org.springframework.data.repository.CrudRepository;

import hello.Person;

// This will be AUTO IMPLEMENTED by Spring into a Bean called PersonRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonRepository extends CrudRepository<Person, Integer> {

}