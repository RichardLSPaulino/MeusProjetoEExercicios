package FoodService;

import Modelo.Cliente;
import Notificacao.Notificador;

public class  AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }
    public void ativar(Cliente cliente){
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema esta ativo");
    }
}
