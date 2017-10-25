package com.company;

public class ScienceFictionBook extends Book{
    private String subject;

    public ScienceFictionBook(String title, String author, int yearOfPublication,
                              String subject){
        super(title, author, yearOfPublication);
        this.subject = subject;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Subject: " + subject);
    }

    public String getSubject(){
        return subject;
    }
}
