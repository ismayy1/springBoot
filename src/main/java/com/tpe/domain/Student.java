package com.tpe.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_student")

@Getter // getters
@Setter // setters
@AllArgsConstructor // creates parameterized constructor
@NoArgsConstructor  // creates default constructor without any parameters
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)   // setter for this field won't be available
    private Long id;

    @NotNull(message = "First name cannot be null")
    @NotBlank(message = "First name cannot be white space")
    @Size(min = 2, max = 25, message = "First name '${validatedValue}' must be between {min} and {max} characters") //'${validatedValue}'=>actively checking what the user writes
    @Column(nullable = false, length = 25)  //
    private String name;
    private String lastName;
    private Integer grade;
    private String phoneNumber;

    @Column(nullable = false, length = 50, unique = true)
    @Email(message = "Provide valid email!")
    private String email;

    @Setter(AccessLevel.NONE) // setter for this field won't be available
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy HH:mm:ss", timezone = "ROMANIA")
    private LocalDateTime createdDate = LocalDateTime.now();

    // getter - setter, we can just import them from "lombok"
    // constructor is also the same
}
