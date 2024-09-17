package com.flowerfulfort.springlegacy.repository;

import com.flowerfulfort.springlegacy.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {

    Optional<Account> getAccountById(String id);

    List<Account> getAccountsByName(String name);

    int addAccount(Account account);

    int deleteAccountById(String id);

    List<Account> getAccountList();
}
