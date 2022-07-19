package ru.sultanov.rest.rs.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PersonDTO {

    @Min(value = 0, message = "Name should be greater than zero")
    private int age;

    @NotEmpty(message = "Name should not br empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Email
    @NotEmpty(message = "Email should not be empty")
    private String email;
}
