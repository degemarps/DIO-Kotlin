package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Degemar"
    var cpf: String = "123.123.123-11"
}

fun main() {
    val degemar = Pessoa()

    println(degemar.nome)
    println(degemar.cpf)
}