fun main() {
    println("Bem vindo ao Bytebank")

    val contaEgon = Conta()

    contaEgon.titular = "Egon"
    contaEgon.numero = 1000
    contaEgon.saldo = 200.0

    println(contaEgon.titular)
    println(contaEgon.numero)
    println(contaEgon.saldo)

    val contaLuiz = Conta()
    contaLuiz.titular = "Luiz"
    contaLuiz.numero = 1001
    contaLuiz.saldo = 300.0

    println(contaLuiz.titular)
    println(contaLuiz.numero)
    println(contaLuiz.saldo)

    println("Deposito na conta do Egon: ")
    deposita(contaEgon, 50.00)
    println(contaEgon.saldo)
    println("Deposito na conta do Luiz: ")
    deposita(contaLuiz, 70.00)
    println(contaLuiz.saldo)

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

}

fun testaCopiaEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    var contaMaria = contaJoao

    contaMaria.titular = "Maria"

    println("Titular conta Joao: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

//    println("numeroX $numeroX")
//    println("numeroY $numeroY")
}


fun testaLacos() {
    var i = 0
    while (i < 5) {

        if (i == 4) {
            break
        }
        val titular = "Egon $i"
        val numeroConta = 1000
        var saldo = 0.0
        saldo = 0.0 + i * 10

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {
        val titular = "Egon $i"
        val numeroConta = 1000
        var saldo = 0.0
        saldo = 0.0 + i * 10

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }
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