package com.flowerfulfort.springlegacy.repository.impl;

import com.flowerfulfort.springlegacy.model.Account;
import com.flowerfulfort.springlegacy.repository.AccountRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountMemoryRepository implements AccountRepository {
    private final List<Account> memory = new ArrayList<>();

    public void init() {
        memory.add(new Account("1", "name1", "pass1", "email1"));
        memory.add(new Account("2", "name2", "pass2", "email2"));
        memory.add(new Account("3", "name3", "pass3", "email3"));
    }

    @Override
    public Optional<Account> getAccountById(String id) {
        return memory.stream().filter(a -> a.getId().equals(id)).findFirst();
    }

    @Override
    public List<Account> getAccountsByName(String name) {
        return memory.stream().filter(a -> a.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public int addAccount(Account account) {
        Stream<Account> stream = memory.stream().filter(a -> a.getId().equals(account.getId()));
        if (stream.findFirst().isPresent()) {
            return 0;
        }
        memory.add(account);
        return 1;
    }

    @Override
    public int deleteAccountById(String id) {
        if (memory.removeIf(a -> a.getId().equals(id)))
            return 1;
        else return 0;
    }

    @Override
    public List<Account> getAccountList() {
        return memory;
    }

}
