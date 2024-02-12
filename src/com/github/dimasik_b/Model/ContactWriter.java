package com.github.dimasik_b.Model;

import java.io.FileWriter;
import java.io.IOException;

public class ContactWriter {

    public void writeContact(Contact contact) throws RuntimeException{
        try(FileWriter fw = new FileWriter(contact.getSurname() + ".txt", true)){
            fw.write(contact + "\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
