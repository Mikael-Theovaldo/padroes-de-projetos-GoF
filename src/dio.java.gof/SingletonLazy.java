package dio.java.gof;

// singleton - preguiçoso

// A instância é criada apenas quando é necessária, garantindo que
// apenas uma instância seja criada durante toda a execução do programa.

public class SingletonLazy {
    private static SingletonLazy instacia;
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstacia() {
        if (instacia == null) {
            instacia = new SingletonLazy();
        }
        return instacia;
    }
}
