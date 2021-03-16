package br.com.renatasilva.projetodigital.testes

import br.com.renatasilva.projetodigital.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime (funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}