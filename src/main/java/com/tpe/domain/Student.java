package com.tpe.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_student")
public class Student {

    private Long id;
    private String name;
    private String lastName;
    private Integer grade;
    private String phoneNumber;
    private LocalDateTime createdDate = LocalDateTime.now();

}
