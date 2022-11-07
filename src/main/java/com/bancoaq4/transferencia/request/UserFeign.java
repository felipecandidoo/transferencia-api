package com.bancoaq4.transferencia.request;

import com.bancoaq4.transferencia.DTO.ResponseDTO;
import com.bancoaq4.transferencia.DTO.TransacaoDTO;
import com.bancoaq4.transferencia.exceptions.ContaBloqueadaException;
import com.bancoaq4.transferencia.exceptions.SaldoInsuficienteException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "bank-api")
public interface UserFeign {

    @PostMapping(path = "/transacoes/transferencia")
    ResponseEntity<TransacaoDTO> transferencia(@RequestBody TransacaoDTO transacaoDTO) throws SaldoInsuficienteException, ContaBloqueadaException;
}
