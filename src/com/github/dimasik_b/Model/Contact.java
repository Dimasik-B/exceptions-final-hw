package com.github.dimasik_b.Model;

public class Contact {
    private String surname;
    private String name;
    private String patronymic;
    private String birthDate;
    private String phoneNumber;
    private String sex;

    public Contact(String[] data) {
        this.surname = data[0];
        this.name = data[1];
        this.patronymic = data[2];
        this.birthDate = data[3];
        this.phoneNumber = data[4];
        this.sex = data[5];
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", surname, name, patronymic, birthDate, phoneNumber, sex);
    }
}
