package singleton;

/**
 * O Padrão Singleton garante que uma classe tenha apenas um
 * instância e fornece um ponto global de acesso a ela.
 */

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
