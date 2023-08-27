import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Revisao {

    public static void main (String[] args){
        System.out.println("Ol√° mundo 5");

        Scanner leitor = new Scanner(System.in);
	   System.out.println("Ol· Git 4");
        String nome = "Henrique";
        String nome1 = "Assis";
        String nome2 = "Arthur";
        List listaDeNomes = new ArrayList<>();
        listaDeNomes.add(nome);
        listaDeNomes.add(nome1);
        listaDeNomes.add(nome2);

        System.out.println(listaDeNomes);
        listaDeNomes.remove(1);
        System.out.println(listaDeNomes);
        listaDeNomes.add(1, "Assis");
        System.out.println(listaDeNomes);
		




    }
}
