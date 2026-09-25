package dio.java.gof.sub_sistema1;

public class CrmService {

    private CrmService() {
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente " + nome + " com cep " + cep + ", " + cidade + " - " + estado + " salvo no sistema de CRM ");
    }
}
