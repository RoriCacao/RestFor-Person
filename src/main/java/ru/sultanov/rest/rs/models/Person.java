package ru.sultanov.rest.rs.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "age")
    @Min(value = 0,message = "Name should be greater than zero")
    private int age;

    @Column(name = "name")
    @NotEmpty(message = "Name should not br empty")
    @Size(min = 2,max = 30,message = "Name should be between 2 and 30 characters")
    private String name;

    @Column(name = "email")
    @Email
    @NotEmpty(message = "Email should not be empty")
    private String email;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "created_who")
    @NotEmpty
    private String createdWho;


}





