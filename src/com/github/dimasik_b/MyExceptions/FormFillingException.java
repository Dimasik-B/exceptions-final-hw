package com.github.dimasik_b.MyExceptions;

public class FormFillingException extends IllegalArgumentException{
    public FormFillingException() { super("Не верное количество данных"); }
}
