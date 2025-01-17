package com.example.account.mapper;

import com.example.account.dto.AccountsDto;
import com.example.account.entity.Accounts;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsdto) {
        accountsdto.setAccountNumber(accounts.getAccountNumber());
        accountsdto.setAccountType(accounts.getAccountType());
        accountsdto.setBranchAddress(accounts.getBranchAddress());
        return accountsdto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsdto, Accounts accounts) {
        accounts.setAccountNumber(accountsdto.getAccountNumber());
        accounts.setAccountType(accountsdto.getAccountType());
        accounts.setBranchAddress(accountsdto.getBranchAddress());
        return accounts;
    }
}