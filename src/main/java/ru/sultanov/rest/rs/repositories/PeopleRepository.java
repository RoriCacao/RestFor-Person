package ru.sultanov.rest.rs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sultanov.rest.rs.models.Person;

public interface PeopleRepository extends JpaRepository<Person,Integer> {
}

