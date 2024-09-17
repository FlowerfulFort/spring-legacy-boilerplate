package com.flowerfulfort.springlegacy.service;

import com.flowerfulfort.springlegacy.model.Account;

import java.util.List;

public interface AccountService {
    Account getAccountById(String id);

    List<Account> getAllAccounts();
}
