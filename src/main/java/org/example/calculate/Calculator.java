package org.example.calculate;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AddtionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calcuate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperators.stream().filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

//    리팩토링 1
//        return ArithmeticOperator.calculate(operand1, operator, operand2);

//    최초 코드
//        if ("+".equals(operator)) {
//            return operand1 + operand2;
//        } else if ("-".equals(operator)) {
//            return operand1 - operand2;
//        } else if ("*".equals(operator)) {
//            return operand1 * operand2;
//        } else if ("/".equals(operator)) {
//            return operand1 / operand2;
//        }
//        return 0;
    }
}
