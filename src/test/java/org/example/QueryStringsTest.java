package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringsTest {
    @Test
    void createTest() {
        QueryStrings queryStrings = new QueryStrings("operand1=1&operator=*&operand2=2"); //List<QueryString>
        assertThat(queryStrings).isNotNull();
    }
}
