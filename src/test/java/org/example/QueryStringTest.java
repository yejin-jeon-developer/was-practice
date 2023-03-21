package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {
   //QueryString 여러개면 List<QueryString> --> 일급컬렉션
    @Test
    void createTest() {
        QueryString queryString = new QueryString("operand", "1");
        assertThat(queryString).isNotNull();

    }
}
