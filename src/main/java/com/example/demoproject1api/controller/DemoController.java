package com.example.demoproject1api.controller;
import com.example.demoproject1api.entity.ResponseBody;
import com.example.demoproject1api.service.ProcessRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    ProcessRequests processRequests;

    @GetMapping("/smart-store/payment/charge/status")
    public ResponseBody getTransactionStatus(){

        ResponseBody responseBody = processRequests.processGETRequest();

        return responseBody;
    }

}
