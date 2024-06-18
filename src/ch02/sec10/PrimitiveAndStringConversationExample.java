package ch02.sec10;

public class PrimitiveAndStringConversationExample {
    public static void main(String[] args) {
        //      String에서 primitive type으로 변환시 "타입.parse타입"의형태로 변환
        int value1=Integer.parseInt("10");
        double value2=Double.parseDouble("3.14");
        boolean value3=Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        String str1=String.valueOf(10);
        String str2=String.valueOf(3.14);
        String str3=String.valueOf(true);

        System.out.println("Str1 = " + str1);
        System.out.println("Str2 = " + str2);
        System.out.println("Str3 = " + str3);
    }
}
