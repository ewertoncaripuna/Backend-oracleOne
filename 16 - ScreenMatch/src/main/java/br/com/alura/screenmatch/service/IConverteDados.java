package br.com.alura.screenmatch.service;


public interface IConverteDados{
    <Q> Q obterDados(String json, Class<Q> classe);
}