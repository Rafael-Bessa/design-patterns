package templateMethod.design;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.boilWater();
        coffee.brew();
        coffee.pourInCup();
        coffee.addCondiments();

        System.out.println();

        tea.boilWater();
        tea.brew();
        tea.pourInCup();
        tea.addCondiments();


    }
}
