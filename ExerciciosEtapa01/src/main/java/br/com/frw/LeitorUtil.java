package br.com.frw;

import java.util.Scanner;

public class LeitorUtil {
    public static String LerTexto(Scanner scanner) {
        return scanner.nextLine();
    }
    public static Float LerFloat(Scanner scanner) {
        return Float.parseFloat(scanner.nextLine());
    }
    public static Integer LerInt(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }
    public static Double LerDouble(Scanner scanner) {
        return Double.parseDouble(scanner.nextLine());
    }
}


