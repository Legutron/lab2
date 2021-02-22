package com.example.przepisy.storage;

import com.example.przepisy.R;
import com.example.przepisy.entity.Recipe;

import java.util.ArrayList;

public class RecipeStorage {

    ArrayList<Recipe> przepisy = new ArrayList<>(6);

    Recipe przepis1 = new Recipe("Ramen","super smaczny ramen",true);
    Recipe przepis2 = new Recipe("sushi","najsmaczniejsze w miescie", true);
    Recipe przepis3 = new Recipe("Dal soczewicowy", "idealna potrawa dla wszystkich", true);
    
    Recipe przepis4 = new Recipe("schabowy", "dla milosnikow miesa", false);
    Recipe przepis5 = new Recipe("kurczak", "dla sportowcow", false);
    Recipe przepis6 = new Recipe("Gyros", "idealny dla studentow", false);

    public ArrayList<Recipe> getRecipe(){
        przepisy.clear();
        przepisy.add(przepis1);
        przepisy.add(przepis2);
        przepisy.add(przepis3);
        przepisy.add(przepis4);
        przepisy.add(przepis5);
        przepisy.add(przepis6);
        return przepisy;
    }

}
