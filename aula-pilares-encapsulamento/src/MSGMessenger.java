public class MSGMessenger {
    
    public void enviarMensagem() {

        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();

    }

    public void receberMensagem() {

        System.out.println("Recebendo mensagem");

    }

    private void validarConectadoInternet() {

        System.out.println("Validando se está conectado a internet");

    }

    private void salvarHistoricoMensagem() {

        System.out.println("Salvando historico de mensagem");

    }


}
