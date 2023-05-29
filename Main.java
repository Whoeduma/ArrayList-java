
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome: ");
        p1.setNome(sc.nextLine());
        
        sc.nextLine();
        
        ArrayList<Telefone> telefones = new ArrayList<>();
        System.out.println("Digite os telefones: ");
           for(int i = 0; i < 2; i++){
               Telefone t = new Telefone();
               System.out.println("Digite o numero de telefone: ");
               t.setNumero(sc.nextLine());
               
               telefones.add(t);

           }
           p1.setTelefones(telefones);
           System.out.println("\n INFORMAÇÕES");
           p1.imprimirPessoa();
        /*
        //array list 
        //Arraylist so aceita objeto
        
       ArrayList<Double> lista = new ArrayList<>();
       System.out.println(lista.isEmpty());
       
       //mais utilizado
       lista.add(1.0);
       lista.add(2.0);
       
        System.out.println(lista.isEmpty());
        
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        
        //mais utilizado
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); //size() apresenta o tamanho lista
        }
        
        System.out.println(lista.indexOf(2.0)); //apresenta o indice do elemento
        
        lista.clear();
        System.out.println(lista.isEmpty());
        
        lista.add(10.0);
        lista.add(20.0);
        lista.add(30.0);
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); //size() apresenta o tamanho lista
        }
        
        lista.remove(1);
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); //size() apresenta o tamanho lista
        }
        
        lista.set(0, 100.0);
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i)); //size() apresenta o tamanho lista
        }
        */
    }
    
}
