package com.example.przepisy.repository;

import com.example.przepisy.entity.Recipe;
import com.example.przepisy.storage.RecipeStorage;

import java.util.ArrayList;

public class RecipeRepository {

    private RecipeStorage recipeStorage = new RecipeStorage();

    public ArrayList<Recipe> getRecipes(){
        return recipeStorage.getRecipe();
    }
    
}
