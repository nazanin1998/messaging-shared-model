package com.nazaninfz.messagingsharedmodel.models.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ResponseException {

    private String consumerName;
    private String serviceName;
    private String serviceNumber;
    private Integer exceptionNumber;
    private Integer statusCode;
    private String message;
    private String localeMessage;
    private String details;

}
