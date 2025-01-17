package com.example.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data // all getter setter, hashcode,

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")

    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )

    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty")
    @Schema(
            description = "Account Number of Eazy Bank account", example = "3454433243"
    )

    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty")
    @Schema(
            description = "Eazy Bank branch address", example = "123 NewYork"
    )
    private String branchAddress;
}
