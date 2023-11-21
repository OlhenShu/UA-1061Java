package Arrays.Loops.Homework.Task3;

public class Car {
    private  String type;
    private   int year;
    private  int engineCapacity;

    public  Car(String type, int year, int engineCapacity){
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
