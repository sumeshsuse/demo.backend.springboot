package com.example.demo.serviceImpl;


import com.example.demo.model.SpiritualDetails;
import com.example.demo.repository.SpiritualDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@EnableAutoConfiguration
public class SpiritualDetailsServiceImpl {

    @Autowired
    private SpiritualDetailsRepository spiritualDetailsRepository;

    public void registerSpiritualDetails(SpiritualDetails spiritualDetails) {
        System.out.println("spiritualDetails --- > " + spiritualDetails);
        spiritualDetailsRepository.save(spiritualDetails);
    }

    public List<SpiritualDetails> fetchAllContent() {
        return spiritualDetailsRepository.findAll();
    }

    public void deleteById(int id) {
         spiritualDetailsRepository.deleteById(id);
    }

    public Optional<SpiritualDetails> getContetntById(int id) {
       return spiritualDetailsRepository.findById(id);
    }

    public List<SpiritualDetails> getLabelContent(String label) {
        return spiritualDetailsRepository.getLabelContent(label);
    }

    public List<SpiritualDetails> getContentSearch(String message) {
        return spiritualDetailsRepository.getMessagesContent(message);
    }



}
