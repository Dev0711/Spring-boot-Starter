package com.example.account.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor
        // if table name is not matching then use @Table(table name)

    public  class Accounts extends BaseEntity{


//        @GenericGenerator(name = "native", strategy = "native")
        private Long customerId;

        @Id
        // if Column name is not matching then use @Column(name = "name")
        private Long accountNumber;

        private String accountType;

        private String branchAddress;

    }


