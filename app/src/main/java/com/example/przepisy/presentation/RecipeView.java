package com.example.przepisy.presentation;

import com.example.przepisy.entity.Recipe;

import java.util.ArrayList;

public interface RecipeView {
    void updateRecipes(ArrayList<Recipe> recipes);
}
