package tasks;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double mileage;

    public Car(String make,String model,int year,String color,int mileage){
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.mileage=mileage;
    }
    public Car(){}
    public void setMake(){
        this.make=make;
    }
    public void setModel(){
        this.model=model;
    }
    public void setColor(){
        this.color=color;
    }
    public void setYear(){
        this.year=year;
    }
    public void setMileage(){
        this.mileage=mileage;
    }

    public String getModel() {
        return model;
    }

    public String getMake(){
        return make;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public double getMileage(){
        return mileage;
    }

}

