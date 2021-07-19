package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Degemar"

    var cpf: String = "123.123.123-11"
    private set
}

fun main() {
    val degemar = Pessoa()

    println(degemar)
    println(degemar.nome)
    println(degemar.cpf)

}