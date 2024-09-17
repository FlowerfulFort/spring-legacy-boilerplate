package com.flowerfulfort.springlegacy.service.impl;

import com.flowerfulfort.springlegacy.exception.AccountNotExistsException;
import com.flowerfulfort.springlegacy.model.Account;
import com.flowerfulfort.springlegacy.repository.AccountRepository;
import com.flowerfulfort.springlegacy.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    // Autowired Constructor Injection
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getAccountById(String id) {
        return accountRepository.getAccountById(id).orElseThrow(() -> new AccountNotExistsException(id));
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.getAccountList();
    }
}
