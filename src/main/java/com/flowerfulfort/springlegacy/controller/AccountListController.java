package com.flowerfulfort.springlegacy.controller;

import com.flowerfulfort.springlegacy.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountListController {
    private AccountService accountService;

    public AccountListController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/accountList", method = RequestMethod.GET)
    public String getAccountList(Model model) {
        model.addAttribute("accountList", accountService.getAllAccounts());
        return "account_list";
    }
}
