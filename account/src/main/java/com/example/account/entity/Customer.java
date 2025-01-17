package com.example.account.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
        // if table name is not matching then use @Table(table name)

    public  class Customer extends BaseEntity{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        @GenericGenerator(name = "native", strategy = "native")
        private Long customerId;
        // if Column name is not matching then use @Column(name = "name")
        private String name;

        private String email;

        private String mobileNumber;

    }


