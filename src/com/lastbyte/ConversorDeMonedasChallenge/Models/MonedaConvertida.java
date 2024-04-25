package com.lastbyte.ConversorDeMonedasChallenge.Models;

import com.lastbyte.ConversorDeMonedasChallenge.Records.MonedaConvertidaApi;

public class MonedaConvertida {

    private double precioBase;
    private double resultadoDeConversion;
    private String fechaDeUltimaActualizacion;
    private String fechaDeProximaActualizacion;
    private String moneda;
    private String monedaDestino;

    public MonedaConvertida(MonedaConvertidaApi monedaApi) {
        this.precioBase = monedaApi.conversion_rate();
        this.resultadoDeConversion = monedaApi.conversion_result();
        this.fechaDeUltimaActualizacion = monedaApi.time_last_update_utc().substring(5,monedaApi.time_last_update_utc().length()-9);
        this.fechaDeProximaActualizacion = monedaApi.time_next_update_utc().substring(5,monedaApi.time_next_update_utc().length()-9);
        this.moneda = monedaApi.base_code();
        this.monedaDestino = monedaApi.target_code();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getResultadoDeConversion() {
        return resultadoDeConversion;
    }

    public String getFechaDeUltimaActualizacion() {
        return fechaDeUltimaActualizacion;
    }

    public String getFechaDeProximaActualizacion() {
        return fechaDeProximaActualizacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    @Override
    public String toString() {
        return "\n Moneda:"+moneda+"" +
                "\n Moneda a Convertir:"+monedaDestino+"" +
                "\n Resultado de conversion: "+resultadoDeConversion+
                "\n Cada "+moneda+" equivale a "+precioBase+" "+monedaDestino +
                "\n Hora de la ultima actualizacion: "+fechaDeUltimaActualizacion+
                "\n Hora de la proxima actualizacion: "+fechaDeProximaActualizacion+"\n";

    }
}
