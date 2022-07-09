package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"),6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"),1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        BigDecimal resultadoPrimeiro = calculadora.calcular(primeiro);
        System.out.println(resultadoPrimeiro);

        BigDecimal resultadoSegundo = calculadora.calcular(segundo);
        System.out.println(resultadoSegundo);
    }
}
