package com.company;

import java.sql.SQLSyntaxErrorException;

public class DramaBook extends Book {
    private String place;
    private String time;

    public DramaBook(String title, String author, int yearOfPublication,
                     String time, String place){
        super(title, author, yearOfPublication);
        this.place = place;
        this.time = time;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Time: " + time);
        System.out.println("Place: " + place);
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }
}
