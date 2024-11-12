package com.koreait.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@AllArgsConstructor
public class Computer {
    private String id;
    private Integer price;
    private LocalDateTime releaseDate;
}
