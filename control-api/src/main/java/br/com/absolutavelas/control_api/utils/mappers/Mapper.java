package br.com.absolutavelas.control_api.utils.mappers;

public interface Mapper<E, R> {
    E requestToEntity(R request);
}