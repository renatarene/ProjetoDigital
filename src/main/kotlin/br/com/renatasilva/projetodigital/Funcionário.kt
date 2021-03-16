package br.com.renatasilva.projetodigital

import java.math.BigDecimal

 abstract class Funcionário(
    nome:String,
    cpf:String,
    val salario:BigDecimal
): Pessoa(nome,cpf) {
    abstract fun calculoAuxilio():
}