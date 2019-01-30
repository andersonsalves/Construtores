package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;
    
    /**
     * 
     */
    public Pessoa() {
        
    }

    /**
     * 
     * @param nome 
     */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @param nome
     * @param sobreNome 
     */
    public Pessoa(String nome, String sobreNome) {
        this(nome); 
        this.sobreNome = sobreNome;
    }
    
    /**
     * 
     * @param nome
     * @param sobreNome
     * @param idade 
     */
    public Pessoa(String nome, String sobreNome, int idade) {
        this(nome, sobreNome); 
        this.idade = idade;
    }
    
    
    // Getters e Setters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }   
}
