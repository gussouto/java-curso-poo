package escola;

public class Escola {
    public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Gustavo Souto");
        felipe.setIdade(24);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	
	}
}