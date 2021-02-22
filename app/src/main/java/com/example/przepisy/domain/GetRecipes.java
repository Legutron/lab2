package com.example.przepisy.domain;

import com.example.przepisy.entity.Recipe;
import com.example.przepisy.repository.RecipeRepository;

import java.util.ArrayList;
import java.util.List;

public class GetRecipes {

    private RecipeRepository recipeRepository = new RecipeRepository();

    public ArrayList<Recipe> getRecipes(boolean isItVegan){
        ArrayList<Recipe> recipes = recipeRepository.getRecipes();
        ArrayList<Recipe> selectedRecipes = new ArrayList<>();

        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).isVegan() == isItVegan){
                selectedRecipes.add(recipes.get(i));
            }
        }
        return selectedRecipes;
    }


}
