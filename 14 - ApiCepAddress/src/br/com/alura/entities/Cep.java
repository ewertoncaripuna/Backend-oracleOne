package br.com.alura.entities;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cep {


    public Address checkCep(String cep){

        if (cep.contains("-")) {
            cep = cep.replace("-","");

        }

        try {

            HttpClient client = HttpClient.newHttpClient();
            URI address = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(address)
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Address.class);

        }catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }

    }

}
