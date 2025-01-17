package com.example.account.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data // all getter setter, hashcode,
public class AccountsDto {
    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty")
    private String branchAddress;
}
