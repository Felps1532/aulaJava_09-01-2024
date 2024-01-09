import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome >> ");
        String name = scan.next();
        System.out.println("Olá, " + name);
    }
}