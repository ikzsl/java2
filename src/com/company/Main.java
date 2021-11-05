package com.company;

import static com.company.GeometryCalculator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(triangle());
    }

    public static String triangle() {
        return triangleCalculator(20, 11, 10);
    }
}
