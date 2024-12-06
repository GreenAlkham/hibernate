package ru.netology.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(PersonID.class)
public class Person {
    @Id
    @Column(nullable = false, length = 1023)
    private String name;

    @Id
    @Column(nullable = false, length = 1023)
    private String surname;

    @Id
    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String cityOfLiving;
}
