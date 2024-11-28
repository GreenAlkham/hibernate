package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 1023)
    private String name;

    @Column(nullable = false, length = 1023)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String cityOfLiving;
}