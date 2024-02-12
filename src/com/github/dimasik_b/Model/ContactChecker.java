package com.github.dimasik_b.Model;

import com.github.dimasik_b.MyExceptions.IncorrectFormatException;

import java.util.ArrayList;
import java.util.List;

public class ContactChecker {


    public void checkContact(Contact contact) throws IncorrectFormatException {
        List<String> incorrectFields = new ArrayList<>();
        if(!checkName((contact.getSurname()))) incorrectFields.add(String.format("Имя: %s", contact.getSurname()));
        if(!checkName((contact.getName()))) incorrectFields.add(String.format("Фамилия: %s", contact.getName()));
        if(!checkName((contact.getPatronymic()))) incorrectFields.add(String.format("Отчество: %s", contact.getPatronymic()));
        if(!checkBirthDate((contact.getBirthDate()))) incorrectFields.add(String.format("Дата рорждения: %s", contact.getBirthDate()));
        if(!checkPhoneNumber((contact.getPhoneNumber()))) incorrectFields.add(String.format("Номер телефона: %s", contact.getPhoneNumber()));
        if(!checkSex((contact.getSex()))) incorrectFields.add(String.format("Пол: %s", contact.getSex()));
        if(incorrectFields.size() != 0) throw new IncorrectFormatException(incorrectFields);
    }

    private boolean checkName(String data) {
         return data.matches("[a-zA-Zа-яА-Я]+");
    }

    private boolean checkBirthDate(String data) {
        int day, month, year;
        String[] date = data.split("\\.");
        if(date.length != 3) return false;
        try {
            day = Integer.parseInt(date[0]);
            month = Integer.parseInt(date[1]);
            year = Integer.parseInt(date[2]);
        } catch (NumberFormatException e){
            return false;
        }
        if (day < 1 || day > 31) return false;
        if (month < 1 || month > 12) return false;
        if (year < 1000 || year > 9999) return false;
        return true;
    }

    private boolean checkPhoneNumber(String data) {
        return data.matches("[0-9]+");
    }

    private boolean checkSex(String data) {
        return (data.equals("f") || data.equals("m"));
    }

}
