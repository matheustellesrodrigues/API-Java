package com.example.apihotel.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHotel {

    private List<QuartoHotel> quartos = new ArrayList<>();

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

    @PutMapping("/api/hotel/quartos/{id}")
    public String updateQuarto( @PathVariable int id, @RequestBody QuartoHotel quartoAtualizado) {
        for (QuartoHotel quarto : quartos) {
            if (quarto.getId() == id) {
                quarto.setTipo(quartoAtualizado.getTipo());
                quarto.setPreco(quartoAtualizado.getPreco());
                quarto.setOcupacaoMaxima(quartoAtualizado.getOcupacaoMaxima());
                quarto.setDescricao(quartoAtualizado.getDescricao());
                quarto.setNumero(quartoAtualizado.getNumero());
                return "Quarto atualizado com sucesso";
        }
    }

    return "Quarto não encontrado";
}

    @PostMapping("/api/hotel/quartos")
    public String addQuarto(@RequestBody QuartoHotel novoQuarto){
        novoQuarto.setId(quartos.size() + 1);
        quartos.add(novoQuarto);
        return "Quarto adicionado com sucesso";

    }

    @DeleteMapping("/api/hotel/quartos/{id}") 
    public String deleteQuarto(@PathVariable int id) {
        for(QuartoHotel quarto : quartos) {
            if (quarto.getId() == id) {
                quartos.remove(quarto);
                return "Quarto excluido com sucesso";
            }
        }

        return "Quarto não encontrado";
    }

}


