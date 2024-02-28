package com.nazaninfz.messagingsharedmodel.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Accessors(chain = true)
@Data
@AllArgsConstructor
public class TestModel<T> {
    private String name;
    private String familyName;
    private int age;
    private Integer year;
    private T t;
//    public boolean d(){
//        TypeReference
//        new TypeReference<TestModel>(){}.toString()
//        new RequestObject().setRequestBody(new ArrayList<>());
//                setTypeReference(new TypeReference<TestModel>(){});
//        return true;
//    }
}
