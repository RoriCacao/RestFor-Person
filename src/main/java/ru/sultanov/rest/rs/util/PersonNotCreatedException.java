package ru.sultanov.rest.rs.util;

public class PersonNotCreatedException extends RuntimeException {


    public PersonNotCreatedException(String msg){
        super(msg); //Отдаем месадж в класс родитедя RuntimeException он тоже принимает строку
    }
}
