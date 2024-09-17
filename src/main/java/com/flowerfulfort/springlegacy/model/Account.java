package com.flowerfulfort.springlegacy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Account {
    private String id;
    private String name;
    private String password;
    private String email;
}
