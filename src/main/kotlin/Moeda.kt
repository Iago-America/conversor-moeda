fun cambioDolar(n: Float) = n * 5.52.toFloat()
fun cambioEuro(n: Float) = n * 6.38.toFloat()
fun cambioLibra(n: Float) = n * 7.51.toFloat()
fun cambioPeso(n: Float) = n * 0.056.toFloat()

fun main() {

    print("""
        
        Bem vindo ao conversor de moedas criado por Iago.
        Antes de começarmos fale seu nome.
        Digite: """.trimIndent())

        val name = readLine()

            print("""
                |---------------------------------------
                |Bem vindo $name! Espero que você esteja bem.
                |Qual moeda você quer comprar?
                |
                |1 -> Dólar
                |2 -> Euro
                |3 -> Libra Esterlina
                |4 -> Peso Argentino
                |Digite: """.trimMargin())

            var x = Integer.valueOf(readLine())

            if (x == 1) {
                print("""
                    |---------------------------------------
                    |Quantos doláres você pretende comprar?
                    |Digite o valor: U$ """.trimMargin())

                var a = readLine()!!.toFloat()

                print ("\n$name, você terá que pagar R$${cambioDolar(a)} reais \n")

            }else if (x == 2) {
                print("""
                    |---------------------------------------
                    |Quantos euros você pretende comprar?
                    |Digite o valor: €""".trimMargin())

                var a = readLine()!!.toFloat()

                print ("\n" + "$name, você terá que pagar R$${cambioEuro(a)} reais\n")

            }else if (x == 3) {
                print("""
                    |---------------------------------------
                    |Quantas libras esterlinas você pretende comprar?
                    |Digite o valor: £""".trimMargin())

                var a = readLine()!!.toFloat()

                print ("\n" + "$name, você terá que pagar R$${cambioLibra(a)} reais\n")

            }else if (x == 4) {
                print("""
                    |---------------------------------------
                    |Quantos pesos argentinos você pretende comprar?
                    |Digite o valor: """.trimMargin())

                var a = readLine()!!.toFloat()

                print ("\n" + "$name, você terá que pagar R$${cambioPeso(a)} reais\n")

            }else {
                print("Essa operação não existe! Recomece e escolha entre 1, 2, 3 e 4")
            }
        }