package abstraction;

public class RecipeOne extends Recipe {
    public void recipeMethod() {
        System.out.println("Preparation of Recipe One");
    }

    @Override
    void getReady() {
        System.out.println("Get Vegetables Cut and Ready");
        System.out.println("Get Spices Ready");
    }

    @Override
    void doTheDish() {
        System.out.println("Steam And Fry Vegetables");
        System.out.println("Cook With Spices");
        System.out.println("Add Seasoning");
    }

    @Override
    void cleanUp() {
        System.out.println("Discard unused Vegetables");
        System.out.println("Discard unused Spices");
    }
}
