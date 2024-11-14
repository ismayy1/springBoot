package com.tpe.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_student")

//@Getter // getters
//@Setter // setters
@AllArgsConstructor // creates parameterized constructor
@NoArgsConstructor  // creates default constructor without any parameters
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @NotNull(message = "First name cannot be null")
    @NotBlank(message = "First name cannot be white space")
    @Size(min = 2, max = 25, message = "First name '${validatedValue}' must be between {min} and {max} characters") //'${validatedValue}'=>actively checking what the user writes
    @Column(nullable = false, length = 25)  //
    @Getter
    @Setter
    private String name;
    private String lastName;
    private Integer grade;
    private String phoneNumber;
    private LocalDateTime createdDate = LocalDateTime.now();

    // getter - setter, we can just import them from "lombok"
    // constructor is also the same
}
