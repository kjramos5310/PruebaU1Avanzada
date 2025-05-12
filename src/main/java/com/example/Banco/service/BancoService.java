package com.example.Banco.service;

import com.example.Banco.model.BancoModel;
import org.springframework.stereotype.Service;

@Service
public class BancoService {
    private final double INTERES_MOROSIDAD = 0.12;
    private final double MULTA_MOROSIDAD = 200;
    private final double PORCENTAJE_PAGO_MINIMO = 0.15;
    private final double PORCENTAJE_PAGO_SIN_INTERESES = 0.85;

    public void calcularEstadoDeCuenta(BancoModel cliente) {
        double saldoActual = cliente.getSaldoAnterior() + cliente.getMontoCompras() - cliente.getPagoAnterior();
        boolean esMoroso = cliente.getPagoAnterior() < saldoActual * PORCENTAJE_PAGO_MINIMO;

        double intereses = 0;
        double multa = 0;

        if (esMoroso) {
            intereses = saldoActual * INTERES_MOROSIDAD;
            multa = MULTA_MOROSIDAD;
            saldoActual += intereses + multa;
        }

        double pagoMinimo = saldoActual * PORCENTAJE_PAGO_MINIMO;
        double pagoSinIntereses = saldoActual * PORCENTAJE_PAGO_SIN_INTERESES;

        cliente.setSaldoActual(saldoActual);
        cliente.setPagoMinimo(pagoMinimo);
        cliente.setPagoParaNoGenerarIntereses(pagoSinIntereses);
        cliente.setEsMoroso(esMoroso);
        cliente.setInteresesGenerados(intereses);
        cliente.setMulta(multa);
        cliente.setTotalGanadoPorMorosidad(intereses + multa);
    }
}
