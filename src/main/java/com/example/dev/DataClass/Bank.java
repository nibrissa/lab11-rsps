package com.example.dev.DataClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bank {
    private int id;
    private String fullname,shortname,city;
    private Long inn,bik,coraccount,account;
}

