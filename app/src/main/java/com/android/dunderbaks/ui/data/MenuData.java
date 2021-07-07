package com.android.dunderbaks.ui.data;

import com.android.dunderbaks.R;
import com.android.dunderbaks.ui.model.MenuItem;

import java.util.LinkedList;
import java.util.List;

public class MenuData {

    List<List<MenuItem>> menuData;

    public MenuData(){
        menuData = new LinkedList<>();

        generateAppetizers();
        generateAmerAppetizers();
        generateSoupsSalads();
        generateDinnersWithSides();
        generateDinnersWithoutSides();
        generateSides();
        generateSpecialtySand();
        generateClassicSand();
        generateSausages();
        generateDessert();
        generateVegetarian();
        generateSoftDrinks();
        generateKids();
    }

    private void generateKids() {
        List<MenuItem> list = new LinkedList<>();

        menuData.add(list);
    }

    private void generateSoftDrinks() {
        List<MenuItem> list = new LinkedList<>();

        menuData.add(list);

    }

    private void generateVegetarian() {
        List<MenuItem> list = new LinkedList<>();



        menuData.add(list);

    }

    private void generateDessert() {
        List<MenuItem> list = new LinkedList<>();

        menuData.add(list);

    }

    private void generateSausages() {
        List<MenuItem> list = new LinkedList<>();

        menuData.add(list);

    }

    private void generateClassicSand() {
        List<MenuItem> list = new LinkedList<>();

        menuData.add(list);

    }

    private void generateSpecialtySand() {
        List<MenuItem> list = new LinkedList<>();

        menuData.add(list);

    }

    private void generateDinnersWithSides() {
        List<MenuItem> list = new LinkedList<>();

        menuData.add(list);

    }

