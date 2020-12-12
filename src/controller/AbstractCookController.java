package controller;

import model.Recipe;

import java.util.List;

public abstract class AbstractCookController {
    public Recipe findRecipe(String name){
        return null;
    };

    public List<Recipe> getAllRecipes() {
        return null;
    }
    public List<Recipe> getChosenRecipes(){
        return null;
    }
}
