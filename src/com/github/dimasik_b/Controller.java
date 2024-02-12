package com.github.dimasik_b;

import com.github.dimasik_b.Model.ContactCreator;
import com.github.dimasik_b.MyExceptions.FormFillingException;
import com.github.dimasik_b.MyExceptions.IncorrectFormatException;

import java.util.Scanner;

public class Controller {

    public void readData() throws FormFillingException, IncorrectFormatException {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        new ContactCreator().createContact(data);
    }

}
