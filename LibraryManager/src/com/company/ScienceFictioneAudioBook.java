package com.company;

public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioBook {

    private int numOfTracks;
    private String size;

    @Override
    public int getNumberOfTracks() {
        return numOfTracks;
    }

    @Override
    public String getSize() {
        return size;
    }

    public ScienceFictioneAudioBook(String title, String author, int yearOfPublication,
                                    String subject, int numOfTracks, String size){
        super(title, author, yearOfPublication, subject);
        this.numOfTracks = numOfTracks;
        this.size = size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of Tracks: " + numOfTracks);
        System.out.println("Size: " + size);
    }
}
