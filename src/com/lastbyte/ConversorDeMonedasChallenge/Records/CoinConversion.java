package com.lastbyte.ConversorDeMonedasChallenge.Records;

public record CoinConversion(double conversion_rate, //Tasa de conversion
                             double conversion_result, // Resultado de conversion
                             String time_last_update_utc, // Hora de  la ultima actualizacion
                             String time_next_update_utc, // Hora de la proxima actualizacion
                             String base_code, // codigo base
                             String target_code // codigo Objetivo
) { }
