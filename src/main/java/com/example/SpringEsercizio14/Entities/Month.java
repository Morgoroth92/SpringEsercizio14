package com.example.SpringEsercizio14.Entities;

import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Month {
    private Integer monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;
}