const val sim = "sim"
const val não = "não"

fun main() {
    //var resultado:Double?

    print("\n" + "Bem vindo ao conversor de moedas criado por Iago\n" +
        "Antes de começarmos poderia digitar seu nome?\n")

    val pergunta = readLine()!!

    if (pergunta == sim) {
        print("\n"+"Digite seu nome: ")
            val name = readLine()

        print("\n"+"Bem vindo $name! Espero que você esteja bem.\n" +
                "Qual moeda você quer comprar?\n\n" +
                "1 -> Dólar\n" +
                "2 -> Euro\n" +
                "3 -> Libra Esterlina\n" +
                "4 -> Peso Argentino\n\n" +
                "Digite: ")

        var x = Integer.valueOf(readLine())

        if (x == 1) {
            print("\n" + "Quantos dolares você vai querer comprar?\n" +
                    "Digite o valor: U$")

            var a = readLine()!!.toFloat()
            var b = 5.29

            var resultado = a * b

            print ("\n" + "$name, você terá que pagar R$$resultado reais\n")

        }else if (x == 2) {
            print("\n" + "Quantos euros você vai querer comprar?\n" +
                    "Digite o valor: €")

            var a = readLine()!!.toFloat()
            var b = 6.18

            var resultado = a * b

            print ("\n" + "$name, você terá que pagar R$$resultado reais\n")

        }else if (x == 3) {
            print("\n" + "Quantas libras esterlinas você vai querer comprar?\n" +
                    "Digite o valor: ")

            var a = readLine()!!.toFloat()
            var b = 7.30

            var resultado = a * b

            print ("\n" + "$name, você terá que pagar R$$resultado reais\n")

        }else if (x == 4) {
            print("\n" + "Quantos pesos argentinos você vai querer comprar?\n" +
                    "Digite o valor: ")

            var a = readLine()!!.toFloat()
            var b = 0.054

            var resultado = a * b

            print ("\n" + "$name, você terá que pagar R$$resultado reais\n")

        }else {
            print("Essa operação não existe! Escolha entre 1, 2, 3 e 4")
        }
    }

    else if (pergunta == não) {
        print("\n"+"Tudo bem, respeito seu anonimato")

        print("\n"+"Bem vindo! Espero que você esteja bem.\n" +
                "Qual moeda você quer comprar?\n\n" +
                "1 -> Dólar\n" +
                "2 -> Euro\n" +
                "3 -> Libra Esterlina\n" +
                "4 -> Peso Argentino\n\n" +
                "Digite: ")

        var x = Integer.valueOf(readLine())

        if (x == 1) {
            print("\n" + "Quantos dolares você vai querer comprar?\n" +
                    "Digite o valor: U$")

            var a = readLine()!!
            var b = 5.29

            var resultado = a.toFloat() * b

            print ("\n" + "Você vai precisar pagar R$$resultado reais\n")

        }else if (x == 2) {
            print("\n" + "Quantos euros você vai querer comprar?\n" +
                    "Digite o valor: €")

            var a = readLine()!!
            var b = 6.18

            var resultado = a.toFloat() * b.toFloat()

            print ("\n" + "Você vai precisar pagar R$$resultado reais\n")

        }else if (x == 3) {
            print("\n" + "Quantas libras esterlinas você vai querer comprar?\n" +
                    "Digite o valor: ")

            var a = readLine()!!
            var b = 7.30

            var resultado = a.toFloat() * b.toFloat()

            print ("\n" + "Você vai precisar pagar R$$resultado reais\n")

        }else if (x == 4) {
            print("\n" + "Quantos pesos argentinos você vai querer comprar?\n" +
                    "Digite o valor: ")

            var a = readLine()!!
            var b = 0.054

            var resultado = a.toFloat() * b.toFloat()

            print ("\n" + "Você vai precisar pagar R$$resultado reais\n")

        }else {
            print("Essa operação não existe! Escolha entre 1, 2, 3 e 4")
        }
    }

}