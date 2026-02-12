package list;

import java.util.ArrayList;

public class C_01_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> obj1 = new ArrayList<String>();

        obj1.add("Selenium Webdriver");
        obj1.add("QTP");
        obj1.add("Postman");
        obj1.add("Jmeter");
        obj1.add("Appium");

        String output = obj1.get(2);
        System.out.println("the output is : " + output);
        System.out.println("===========================");

        System.out.println("Elements are : " + obj1);
        System.out.println("===========================");

        int listSize = obj1.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println("Elements in ArrayList : " + obj1.get(i));
            System.out.println("===========================");
        }

        for (String v : obj1) {
            System.out.println("Element is : " + v);
        }
    }
}
