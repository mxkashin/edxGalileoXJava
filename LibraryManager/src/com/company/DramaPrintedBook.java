package com.company;

public class DramaPrintedBook extends DramaBook implements PrintedBook {
    private String dimensions;
    private String weight;

    @Override
    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    public DramaPrintedBook(String title, String author, int yearOfPublication,
                            String time, String place, String dimensions, String weight){
        super(title, author, yearOfPublication, time, place);
        this.dimensions = dimensions;
        this.weight = weight;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Weight: " + weight);
    }
}
