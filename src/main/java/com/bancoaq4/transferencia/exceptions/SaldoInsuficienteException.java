package com.bancoaq4.transferencia.exceptions;

public class SaldoInsuficienteException extends Exception {

    private static final long serialVersionUID = 1L;

    public SaldoInsuficienteException() {
        super("Saldo Insuficiente!");
    }
}
