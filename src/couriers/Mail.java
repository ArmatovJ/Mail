package couriers;

import java.util.Scanner;

public class Mail {
    private Scanner scanner;
    private Logistics logistics;

    public Mail() {
        this.scanner = new Scanner(System.in);
        this.logistics = new Logistics();
        this.scanner = new Scanner(System.in);
    }
    public void startMail(){
        while (true){
            System.out.println("Введите расстояние в метрах(от 1000 до 10000)");
            try {
                int distance = scanner.nextInt();
                logistics.sendPackage(distance);
            }catch (Exception e){
                System.out.println("Нужно ввести число");
            }
        }
    }
}
