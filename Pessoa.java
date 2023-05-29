
import java.util.ArrayList;


public class Pessoa {
    private String nome;
    //Telefone [] telefones;
    private ArrayList<Telefone> telefones = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

   
    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome: " +getNome());
        System.out.println("Telefones: ");
        
        for(int i = 0; i < getTelefones().size(); i++){
            getTelefones().get(i).imprimirTelefone();
        }
    }
     
}
