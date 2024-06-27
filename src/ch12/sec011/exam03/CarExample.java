package ch12.sec011.exam03;

public class CarExample {
    public static void main(String[] args) {
        Class clazz=Car.class;
        String photo1path = clazz.getResource("photo1.jpg").getPath();
        String photo2path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1path);
        System.out.println(photo2path);
    }
}
