package dio.java.gof.app;

import dio.java.gof.singleton.SingletonEager;
import dio.java.gof.singleton.SingletonLazy;
import dio.java.gof.singleton.SingletonLazyHolder;
import dio.java.gof.strategy.*;

public class Program {
    public static void main(String[] args) {

        // teste relacionados ao design pattern singleton

        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);

        System.out.println("---------------------");

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        eager = SingletonEager.getInstacia();
        System.out.println(eager);

        System.out.println("---------------------");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        System.out.println("---------------------");

        // Testes relacionados ao design pattern strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println("---------------------");

        // Testes relacionados ao design pattern facade

    }
}
