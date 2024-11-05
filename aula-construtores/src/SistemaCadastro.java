public class SistemaCadastro {
    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("Marcos", "123");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println("Endereço do " + marcos.getNome() + " é " + marcos.getEndereco());
    }
}
