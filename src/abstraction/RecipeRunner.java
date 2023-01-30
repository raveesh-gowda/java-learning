package abstraction;

public class RecipeRunner {

    public static void main(String[] args) {
        RecipeOne recipeOne = new RecipeOne();

        recipeOne.recipeMethod();
        recipeOne.execute();

        RecipeTwo recipeTwo = new RecipeTwo();

        recipeTwo.recipeMethod();
        recipeTwo.execute();
    }

}
