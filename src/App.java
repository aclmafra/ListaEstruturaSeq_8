import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double val, nH, sal;

        System.out.println("Digite quanto voce ganha por hora: ");
        val = sc.nextDouble();
        System.out.println("Digite o numero de horas trabalhadas no mes: ");
        nH = sc.nextDouble();
        sal = val * nH;

        System.out.println("O total do seu salario no referido mes e igual a: " + sal);

        sc.close();
    }
}
