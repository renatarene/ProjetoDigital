package br.com.renatasilva.projetodigital

import br.com.renatasilva.projetodigital.Analista
import br.com.renatasilva.projetodigital.Funcionario
import br.com.renatasilva.projetodigital.testes.imprimeRelatorioFuncionario

fun main () {
    val maria = Gerente("Maria do Carmo", "1234567890", 2000.0)
    imprimeRelatorioFuncionario.imprime(maria)
}


