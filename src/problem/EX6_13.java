package problem;

class Car2{
    String color;
    String gearTypes;
    int door;
    Car2(){
        this("green","auto",4);
    }
    Car2(String color){
        this(color,"auto",4);
    }
    Car2(String color, String gearTypes, int door){
        this.color = color;
        this.gearTypes = gearTypes;
        this.door = door;

    }
}
public class EX6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
    }
}
