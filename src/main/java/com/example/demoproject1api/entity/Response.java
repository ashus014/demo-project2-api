package com.example.demoproject1api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Response {

    String merchantTransactionId;
    String status;
    int amount;
    String currencyCode;
    String amazonTransactionId;
    String statusDescription;
    String timeStamp;

}
