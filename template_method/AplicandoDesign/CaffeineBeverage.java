package templateMethod.design;

/**
 * Criei uma class abstrata que possui os métodos abstratos, café e chá irão herdar desta classe
 * e ambas as classes vão implementar o método da maneira que lhe convém
 */

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
