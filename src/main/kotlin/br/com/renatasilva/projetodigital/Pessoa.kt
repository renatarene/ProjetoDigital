package br.com.renatasilva.projetodigital

class Pessoa {
    var nome = "Renata"
    var cpf = "123.123.123.12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}
fun main() {
    val renata = Pessoa()
    println(renata.pessoaInfo())

}