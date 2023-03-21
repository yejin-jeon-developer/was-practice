package org.example;

import org.example.RequestLine;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReuqestLineTest {
    @Test
    void create() {
        RequestLine requestline = new RequestLine("GET /calculate?operand1=1&operator=*&operand2=2 HTTP/1.1");
        assertThat(requestline).isNotNull();
        assertThat(requestline).isEqualTo(new RequestLine("GET", "/calculate", "operand1=1&operator=*&operand2=2"));
    }
}
