package com.github.jianzh5.composite;

/**
 * <p>
 * <code>MenuTestDrive</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/6下午8:23
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");

        MenuComponent dinnerMenu = new Menu("Dinner Menu","Lunch");

        MenuComponent cofaMenu = new Menu("COFA Menu","Dinner");

        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course");

        MenuComponent allMenu = new Menu("All MENUS","All menus combined");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(cofaMenu);


        pancakeHouseMenu.add(new MenuItem("PancakMenuItem","PancakMenuItem",true,4.99));
        dinnerMenu.add(new MenuItem("Pasta","bread",true,1.99));
        dessertMenu.add(new MenuItem("Apple Pie","Apple Pie with a flakey crust",true,5.66));

        dinnerMenu.add(dessertMenu);


        allMenu.add(dinnerMenu);

        Waitress waitress = new Waitress(allMenu);

//        waitress.printMenu();

        waitress.printVegetarianMenu();


    }
}
