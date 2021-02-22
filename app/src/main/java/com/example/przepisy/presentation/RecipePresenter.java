package com.example.przepisy.presentation;

import androidx.appcompat.app.AppCompatActivity;

import com.example.przepisy.domain.GetRecipes;

import java.util.ArrayList;

public class RecipePresenter extends AppCompatActivity {

    GetRecipes getRecipes = new GetRecipes();
    RecipeView recipeView;

    public void onAttach(RecipeView recipeView) {
        this.recipeView = recipeView;
    }

    public void onDetach() {
        recipeView = null;
    }

    public void refreshRecipes(Boolean isWithMeat) {
        recipeView.updateRecipes(getRecipes.getRecipes(isWithMeat));
    }
}
