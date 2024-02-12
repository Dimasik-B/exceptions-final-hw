package com.github.dimasik_b;

import com.github.dimasik_b.MyExceptions.FormFillingException;
import com.github.dimasik_b.MyExceptions.IncorrectFormatException;

import java.util.Scanner;

public class View {

    Controller controller;

    public View() {
        this.controller = new Controller();
    }

    public void run(){
        while(true){
            System.out.println("Введите данные, разделенные пробелом, в указанном порядке: \n" +
                    "Фамилия, Имя, Отчество, Дата рождения (dd.mm.yyyy), Номер телефона (только цифры), Пол (f/m)");
            try {
                controller.readData();
            } catch (FormFillingException | IncorrectFormatException e){
                System.out.println(e);
            } catch (RuntimeException e) {
                e.printStackTrace(System.out);
            }
            String answer = prompt();
            if(!answer.equalsIgnoreCase("y")){
                System.exit(0);
            }
        }
    }

    private String prompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите продолжить? (y/n): ");
        return scanner.nextLine();
    }


}
