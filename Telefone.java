
public class Telefone {
    private String numero;

    
    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void imprimirTelefone(){
        System.out.println("Numero: " +getNumero());
    }
}
