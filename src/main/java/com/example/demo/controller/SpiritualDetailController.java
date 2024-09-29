package com.example.demo.controller;


import com.example.demo.model.SpiritualDetails;
import com.example.demo.serviceImpl.SpiritualDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SpiritualDetailController {

    

    @Autowired
    SpiritualDetailsServiceImpl spiritualDetailsServiceImpl;

    @RequestMapping(value = "/registerContent", method = RequestMethod.POST)
    public ResponseEntity<Object> createContent(@RequestBody SpiritualDetails spiritualDetails) {
        spiritualDetailsServiceImpl.registerSpiritualDetails(spiritualDetails);
        return new ResponseEntity<>("spiritual content is created successfully", HttpStatus.CREATED);
    }

    @GetMapping("/getAllContent")
    public ResponseEntity<?> getFetchAllContent() {
        List<SpiritualDetails> fetchAllObj = spiritualDetailsServiceImpl.fetchAllContent();
        return new ResponseEntity<>(fetchAllObj, HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteContent/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> deleteById(@PathVariable("id") int id) {
       spiritualDetailsServiceImpl.deleteById(id);
        return new ResponseEntity<>(null, HttpStatus.FOUND);
    }

    @GetMapping(value = "/getContentById/{id}")
    @ResponseBody
    public ResponseEntity<?> getContentById(@PathVariable("id") int id) {
        Optional<SpiritualDetails> getContentObj = spiritualDetailsServiceImpl.getContetntById(id);
        return new ResponseEntity<>(getContentObj, HttpStatus.OK);
    }

    @RequestMapping(value = "/getcontentlabel/{label}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getContentByLabel(@PathVariable("label") String label) {
        List<SpiritualDetails> getContentLabelObj;
        if(label.equals("All")){
             getContentLabelObj = spiritualDetailsServiceImpl.fetchAllContent();
        }else {
             getContentLabelObj = spiritualDetailsServiceImpl.getLabelContent(label);
        }
        return new ResponseEntity<>(getContentLabelObj, HttpStatus.OK);
    }

    @RequestMapping(value = "/getcontentmessage/{message}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getContentByMessage(@PathVariable("message") String message) {
        System.out.println("message ----> "+message);
        List<SpiritualDetails> getContentMessageObj;
            getContentMessageObj = spiritualDetailsServiceImpl.getContentSearch(message);
        return new ResponseEntity<>(getContentMessageObj, HttpStatus.OK);
    }




}
