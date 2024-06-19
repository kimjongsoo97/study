package ch06.sec11.exam02;

public class Earth {
//상수 선언및 초기화
    static final double EARTH_RADIUS = 6400;
//    상수선언
    static final double EARTH_SURFACE_AREA;
    static{
//        정적블롥에서 상수 초기화
        EARTH_SURFACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
    }
}
