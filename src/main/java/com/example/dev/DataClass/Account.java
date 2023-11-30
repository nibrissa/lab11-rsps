package com.example.dev.DataClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    int id,bank_id,aggrement_id,type_id;
    String account;
    Bank bank;
    Agreement agreement;
    Type type;
}

