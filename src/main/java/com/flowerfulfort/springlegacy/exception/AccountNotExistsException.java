package com.flowerfulfort.springlegacy.exception;

public class AccountNotExistsException extends RuntimeException {
    public AccountNotExistsException(String id) {
        super("Given id " + id + " does not exist");
    }
}
