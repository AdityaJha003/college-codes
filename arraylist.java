import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList <String> obj = new ArrayList<String>();
        obj.add("Aditya");
        obj.add("Arjun");
        obj.add("Sanidhya");
        obj.add("Siddharth");

        System.out.println(obj);

        obj.add(2,"Saransh");
        obj.add(3,"Hemant");

        System.out.println(obj);

        obj.remove("Siddharth");
        System.out.println(obj);

        obj.remove(1);
        System.out.println("Final arraylist: "+obj);
    }
}
