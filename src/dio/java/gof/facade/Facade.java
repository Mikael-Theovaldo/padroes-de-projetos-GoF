package dio.java.gof.facade;

import dio.java.gof.sub_sistema1.CrmService;
import dio.java.gof.sub_sistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

    }
}
