package com.cydeo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    // we are gonna implement Double Column operator with constructor

    private String make ;
    private int year;

    public Car(int year){
        this.year =year;
    }




}
