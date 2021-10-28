fun main(args: Array<String>) {
    println("Informe o um número de 1 a 12: ")
    val numero= readLine()!!.toInt()

    when(numero) {
        1 -> println("O número é referente ao mes de Janeiro")
        2 -> println("O número é referente ao mes de Fevereiro")
        3 -> println("O número é referente ao mes de Março")
        4 -> println("O número é referente ao mes de Abril")
        5 -> println("O número é referente ao mes de Maio")
        6 -> println("O número é referente ao mes de Junho")
        7 -> println("O número é referente ao mes de Julho")
        8 -> println("O número é referente ao mes de Agosto")
        9 -> println("O número é referente ao mes de Setembro")
        10 -> println("O número é referente ao mes de Outubro")
        11 -> println("O número é referente ao mes de Novembro")
        12 -> println("O número é referente ao mes de Dezembro")
        else -> println("Valor inválido")
    }
}