package IteratorPattern.dinermerger;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
//        Without iterators
//        printMenu();
//        With iterators
        waitress.printMenu();
    }

    /*
     * Without the Waitress, we need the code below...
     */
    public static void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] lunchItems = dinnerMenu.getMenuItems();

//        Hiding implementation
        System.out.println("USING FOR EACH");
        for (MenuItem menuItem : breakfastItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        for (MenuItem menuItem : lunchItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

//        Exposing implementation
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}
