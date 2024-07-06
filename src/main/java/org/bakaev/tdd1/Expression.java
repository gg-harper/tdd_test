package org.bakaev.tdd1;

public interface Expression {
    Money reduce(Bank bank, String to);
}
