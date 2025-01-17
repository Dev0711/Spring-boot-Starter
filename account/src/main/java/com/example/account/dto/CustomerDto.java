package com.example.account.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data // all getter setter, hashcode, 
public class CustomerDto {

    @NotEmpty
    @Size(min = 5, max = 20, message = "Name should be between 5 and 20 characters")
    private String name;

    @Email(message = "Invalid email address")
    @NotEmpty(message = "Email cannot be empty")
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;

}
