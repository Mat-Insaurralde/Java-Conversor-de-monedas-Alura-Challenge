package com.lastbyte.ConversorDeMonedasChallenge.Records;

import com.google.gson.JsonArray;

import java.util.Map;

public record MonedasApi(Map<String,Double> conversion_rates, String time_last_update_utc, String time_next_update_utc ) { }
