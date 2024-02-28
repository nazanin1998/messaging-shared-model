package com.nazaninfz.messagingsharedmodel.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Accessors(chain = true)
@Data
@AllArgsConstructor
public class ResponseTestModel {
    private String name;
    private String familyName;
    private int age;
    private Integer year;
    private String status;
}
