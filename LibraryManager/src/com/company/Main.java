package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ScienceFictioneAudioBook book1 = new ScienceFictioneAudioBook("The Android Invasion",
                "J.Morgan", 2017, "Technology", 12, "8mb");
        book1.print();
        System.out.println("------------------------------");
        DramaPrintedBook book2 = new DramaPrintedBook("The Inheritance",
                "A. Carson", 1965, "Medieval", "Europe",
                "5.6 x 2.8 x 8.3 inches", "1.6 pounds");
        book2.print();
    }
}
