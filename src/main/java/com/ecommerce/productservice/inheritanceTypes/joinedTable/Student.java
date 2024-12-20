package com.ecommerce.productservice.inheritanceTypes.joinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_students")
@PrimaryKeyJoinColumn(name = "user_id")
public class Student extends User {
    private double psp;
}
