package br.com.renatasilva.projetodigital

import java.math.BigDecimal

 abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario:BigDecimal
): Pessoa(nome,cpf) {
    protected bstract fun calculoAuxilio():
}