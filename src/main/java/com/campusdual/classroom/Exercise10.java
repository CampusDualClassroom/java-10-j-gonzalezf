package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    public static void main(String[] args) {
        String ballColor;
        int cont = 0;

        do {
            ballColor = getBall();
            System.out.println("La bola es de color: " + ballColor);
            if (ballColor.equals("azul"))
                cont++;
        } while (cont < 2);
    }

    public static String getBall() {
        switch (randomWithRange(1, 4)) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            default:
                return "verde";
        }
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
