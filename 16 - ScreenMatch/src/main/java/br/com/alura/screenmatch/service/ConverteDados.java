package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapeia = new ObjectMapper();

    @Override
    public <Q> Q obterDados(String json, Class<Q> classe){
        try{
            return mapeia.readValue(json,classe);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }
}

