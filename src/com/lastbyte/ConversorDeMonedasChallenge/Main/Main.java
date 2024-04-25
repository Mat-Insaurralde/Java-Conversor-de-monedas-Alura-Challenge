package com.lastbyte.ConversorDeMonedasChallenge.Main;

import com.lastbyte.ConversorDeMonedasChallenge.Models.MonedaConvertida;
import com.lastbyte.ConversorDeMonedasChallenge.Records.MonedaConvertidaApi;
import com.lastbyte.ConversorDeMonedasChallenge.RequestsApi.RequestApi;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        RequestApi requests = new RequestApi();
        double cant;
        int opcion = -1;
        MonedaConvertidaApi conversion;
        MonedaConvertida moneda;



        while (opcion != 0) {

            System.out.println("*************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Monedas =]");
            System.out.println("1)Dolar a Peso Argentino");
            System.out.println("2)Peso argentino a Dolar");
            System.out.println("3)Dolar a Real Brasileño");
            System.out.println("4)Real Brasileño a Dolar");
            System.out.println("5)Dolar a Peso Colombiano");
            System.out.println("6)Peso Colombiano a Dolar");
            System.out.println("0)Salir");
            System.out.println("Elija una opcion");
            System.out.println("*************************************************");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese la cantidad de Dolares a convertir: ");
                    cant = scanner.nextDouble();
                    conversion = requests.ConversionDeMonedas("usd", "ars", cant);
                    moneda = new MonedaConvertida(conversion);
                    System.out.println(moneda);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de Pesos Argentinos a convertir: ");
                    cant = scanner.nextDouble();
                    conversion = requests.ConversionDeMonedas("ars", "usd", cant);
                    moneda = new MonedaConvertida(conversion);
                    System.out.println(moneda);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de Dolares a convertir: ");
                    cant = scanner.nextDouble();
                    conversion = requests.ConversionDeMonedas("USD", "BRL", cant);
                    moneda = new MonedaConvertida(conversion);
                    System.out.println(moneda);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de Reales Brasileños a convertir: ");
                    cant = scanner.nextDouble();
                    conversion = requests.ConversionDeMonedas("BRL", "USD", cant);
                    moneda = new MonedaConvertida(conversion);
                    System.out.println(moneda);
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad de Dolares a convertir: ");
                    cant = scanner.nextDouble();
                    conversion = requests.ConversionDeMonedas("USD", "COP", cant);
                    moneda = new MonedaConvertida(conversion);
                    System.out.println(moneda);
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad de Pesos Colombianos a convertir: ");
                    cant = scanner.nextDouble();
                    conversion = requests.ConversionDeMonedas("COP", "USD", cant);
                    moneda = new MonedaConvertida(conversion);
                    System.out.println(moneda);
                    break;
                case 7:

                case 0: opcion=0; break;

            }


        }
         scanner.close();

    }
}