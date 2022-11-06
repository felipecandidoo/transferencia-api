package com.bancoaq4.transferencia.controllers;

import com.bancoaq4.transferencia.DTO.TransacaoDTO;
import com.bancoaq4.transferencia.exceptions.ContaBloqueadaException;
import com.bancoaq4.transferencia.exceptions.SaldoInsuficienteException;
import com.bancoaq4.transferencia.services.TransferenciaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping(value = "/payment")
public class TransferenciaController {

    private final TransferenciaService service;

    @PostMapping(value = "/transferencia")
    public ResponseEntity transferencia(@RequestBody TransacaoDTO transacaoDTO) throws SaldoInsuficienteException, ContaBloqueadaException {
        return new ResponseEntity(service.transferencia(transacaoDTO), HttpStatus.OK);
    }
}
