package com.bancoaq4.transferencia.models;

import lombok.Getter;

@Getter
public enum TipoTransacao {

    SAQUE, DEPOSITO, BOLETO, TRANSAFERENCIA;

    public int id;

    TipoTransacao() {
        this.id = id;
    }
}
