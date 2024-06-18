package ch03.sce01;

public class IncreaseDecreaseOprerationExample {
    public static void main(String[] args) {
        int x=10;
        int y=10;
        int z;

        x++; //x는 11
        ++x; //x는 12
        System.out.println("x = " + x);
        System.out.println("-------------");
        y--;//y=9
        --y;//y=8
        System.out.println("y = " + y);
        System.out.println("-------------");

        z=x++; //x값을 z에 넣고 x를 1증가시킨다
        System.out.println("z = " + z); //12
        System.out.println("x ="+x);//13
        System.out.println("--------------");

        z=++x; //x를 1증가시키고 x값을 z에 넣는다
        System.out.println("z = " + z); //14
        System.out.println("x ="+x);//14
        System.out.println("--------------");
        z=++x + y++; // x1를 1증가시키고 x+y를 한후 y값을 1증가
        System.out.println("z = " + z); //23
        System.out.println("x ="+x);//15
        System.out.println("y="+y);//9
        System.out.println("--------------");
    }
}
