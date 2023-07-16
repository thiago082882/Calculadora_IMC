package com.thiago.calculadoraimccompose.calculo

import java.text.DecimalFormat

class CalcularImc {


    private var resultadoImc = ""
    fun calcularImc(peso: String, altura: String) {
        val pesoConvertido = peso.toDouble()
        val alturaConvertido = altura.toDouble()
        val result: String

        val imc = pesoConvertido / (alturaConvertido * alturaConvertido)
        val decimalFormat = DecimalFormat("0.00")
        if (imc <= 18.5) {
            result = "Peso Baixo  \n IMC: ${decimalFormat.format(imc)}"

        } else if (imc <= 24.9) {
            result = "Peso Normal  \n IMC: ${decimalFormat.format(imc)}"
        } else if (imc <= 29.9) {
            result = "Sobrepeso  \n IMC: ${decimalFormat.format(imc)}"
        } else if (imc <= 34.9) {
            result = "Obesidade (Grau I)  \n IMC: ${decimalFormat.format(imc)}"
        } else if (imc <= 39.9) {
            result = "Obesidade Severa (Grau II)  \n IMC: ${decimalFormat.format(imc)}"
        } else {
            result = "Obesidade Mórbida (Grau III)  \n IMC: ${decimalFormat.format(imc)}"
        }
        resultadoImc = result
    }

    fun resultadoImc(): String {
        return resultadoImc
    }
}