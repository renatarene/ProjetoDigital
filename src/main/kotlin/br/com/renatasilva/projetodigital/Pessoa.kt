package br.com.renatasilva.projetodigital

class Pessoa {
    var nome = "Renata"
    var cpf = "123.123.123.12"
    private set



}
fun main() {
    val renata = Pessoa()

    println(renata.nome)
    println(renata.cpf)

}