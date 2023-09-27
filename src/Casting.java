import java.util.Scanner;

/**
 * @author Fernando
 */
public class Casting {

    private static void imprimeWrapper() {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");

        int num = s.nextInt();

        Integer i = num;



        System.out.println("O Wrapper é: " + i);
    }
    public static void main(String[] args) {
        imprimeWrapper();


        }
    }