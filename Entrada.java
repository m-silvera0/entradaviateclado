import java.util.Scanner;

public class Entrada{
    public static void main(String[]args){
        int idade;
        String nomeCompleto;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade=leia.nextInt();
        leia.next();
        System.out.println("Sua idade é de :"+idade);
        System.out.println("Digite seu nome completo");
        nomeCompleto=leia.nextLine();
        System.out.println(nomeCompleto);
        leia.close();
    }
}