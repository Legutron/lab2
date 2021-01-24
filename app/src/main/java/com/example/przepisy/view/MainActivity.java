package com.example.przepisy.view;

import android.app.AppComponentFactory;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.przepisy.entity.Recipe;
import com.example.przepisy.presentation.RecipePresenter;
import com.example.przepisy.presentation.RecipeView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecipeView {
    RecipePresenter recipePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


    }

    @Override
    public ArrayList<Recipe> sendPrzepis(ArrayList<Recipe> przepisy) {
        return null;
    }




}