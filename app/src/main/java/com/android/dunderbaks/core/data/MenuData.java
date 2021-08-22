package com.android.dunderbaks.core.data;

import com.android.dunderbaks.R;
import com.android.dunderbaks.core.model.MenuItem;

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

        list.add(new MenuItem("Der Reuben",
                "$8.49",
                "Your choice of corned beef or turkey breast, imported Swiss cheese, German weinkraut, and 1000 island dressing. Served grilled on rye.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Red Reuben",
                "$8.49",
                "Our regular Reuben with our homemade red cabbage (rotkohl) instead of weinkraut.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Schwartz-Russe",
                "$8.99",
                "The Black Russian, a double decker sandwich with Black Forest ham, turkey breast, imported Swiss cheese, lettuce, tomato and 1000 island dressing. Served cold, recommended on Pumpernickel.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Blue Max",
                "$8.49",
                "Our Wiener schnitzel served with two sunny-side up eggs. Add anchovies and capers on the side for $3.99.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der New Yorker",
                "$8.49",
                "Our Wiener schnitzel smothered in our homemade sour cream, white wine, mushroom, and rosemary herb gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Alte Rote Baron",
                "$8.49",
                "Choose our sweet red tomato, pepper, and paprika sauce (Traditional) or our Dunderbaks twist with a spicy sour cream paprika sauce (House) to smother on our Wiener schnitzel.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Rote Baron",
                "$8.49",
                "Our Wiener schnitzel layered in Black Forest ham and provolone, smothered in our homemade tomato mushroom sauce.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Karavan",
                "$8.49",
                "Our Wiener schnitzel layered with Greyere cheese, Black Forest ham, Provolone, topped with grilled Pineapple and Cherries.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Roast Beef Dunder Philly",
                "$17.99",
                "Thin sliced beef roast marinated for five days in red wine vinegar and eleven spices. Served in its own raisin sweet and sour vinegar gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("BBQ Chicken Sandwich",
                "$16.99",
                "Two grilled Venison & Pork sausages, cooked in German Schwartzbier, on a bed of weinkraut.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Chicken Breast a la Dunderbaks",
                "$11.99",
                "A thick slice of veal and pork German bologna, ground fine and blended with spices, grilled and topped with sautéed onions. Add two eggs for $1.99.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Dunderbaks French Connection Sub",
                "$13.99",
                "Spicy Hungarian paprika pork and vegetable stew, served on a bed of egg noodles.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Genoa Sub",
                "$17.99",
                "Two pork chops smoked, seasoned, and grilled. Brine cured in apricot, brown sugar, and Riesling wine reduction.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Reuben Wurst",
                "$25.99",
                "A beer braised pork shank, especially popular in Bavaria. Served with homemade mashed potatoes and smothered in our demi glaze gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Schnitzel Sandwich",
                "$17.99",
                "Sliced pork roast, braised with apples, onions, brown sugar, & German Schwartzbier marinade. ",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Dunder Von Bomb",
                "$12.99",
                "Two grilled Wursts of your choice from our Wurst selection. Wursts are grilled, can be poached on request.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Dunder Muffin",
                "Pork - $12.99, Veal - $16.99",
                "Our famous Wiener schnitzel, an herb-breaded cutlet sliced thin and hand-pounded in house. Seasoned and deep fried golden brown. Topped with a lemon wedge.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Der Schnitzel Reuben",
                "Pork - $13.99, Veal - $17.99",
                "Our Wiener schnitzel smothered in a dark, rich mushroom brown Jager gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Sauerbraten Sub",
                "Pork - $14.99, Veal - $18.99",
                "Our Wiener schnitzel served with two sunny-side up eggs. Add anchovies and capers on the side for $3.99.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Leberkase Sandwich",
                "Pork - $13.99, Veal - $17.99",
                "Our Wiener schnitzel smothered in our homemade sour cream, white wine, mushroom, and rosemary herb gravy.",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    private void generateDinnersWithSides() {
        List<MenuItem> list = new LinkedList<>();

        list.add(new MenuItem("Oktoberfest Sausage Platter",
                "$12.99",
                "Two grilled Wursts of your choice from our Wurst selection. Wursts are grilled, can be poached on request.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Schnitzel \"Wiener Art\"",
                "Pork - $12.99, Veal - $16.99",
                "Our famous Wiener schnitzel, an herb-breaded cutlet sliced thin and hand-pounded in house. Seasoned and deep fried golden brown. Topped with a lemon wedge.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Jagerschnitzel",
                "Pork - $13.99, Veal - $17.99",
                "Our Wiener schnitzel smothered in a dark, rich mushroom brown Jager gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Schnitzel a la Holstein",
                "Pork - $14.99, Veal - $18.99",
                "Our Wiener schnitzel served with two sunny-side up eggs. Add anchovies and capers on the side for $3.99.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Sour Cream Schnitzel",
                "Pork - $13.99, Veal - $17.99",
                "Our Wiener schnitzel smothered in our homemade sour cream, white wine, mushroom, and rosemary herb gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Zigeuner Schnitzel",
                "Pork - $13.99, Veal - $17.99",
                "Choose our sweet red tomato, pepper, and paprika sauce (Traditional) or our Dunderbaks twist with a spicy sour cream paprika sauce (House) to smother on our Wiener schnitzel.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Schnitzel Italia",
                "Pork - $15.99, Veal - $19.99",
                "Our Wiener schnitzel layered in Black Forest ham and provolone, smothered in our homemade tomato mushroom sauce.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Schnitzel Hawaii",
                "Pork - $15.99, Veal - $19.99",
                "Our Wiener schnitzel layered with Greyere cheese, Black Forest ham, Provolone, topped with grilled Pineapple and Cherries.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Sauerbraten",
                "$17.99",
                "Thin sliced beef roast marinated for five days in red wine vinegar and eleven spices. Served in its own raisin sweet and sour vinegar gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Venison Sausage Platter",
                "$16.99",
                "Two grilled Venison & Pork sausages, cooked in German Schwartzbier, on a bed of weinkraut.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Bavarian Leberkese",
                "$11.99",
                "A thick slice of veal and pork German bologna, ground fine and blended with spices, grilled and topped with sautéed onions. Add two eggs for $1.99.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Paprikasch Pork Gulasch",
                "$13.99",
                "Spicy Hungarian paprika pork and vegetable stew, served on a bed of egg noodles.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Kassler Rippchen",
                "$17.99",
                "Two pork chops smoked, seasoned, and grilled. Brine cured in apricot, brown sugar, and Riesling wine reduction.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Schweinhaxe",
                "$25.99",
                "A beer braised pork shank, especially popular in Bavaria. Served with homemade mashed potatoes and smothered in our demi glaze gravy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Krustenbraten Klassich",
                "$17.99",
                "Sliced pork roast, braised with apples, onions, brown sugar, & German Schwartzbier marinade. ",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    private void generateDinnersWithoutSides() {
        List<MenuItem> list = new LinkedList<>();

        list.add(new MenuItem("Bratkartoffeln with Cheese",
                "$10.99",
            "Cut round, thick sliced, deep fried potatoes. Sautéed with onions, cured Westphalian ham, and Black Forest ham. Your choice of cheese to melt on top.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Charcuterie Plate",
                "$14.99",
                "Cured ham, aged salami, blutwurst, and assorted deli meats chosen randomly everyday. Served with pickle quarters, imported German sourdough rye, head cheese, garlic chive cream cheese, and sliced Emmenthaler Swiss cheese.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Cheese Plate",
                "$17.99",
                "An assortment of unique cheeses from our deli, randomly chosen everyday. Served with fresh sliced apple, grapes, crackers, and a Brotchen roll. Add an order of sliced aged salami or summer sausage for $2.59.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Lox on a Bagel",
                "$10.99",
                "Sliced Nova Scotia smoked salmon and garlic chive cream cheese served with lettuce, tomato, onions, and capers on your choice of plain or everything bagel.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Spatzle Mit Kase",
                "$11.99",
                "Black Forest ham, onions, and your choice of cheese melted on top of German semolina wheat dumpling noodles. Add a side of Jager gravy for $1.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Potato & Cheese Pierogies",
                "$11.59",
            "Polish-style Potato and Cheese stuffed Pierogie dumplings, served with al-dente peppers and onions and our homemade white wine and rosemary sour-cream mushroom sauce.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Nurnberg Sausage Platter",
                "$11.99",
                "Two Nurnberg sausages, spatzle, kraut, and rich brown mushroom Jager gravy.",
                R.mipmap.ic_jager));

        menuData.add(list);

    }

    //Need to work on details of these items
    private void generateSides() {
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
                "Semolina wheat dumpling noodles pan-cooked in butter. Add Jager gravy on top for 25¢.",
                R.mipmap.ic_jager));


        list.add(new MenuItem("Side Garden Salad",
                "$2.99",
                "Mixed garden greens, sliced cucumbers, tomatoes, red cabbage, carrots, sharp cheddar cheese, and your choice of dressing on the side.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Homemade Green Beans",
                "$2.99",
                "Fresh green beans cooked with peppered bacon, garlic, and onions.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Homemade Applesauce",
                "$2.99",
                "Our famous applesauce homemade with roasted apple spiced with cinnamon and nutmeg.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Single Potato & Cheese Pierogie",
                "$1.99",
                "One potato & cheese stuffed Polish-style Pierogie dumpling.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Vinegary Cucumber & Dill Salat",
                "$2.99",
                "Our homemade sliced cucumber salad with red onion, dill, and vinegar.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Oma's Hausgemacht Wilted Spinch Salat with Tart Warm Bacon Dressing",
                "$2.99",
                "Spinach tossed in our hot sweet & sour bacon and onion vinegarette. Garnished with Greyere cheese and sliced red onion.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Pomme Frittes",
                "$3.59",
                "Our homemade French fries. Round, sliced potatoes, hand cut & salted. Served soft or crispy.",
                R.mipmap.ic_jager));

        list.add(new MenuItem("Hausgemacht Kartoffelpuree",
                "$2.99",
                "Our homemade creamy dill mashed potatoes, only available on Fridays and Saturdays every week in limited portion. Add Jager gravy on top for 25¢.",
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
