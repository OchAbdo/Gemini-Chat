package com.example.chatgemini.controllors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.chatgemini.Models.Question;
import com.example.chatgemini.services.GeminiService;

@RestController
public class GeminiControllor {

    @Autowired
    private GeminiService geminiService ;


    @PostMapping("/ask")
    public ResponseEntity<String> askQuestion(@RequestBody Question payload){
        String question = payload.getContent();
        String answer = geminiService.getAnswer(question);
        return new ResponseEntity<>(answer , HttpStatus.OK);
    }
}
