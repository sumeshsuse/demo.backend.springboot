package com.example.demo.service;

import com.example.demo.model.ExpenditureUser;

import java.util.Optional;

public interface ExpenditureUserService {
    public abstract void EnterUserDetails(ExpenditureUser expenditureUser);
    public abstract Optional<ExpenditureUser> fetchUserExpenditureDetails(int id);
}
