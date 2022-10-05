package IteratorPattern.implicit;


import java.util.List;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for (MenuItem m : breakfastItems) {
            printMenuItem(m);
        }

        MenuItem[] lunchItems = ((DinnerMenu) dinnerMenu).getMenuItems();
        for (MenuItem m : lunchItems) {
            printMenuItem(m);
        }
    }

    private void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
}
