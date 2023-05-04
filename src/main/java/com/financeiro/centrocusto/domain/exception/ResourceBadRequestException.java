package com.financeiro.centrocusto.domain.exception;

public class ResourceBadRequestException extends RuntimeException {
    
    public ResourceBadRequestException(String mensagem){
        super(mensagem);
    }
}
