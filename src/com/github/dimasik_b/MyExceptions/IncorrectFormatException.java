package com.github.dimasik_b.MyExceptions;

import java.util.List;

public class IncorrectFormatException extends IllegalArgumentException{

    public IncorrectFormatException() { super("Не верный формат данных"); }

    public IncorrectFormatException(List<String> incorrectData) {
        super(String.format("Не верный формат данных: %s", incorrectData));
    }
}
