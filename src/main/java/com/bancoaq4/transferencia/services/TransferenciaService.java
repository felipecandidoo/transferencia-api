package com.bancoaq4.transferencia.services;


import com.bancoaq4.transferencia.DTO.ResponseDTO;
import com.bancoaq4.transferencia.DTO.TransacaoDTO;
import com.bancoaq4.transferencia.exceptions.ContaBloqueadaException;
import com.bancoaq4.transferencia.exceptions.SaldoInsuficienteException;
import com.bancoaq4.transferencia.request.UserFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class TransferenciaService {

    private final UserFeign feign;
    private final Environment environment;

    public ResponseDTO transferencia(TransacaoDTO transacaoDTO) throws SaldoInsuficienteException, ContaBloqueadaException {

        var result = feign.transferencia(transacaoDTO).getBody();

        if(Objects.nonNull(result)){
            return ResponseDTO.builder()
                    .result(result)
                    .environment("Port " + environment.getProperty("local.server.port"))
                    .build();
        }

        return null;
    }
}
