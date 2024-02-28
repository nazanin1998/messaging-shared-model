package com.nazaninfz.messagingsharedmodel.models.request;

import com.nazaninfz.messagingsharedmodel.enums.MicroServiceRollbackStatus;
import com.nazaninfz.messagingsharedmodel.enums.RollbackRequired;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Date;
import java.util.Map;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class RequestObject {
    private String exchange;
    private String routingKey;
    private String user;
    private String userIP;
    private String useCase;
    private String commandId;
    private String sequenceId;
    private String producerName;
    private String requestBodyTypeReference;
    private Long timeout;
    private Date requestSendDate;
    private RollbackRequired rollbackRequired;
    private MicroServiceRollbackStatus msRollbackStatus;
    private Map<String, Object> requestHeader;
    private Object requestBody;
}
