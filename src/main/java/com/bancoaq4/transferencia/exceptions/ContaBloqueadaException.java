package com.bancoaq4.transferencia.exceptions;

public class ContaBloqueadaException extends Throwable {

    private static final long serialVersionUID = 1L;

    public ContaBloqueadaException() {
        super("Conta Bloqueada!");
    }
}
