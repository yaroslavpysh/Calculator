import java.util.Scanner;

public class Menu {
//    boolean exit = true;
//    String ex;
    int a;
    int b;
    String c;

    public  void res(){

            Scanner scanner = new Scanner(System.in);

        System.out.println("Введите  число <a> или напишите <OFF> для выхода из программы ");
        while (!scanner.hasNext("OFF")){
            while (!scanner.hasNextInt()) {
            System.out.println("Это не целое число");
            scanner.next();
            }
            a = scanner.nextInt();
            System.out.println("Введите число <b>");
            while (!scanner.hasNextInt()) {
            System.out.println("Это не целое число");
            scanner.next();
            }
            b = scanner.nextInt();

            System.out.println("Введите операцию");
                while (!scanner.hasNext("\\+") && !scanner.hasNext("-") && !scanner.hasNext("\\*") && !scanner.hasNext("/")){
                System.out.println("Введите +, -, * или /");
                scanner.next();
                }c = scanner.next();
            switch (c){
            case "+":
            CalculateSum calculateSum = new CalculateSum();
            System.out.print("Результат = " );
            calculateSum.action(a,b);
            break;
            case "-":
                CalculateDif calculateDif = new CalculateDif();
                System.out.print("Результат = " );
                calculateDif.action(a, b);
                break;
            case "/":
                CalculateDiv calculateDiv = new CalculateDiv();
                System.out.print("Результат = " );
                calculateDiv.action(a, b);

                break;
            case "*":
                CalculateMultiply calculateMultiply = new CalculateMultiply();
                System.out.print("Результат = " );
                calculateMultiply.action(a,b);
                break;
        }}
//        ex = scanner1.nextLine();
//        if (ex.equals("OFF")){
//        exit = false;}

//}while (exit );
    }

}
