package apps;
public abstract class ServicoMensagemInstantanea {

    //abstract não tem corpo
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //protected -> faz com que somente os filhos conhecem este método
    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagem.");
    }

    //protected -> faz com que somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

}
