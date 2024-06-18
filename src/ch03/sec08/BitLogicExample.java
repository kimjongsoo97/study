package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 &25=" + (45 &25));
        System.out.println("45|25="+(45 |25));
        System.out.println("45^25="+(45 ^25));
        System.out.println("~45=" + (~45));
        System.out.println("--------------");
        byte receiveData=-120;

        int unsigendInt1=receiveData&255;
        System.out.println(unsigendInt1);

        int unsigendInt2=Byte.toUnsignedInt(receiveData);
        System.out.println(unsigendInt2);

        int test=136;
        byte btest=(byte)test;
        System.out.println(btest);
    }
}
