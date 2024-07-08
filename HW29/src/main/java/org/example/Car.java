package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString

public class Car {
    @NonNull private String mark;
    @NonNull private int age;
    private int price;
    private String color;
}
