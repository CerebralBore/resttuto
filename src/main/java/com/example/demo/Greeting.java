package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Greeting
 */
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Greeting {
    private String phrase;
    private String name;
    
}