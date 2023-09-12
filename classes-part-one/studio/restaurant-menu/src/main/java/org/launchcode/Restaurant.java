package org.launchcode;

public class Restaurant {

    public static void main(String[] args) {
            // write your code here
            Menu menu = new Menu();

            MenuItem pizza = new MenuItem("Pizza", "Cheese bread","Dinner", 15.99);
            MenuItem chickenPasta = new MenuItem("Chicken Pasta", "Fettuccine with grilled free roam chicken ","Dinner", 18.99);
            MenuItem iceCream = new MenuItem("Ice Cream", "Vanilla butter churned","Dessert", 5.99);
            MenuItem water = new MenuItem("Water", "Spring Water","Beverage");
            MenuItem wine = new MenuItem("Wine", "Italian wine","Alcohol", 19.99);

            menu.addMenuItem(pizza);
            menu.addMenuItem(chickenPasta);
            menu.addMenuItem(iceCream);
            menu.addMenuItem(water);
            menu.addMenuItem(wine);
            menu.deleteMenuItem(wine);

            System.out.println(pizza.getMenuItem());

            menu.printMenu();

        }
        
}
