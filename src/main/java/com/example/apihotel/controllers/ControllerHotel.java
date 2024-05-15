package com.example.apihotel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHotel {

    private final String JSON_QUARTOS = "{\n" +
            "  \"quartos\": [\n" +
            "    {\n" +
            "      \"id\": 1,\n" +
            "      \"tipo\": \"Standard\",\n" +
            "      \"preco\": 100,\n" +
            "      \"ocupacao-maxima\": 2,\n" +
            "      \"descricao\": \"Quarto confortável com cama de casal\",\n" +
            "      \"numero\": \"101\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 2,\n" +
            "      \"tipo\": \"Standard\",\n" +
            "      \"preco\": 120,\n" +
            "      \"ocupacao-maxima\": 2,\n" +
            "      \"descricao\": \"Quarto com duas camas de solteiro\",\n" +
            "      \"numero\": \"102\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 3,\n" +
            "      \"tipo\": \"Deluxe\",\n" +
            "      \"preco\": 200,\n" +
            "      \"ocupacao-maxima\": 3,\n" +
            "      \"descricao\": \"Quarto de luxo com vista para o mar\",\n" +
            "      \"numero\": \"201\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 4,\n" +
            "      \"tipo\": \"Suite\",\n" +
            "      \"preco\": 300,\n" +
            "      \"ocupacao-maxima\": 4,\n" +
            "      \"descricao\": \"Suíte espaçosa com sala de estar\",\n" +
            "      \"numero\": \"301\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    @GetMapping("/api/hotel/quartos")
    public String getQuartos() {
        return JSON_QUARTOS;
    }
}
