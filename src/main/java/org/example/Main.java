package org.example;

import java.io.IOException;

// GET /calculate?operand1=1&operator=*&operand2=2
public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }
}
