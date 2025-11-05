package lesson2;

import java.util.Scanner;

public class ClothesDetector {


    // 1. if or if-else можуть бути вкладені
//        if (true) {
//            if(true) {
//                if(true) {
//
//                }
//            }
//        }

    //2. if-else statements можуть бути комбіновані 1 або більше разів

//        if (true) {
//
//        } else if (true) {
//
//        } else if (true) {
//
//        } else {
//
//        }

    // 3. в кінці таких комбінацій може бути дефолтний else блок (а може і не бути)

    public static void main(String[] args) {
        // will detect based on temperature and weather what to take with you
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int tempInCelsius = scanner.nextInt();
            boolean isRaining = scanner.nextBoolean();

            if (tempInCelsius < 15) {
                if (isRaining) {
                    System.out.println("Take an umbrella and a jacket");
                } else {
                    System.out.println("Take a jacket");
                }
            } else if (tempInCelsius >= 15 && tempInCelsius < 25) {
                if (isRaining) {
                    System.out.println("Take an umbrella");
                } else {
                    System.out.println("Enjoy the weather!");
                }
            } else {
                System.out.println("Wear light clothes");
            }
        }
    }
}
