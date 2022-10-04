import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double n1, n2, n3, n4;
        double media;
        
        System.out.println("Digite a primeira nota:");
        n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        n2 = scan.nextDouble();

        System.out.println("Digite a terceira nota:");
        n3 = scan.nextDouble();

        System.out.println("Digite a quarta nota:");
        n4 = scan.nextDouble();

        media = (n1+n2+n3+n4)/4;
        System.out.println("A média entre as notas apresentadas é:\n" + media);
        scan.close();

    }
}
