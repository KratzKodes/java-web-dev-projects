package org.launchcode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {

    private String name;
    private double price;
    private String description;

    private String category;
    private boolean available = true;


    public MenuItem(String name, String description, String category, double price ){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;

    }

    public MenuItem(String name, String description, String category){
        this(name,description,category,0);
    }

    String getName(){
        return name;
    }

    String getDescription(){
        return description;
    }

    String getCategory(){
        return category;
    }

    public boolean isAvailable() {
        return available;
    }

    String getMenuItem(){
        return "\t"+ name + " : " + description + " ( $"+ price + " ) " + "~ " + category;
    }

}
