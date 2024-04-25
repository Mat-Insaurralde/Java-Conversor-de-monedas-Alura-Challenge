package com.lastbyte.ConversorDeMonedasChallenge.Main;

import com.lastbyte.ConversorDeMonedasChallenge.Records.CoinConversion;
import com.lastbyte.ConversorDeMonedasChallenge.RequestsApi.RequestApi;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("*************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Monedas =]");
        System.out.println("1)Dolar =>> Peso Argentino");
        System.out.println("2)");
        System.out.println("3)");
        System.out.println("4)");
        System.out.println("5)");
        System.out.println("6)");
        System.out.println("7)");
        System.out.println("*************************************************");
        RequestApi requests = new RequestApi();

        CoinConversion conversion = requests.ConversionDeMonedas("usd","ars",2);

        System.out.println(conversion);

    }
}