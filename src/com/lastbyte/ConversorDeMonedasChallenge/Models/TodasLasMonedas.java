package com.lastbyte.ConversorDeMonedasChallenge.Models;

import com.lastbyte.ConversorDeMonedasChallenge.Records.TodasLasMonedasApi;

import java.util.*;

public class TodasLasMonedas {


    private String fechaUltimaActualizacion;
    private String fechaProximaActualizacion;
    private Map<String, Double> TodasLasMonedas;

    public String getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public String getFechaProximaActualizacion() {
        return fechaProximaActualizacion;
    }

    public TodasLasMonedas(TodasLasMonedasApi monedasApi) {
     try {
        this.fechaUltimaActualizacion = monedasApi.time_last_update_utc().substring(5, monedasApi.time_last_update_utc().length() - 9);
        this.fechaProximaActualizacion = monedasApi.time_last_update_utc().substring(5, monedasApi.time_last_update_utc().length() - 9);
        this.TodasLasMonedas = monedasApi.conversion_rates();
    }catch (Exception e){
        System.out.println("Error al construir Todas las monedas: "+ e.getMessage());
    }
    }


    public void top10MayorValor() {
        int count = 0;

        // Obtener una lista de entradas del mapa
        List<Map.Entry<String, Double>> top10 = new ArrayList<>(this.TodasLasMonedas.entrySet());

        // Ordenar la lista utilizando un comparador personalizado (de mayor a menor)
        Collections.sort(top10, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        if (top10!=null){
            System.out.println("Top 10 de monedas de mayor cotizacion");
            for (Map.Entry<String, Double> entrada : top10) {
                System.out.println("1 "+entrada.getKey() + ": $"+ entrada.getValue()+" USD");
                count++;
                if (count >= 10) {
                    break;
                }
            }


            System.out.println("Ultima actualizacion de cotizaciones:"+this.fechaUltimaActualizacion);
            System.out.println("Proxima actualizacion de cotizaciones:"+this.fechaProximaActualizacion);
        }else{
            System.out.println("No hay monedas para mostrar!");
        }



    }


    public void top10MenorValor() {
        int count = 0;

        // Obtener una lista de entradas del mapa
        List<Map.Entry<String, Double>> top10 = new ArrayList<>(this.TodasLasMonedas.entrySet());

        // Ordenar la lista utilizando un comparador personalizado (de mayor a menor)
        Collections.sort(top10, Comparator.comparing(Map.Entry::getValue));

        if (top10!=null){
            System.out.println("Top 10 de monedas de menor cotizacion");
            for (Map.Entry<String, Double> entrada : top10) {
                System.out.println("1 "+entrada.getKey() + ": $"+ entrada.getValue()+" USD");
                count++;
                if (count >= 10) {
                    break;
                }
            }
            System.out.println("Ultima actualizacion de cotizaciones:"+this.fechaUltimaActualizacion);
            System.out.println("Proxima actualizacion de cotizaciones:"+this.fechaProximaActualizacion);
        }else{
            System.out.println("No hay monedas para mostrar!");
        }



    }



}









