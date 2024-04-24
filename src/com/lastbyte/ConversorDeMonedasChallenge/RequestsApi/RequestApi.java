package com.lastbyte.ConversorDeMonedasChallenge.RequestsApi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {



    //Generamos el cliente HttpClient en Java facilita la conexión y
    // la obtención de respuestas de manera eficiente
    HttpClient client = HttpClient.newHttpClient();
    //Generamos el pedido HttpRequest en Java nos brinda un
    // control detallado sobre los parámetros de nuestras solicitudes
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/38351add2fa70b30c26d42b7/latest/USD"))
            .build();

    //Obtenemos la respuesta HttpResponse para gestionar las respuestas recibidas de la API.
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();


}
