/**
 * Created by student on 5/11/14.
 */
public class Lab1 {
    public static void main(String[] args) {
        String name = "Easter Bunny";
        int hourOfDay = 18;
        String greeting = null;
        if(hourOfDay < 12) {
            greeting = "Good Morning";
        } else {
            greeting = "Good Afternoon";
        }
        System.out.println(greeting + " " + name + ". How are you today?");
    }
}
