package com.nielo.objectMaper.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private int age;
    private String email;
}
