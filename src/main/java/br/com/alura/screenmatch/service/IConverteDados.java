package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.models.DadosSerie;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
