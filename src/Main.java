import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("********************************");
            System.out.println("Что хотите сделать:\n1 - Рассчитать\n2 - Выйти ");
            int button = new Scanner(System.in).nextByte();
            if (button == 2){
                break;}
            if (button == 1) {
                System.out.println("Добро пожаловать в калькулято Bmi: ");
                System.out.println("Введите свой вес в (кг): ");
                double weight = new Scanner(System.in).nextDouble();
                System.out.println("Введите свой рост в (м^2): ");
                double height = new Scanner(System.in).nextDouble();
                System.out.println("Ваш имт равен: " + weight / (height * height));
                double bmi = (weight / (height * height));
                if (bmi <= 16.5) {
                    System.out.println("Дефицит массы тела: ");
                } else if (bmi >= 18.5 && bmi <= 25) {
                    System.out.println("Норма: ");
                } else if (bmi >= 25 && bmi <= 30) {
                    System.out.println("Ожирение 1 степени: ");
                } else if (bmi >= 30 && bmi <= 35) {
                    System.out.println("Ожирение 2 степени: ");
                } else if (bmi >= 35 && bmi <= 40) {
                    System.out.println("Ожирение 3 степени: ");
                } else {
                    System.out.println("Ожиренеие 4 степени: ");
                }

            }
        }
    }
}

