package ch12.sec08;
import java.util.TimeZone;
public class PrintTimeZoneID {
    public static void main(String[] args) {
        String[] availavleIds=TimeZone.getAvailableIDs();
        for(String id:availavleIds) {
            System.out.println(id);
        }
    }
}
