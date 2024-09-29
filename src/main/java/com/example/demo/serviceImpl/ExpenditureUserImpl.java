package com.example.demo.serviceImpl;

import com.example.demo.model.ExpenditureUser;
import com.example.demo.repository.ExpenditureUserRepository;
import com.example.demo.service.ExpenditureUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Transactional
@EnableAutoConfiguration
public class ExpenditureUserImpl implements ExpenditureUserService {

    @Autowired
    private ExpenditureUserRepository expenditureUserRepository;

    @Override
    public void EnterUserDetails(ExpenditureUser expenditureUser) {
        expenditureUserRepository.save(expenditureUser);
    }

    @Override
    public Optional<ExpenditureUser> fetchUserExpenditureDetails(int id){
      return  expenditureUserRepository.findById(id);
    }
}
