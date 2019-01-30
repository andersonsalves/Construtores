package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anderson");
        pessoa.setSobreNome("Silva");
        pessoa.setIdade(33);
        
        System.out.println("Nome: " + pessoa.getNome() + " Sobre Nome: " + pessoa.getSobreNome() + " Idade: " + pessoa.getIdade());
        
        pessoa = new Pessoa("Anderson");
        pessoa.setSobreNome("Silva");
        pessoa.setIdade(33);
        
        System.out.println("Nome: " + pessoa.getNome() + " Sobre Nome: " + pessoa.getSobreNome() + " Idade: " + pessoa.getIdade());
        
        pessoa = new Pessoa("Anderson", "Silva");       
        pessoa.setIdade(33);
        
        System.out.println("Nome: " + pessoa.getNome() + " Sobre Nome: " + pessoa.getSobreNome() + " Idade: " + pessoa.getIdade());
        
        pessoa = new Pessoa("Anderson", "Silva", 33);
        
        System.out.println("Nome: " + pessoa.getNome() + " Sobre Nome: " + pessoa.getSobreNome() + " Idade: " + pessoa.getIdade());            
    }    
}
