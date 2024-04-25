package com.lastbyte.ConversorDeMonedasChallenge.Records;

import java.util.Map;

public record TodasLasMonedasApi(Map<String,Double> conversion_rates, String time_last_update_utc, String time_next_update_utc ) { }
