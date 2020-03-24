package utils;

import java.util.Random;

public class NumeroAleatorio {

    public static int randomAleatorio(int numero)
    {
        Random random = new Random();
        return random.nextInt(numero);
    }
}
