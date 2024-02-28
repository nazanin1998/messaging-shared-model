package com.nazaninfz.messagingsharedmodel.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Accessors(chain = true)
@Data
@AllArgsConstructor
public class TestModelInner1<T> {
    private String babe;
    private String yy;
    private T r;
}
