package list;

import java.util.ArrayList;
import java.util.Iterator;

public class C_04_ArrayList_Iterator {

    public static void main(String[] args) {

        ArrayList<String> obj1 = new ArrayList<String>();

        obj1.add("Selenium Webdriver");
        obj1.add("QTP");
        obj1.add("Postman");
        obj1.add("Jmeter");
        obj1.add("Appium");

        Iterator<String> itr = obj1.iterator();
        while (itr.hasNext()) {
            String val = itr.next();
            System.out.println("Element is : " + val);
        }
    }
}
