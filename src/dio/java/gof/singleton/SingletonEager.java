package dio.java.gof.singleton;

// Singleton - Apressado

// A instância é criada no momento em que a classe é carregada, garantindo que
// apenas uma instância seja criada durante toda a execução do programa.

public class SingletonEager {
    private static SingletonEager instacia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstacia() {
        return instacia;
    }
}
