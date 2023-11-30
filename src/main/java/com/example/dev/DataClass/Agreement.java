package com.example.dev.DataClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agreement {
    private int id;
    private String number,note;
    private LocalDate dataOpen, dataClose;
}