    private void generateDinnersWithoutSides() {
        List<MenuItem> list = new LinkedList<>();

        list.add(new MenuItem("Hausgemacht Rotkohl",
                "$2.99",
                "Homemade sweet red cabbage cooked with pork bone, apple, and raisins. Served warm.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Raisin & Walnut Coleslaw",
                "$2.99",
                "Homemade coleslaw tossed in a green onion and mayonnaise dressing, garnished with walnuts and raisins.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Weinkraut",
                "$2.99",
                "Imported German sauerkraut fermented in white wine and caraway seed. Served warm.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Warm Sweet & Sour Potato Salad",
                "$2.99",
                "American style warm potato salad with red wine vinegar, onion, and cured ham. Served warm.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("German Kartoffelsalat",
                "$2.99",
                "Homemade vinegary German potato salad with dill, mustard seed, and chive.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Spatzle",
                "$2.99",
                "",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Side Garden Salad",
                "$2.99",
                "A brine cured, skinless chicken breast, grilled & sliced, served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Green Beans with Peppered Bacon, Garlic, and Onions",
                "$2.99",
                "Our breaded Schnitzel served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side. Choose between a pork or veal cutlet for your schnitzel.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Apfelsoße",
                "$2.99",
                "Spinach tossed in our hot sweet & sour bacon and onion vinegarette. Garnished with Greyere cheese, sliced red onion, and a hardboiled egg.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Single Potato & Cheese Pierogie",
                "$1.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Vinegary Cucumber & Dill Salat",
                "$2.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Wilted Spinch Salat with Tart Warm Bacon Dressing",
                "$2.99",
                "A large portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Pomme Frittes",
                "$3.59",
                "A regular portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Kartoffelpuree",
                "$2.99",
                "Mixed garden greens, sliced cucumbers, tomatoes, red cabbage, carrots and sharp cheddar cheese. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Two Hausgemacht Kartoffelpuffer",
                "$4.49",
                "Your choice between our homemade Tuna salad or homemade Chicken salad, served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    //Need to work on details of these items
    private void generateSides() {
        List<MenuItem> list = new LinkedList<>();

        list.add(new MenuItem("Hausgemacht Rotkohl",
                "$2.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Raisin & Walnut Coleslaw",
                "$2.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Weinkraut",
                "$2.99",
                "A large portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Warm Sweet & Sour Potato Salad",
                "$2.99",
                "A regular portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("German Kartoffelsalat",
                "$2.99",
                "Mixed garden greens, sliced cucumbers, tomatoes, red cabbage, carrots and sharp cheddar cheese. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Spatzle",
                "$2.99",
                "Your choice between our homemade Tuna salad or homemade Chicken salad, served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Side Garden Salad",
                "$2.99",
                "A brine cured, skinless chicken breast, grilled & sliced, served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Green Beans with Peppered Bacon, Garlic, and Onions",
                "$2.99",
                "Our breaded Schnitzel served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side. Choose between a pork or veal cutlet for your schnitzel.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Apfelsoße",
                "$2.99",
                "Spinach tossed in our hot sweet & sour bacon and onion vinegarette. Garnished with Greyere cheese, sliced red onion, and a hardboiled egg.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Single Potato & Cheese Pierogie",
                "$1.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Vinegary Cucumber & Dill Salat",
                "$2.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Wilted Spinch Salat with Tart Warm Bacon Dressing",
                "$2.99",
                "A large portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Pomme Frittes",
                "$3.59",
                "A regular portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Kartoffelpuree",
                "$2.99",
                "Mixed garden greens, sliced cucumbers, tomatoes, red cabbage, carrots and sharp cheddar cheese. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Two Hausgemacht Kartoffelpuffer",
                "$4.49",
                "Your choice between our homemade Tuna salad or homemade Chicken salad, served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    private void generateSoupsSalads() {
        List<MenuItem> list = new LinkedList<>();

        list.add(new MenuItem("Bowl of Soup",
                "$4.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Cup of Soup",
                "$3.99",
                "Choose from our soup of the day (ask your server!) or our famous Wisconsin beer cheese and bacon soup.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Large Chef Salat",
                "$8.99",
                "A large portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Small Chef Salat",
                "$5.99",
                "A regular portion of mixed garden greens, cucumber, carrots, red cabbage, tomatoes, garnished with ham, turkey, cheese, and boiled egg. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Garden Salat",
                "$4.99",
                "Mixed garden greens, sliced cucumbers, tomatoes, red cabbage, carrots and sharp cheddar cheese. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Tuna or Chicken Salat platter",
                "$7.99",
                "Your choice between our homemade Tuna salad or homemade Chicken salad, served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Grilled Chicken Salat",
                "$7.99",
                "A brine cured, skinless chicken breast, grilled & sliced, served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Schnitzel Salat",
                "Pork - $9.99, Veal - $14.99",
                "Our breaded Schnitzel served on a bed of mixed greens, sliced cucumbers, tomatoes, red cabbage, and carrots. Served with a brotchen roll and a dressing of your choice on the side. Choose between a pork or veal cutlet for your schnitzel.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Wilted Spinach Salat",
                "$7.99",
                "Spinach tossed in our hot sweet & sour bacon and onion vinegarette. Garnished with Greyere cheese, sliced red onion, and a hardboiled egg.",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    private void generateAmerAppetizers() {
        List<MenuItem> list = new LinkedList<>();

        list.add(new MenuItem("Fried Breaded Mushrooms",
                "$7.99",
                "A large basket of button mushrooms breaded and deep fried. Served with a dipping sauce of your choice.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Fried Breaded Green Beans",
                "$7.99",
                "Fresh cut green beans, breaded and deep fried. Served with spicy Texas Petal dressing.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Beer Battered Onion Rings",
                "$7.99",
                "Sliced onions, dipped in beer batter and deep fried. Served with a dipping sauce of your choice.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Fried Beer Battered Pickle Quarters",
                "$5.99",
                "A quartered pickle, breaded and deep fried. Served with a dipping sauce of your choice.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Sweet Potato Fries",
                "$6.99",
                "Waffle-cut sweet potatoes, glazed with honey and cinnamon sugar. Served with marshmallow fluff.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Fried Chicken Wings",
                "$10.99",
                "Eight chicken wings tossed in your choice of mild, hot, or our famous Ziguener sauce. Served with a dipping sauce of your choice.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Riesling Walnut Cheddar Spread",
                "$3.99",
                "Cheddar cheese spread blended with Riesling white wine, roasted walnuts, & nutmeg. Served with crackers.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Pork Rinds",
                "$4.99",
                "Choice of plain, or our salty sweet honey & pepper seasoning. Served with BBQ dipping sauce.",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    private void generateAppetizers() {
        List<MenuItem> list = new LinkedList<>();

        list.add(new MenuItem("Kartoffelpuffer",
                "$8.99",
                "Homemade potato & onion cakes served with apple sauce and sour cream",
                R.mipmap.ic_jager));

        list.add(new MenuItem("German Bretzel",
                "$4.49",
                "A warm, traditional German-style pretzel. Chewy, lightly salted. Add a side of beer cheese dip for $1!",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Obatzda Mit Brot",
                "$7.99",
                "Authentic Brie, cream cheese, & paprika spread. Served with two slices of German hard rye butterbrot, pretzel sticks, garnished with radish and chives.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Currywurst",
                "$8.99",
                "Choose two of our famous wursts served in our sweet and tangy curry tomato sauce. Prepared boiled or pan-fried.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Landjager or Slim Jim",
                "$4.99",
                "Pork and beef smoked, dried sausages. Pairs well with beer. For a spicy option, choose the Slim Jims.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Spatzle, Voll",
                "$6.99",
                "A full plate of Swabische pan-fried dumpling noodles. Add a side of Jager gravy for $1 extra.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Pomme Frites, Voll",
                "$6.99",
                "Our homemade French fries. Round, sliced potatoes, hand cut & salted. Served soft or crispy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Butterbrot",
                "$3.99",
                "Imported German-style sliced sourdough rye, buttered, garnished with chives and radish.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Weisswurst",
                "$8.49",
                "Two boiled white veal & pork sausages. Boiled with parsley, served with a brotchen roll.",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    public List<MenuItem> getAppetizers() { return menuData.get(0); }

    public List<MenuItem> getAmerAppetizers() { return menuData.get(1); }

    public List<MenuItem> getSoupsSalads() { return menuData.get(2); }

    public List<MenuItem> getDinnersWithSides() { return menuData.get(3); }

    public List<MenuItem> getDinnersWithoutSides() { return menuData.get(4); }

    public List<MenuItem> getSides() { return menuData.get(5); }

    public List<MenuItem> getSpecialtySand() { return menuData.get(6); }

    public List<MenuItem> getClassicSand() { return menuData.get(7); }

    public List<MenuItem> getSausages() { return menuData.get(8); }

    public List<MenuItem> getDessert() { return menuData.get(9); }

    public List<MenuItem> getVegetarian() { return menuData.get(10); }

    public List<MenuItem> getSoftDrinks() { return menuData.get(11); }

    public List<MenuItem> getKids() { return menuData.get(12); }

}
