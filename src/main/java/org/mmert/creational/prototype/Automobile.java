package org.mmert.creational.prototype;

public class Automobile extends Vehicle{
    public Automobile(String model, Integer year, Integer weight) {
        this.model = model;
        this.year = year;
        this.weight = weight;
    }
    private String  model;
    private Integer year;
    private Integer weight;

    @Override
    public Vehicle copy() {
        Automobile automobile = new Automobile(this.model,this.year,this.weight);
        return automobile;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
