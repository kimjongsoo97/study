package ch06.sec07.exam05;

public class Car {String company="현대자동차";
    String model;
    String color;
    int maxSpeed;



    Car(String model){
        this(model,"검정",250);
    }

    Car(String model, String color){
        this(model,color,250);
    }
//    각생성자 에서 다른 생성자를 this로 호출하고있다.
    Car(String model, String color, int maxSpeed){
        this.model=model;
        this.color=color;
        this.maxSpeed=maxSpeed;
    }
}
