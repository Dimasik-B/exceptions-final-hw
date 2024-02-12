package com.github.dimasik_b.Model;

import com.github.dimasik_b.MyExceptions.FormFillingException;

public class ContactCreator {
    Contact contact;
    ContactChecker contactChecker;
    ContactWriter contactWriter;

    public ContactCreator() {
        this.contactChecker = new ContactChecker();
        this.contactWriter = new ContactWriter();
    }

    public void createContact(String data) throws FormFillingException {
        String[] contactData = data.split(" ");
        if(contactData.length != 6) throw new FormFillingException ();
        else {
            contact = new Contact(contactData);
            contactChecker.checkContact(contact);
            contactWriter.writeContact(contact);
        }
    }
}
