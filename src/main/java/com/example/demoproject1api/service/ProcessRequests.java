package com.example.demoproject1api.service;

import com.example.demoproject1api.entity.Response;
import com.example.demoproject1api.entity.ResponseBody;
import org.springframework.stereotype.Service;

@Service
public class ProcessRequests {

    public ResponseBody processGETRequest(){

        ResponseBody responseBody = new ResponseBody();
        responseBody.setResponse(
                new Response("TESTORDERID123","PENDING", 1, "INR","Payment Not inialted", null,"12955228859000")
        );
        responseBody.setSignature("NvbUzG2MxNDYkR49up5V1iVPZFSecfaDNakWGNq8BhLYq uPsrsAa4h01iytCGSpm");
        responseBody.setRequestId("530cfb6b-a71c-4c3f-b70e-42e5d7fe7a0f");

        return responseBody;
    }
}
