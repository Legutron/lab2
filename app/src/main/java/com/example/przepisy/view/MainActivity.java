package com.example.przepisy.view;

import android.app.AppComponentFactory;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.przepisy.R;
import com.example.przepisy.entity.Recipe;
import com.example.przepisy.presentation.RecipePresenter;
import com.example.przepisy.presentation.RecipeView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecipeView {
    private RecipePresenter recipePresenter = new RecipePresenter();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recipePresenter.onAttach(this);

        Button reloadButton = findViewById(R.id.reloadButton);
        Switch isVegan = findViewById(R.id.veganSwitch);

        View.OnClickListener listener = v ->{

            recipePresenter.refreshRecipes(isVegan.isChecked());
        };
        reloadButton.setOnClickListener(listener);

    }

    @Override
    protected void onDestroy() {
        recipePresenter.onDetach();
        super.onDestroy();
    }

    @Override
    public void updateRecipes(ArrayList<Recipe> recipes) {
        TextView przepisyTextView = findViewById(R.id.textView);
        String przepisyTekst ="";
        przepisyTextView.setText("");

        for (Recipe recipe: recipes){
            przepisyTekst += recipe.getName() + "\n" + recipe.getDescription() + "\n"+"\n";

        }
        przepisyTextView.setText(przepisyTekst);

    }
}