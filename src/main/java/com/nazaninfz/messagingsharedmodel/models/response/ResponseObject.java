package com.nazaninfz.messagingsharedmodel.models.response;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ResponseObject {
    private String consumerName;
    private String requestBodyTypeReference;
    private Object responseBody;
    private Map<String, Object> responseHeader;
    private ResponseException responseException;
}
