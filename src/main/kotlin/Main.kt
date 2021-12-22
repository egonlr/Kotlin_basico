fun main() {
    println("Bem vindo ao Bytebank")
    var i = 0
    while (i < 5) {
        i++

//    for (i in 5 downTo 1) {
//
        if (i == 4) {
            break
        }
        val titular: String = "Egon $i"
        val numeroConta: Int = 1000
        var saldo: Double = 0.0
//    saldo = 100 + 2.0
//    saldo += 200
        saldo = 0.0 + i *10

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
//
      }

//    testaCondicoes(saldo)

}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}