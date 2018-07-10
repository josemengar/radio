package radio
fun main(args : Array<String>) {
    val ra: Int = 1
    while (ra != 0) {
        println("Quieres apagar la radio : si/no")
        println("que frecuencia de radio quiere escuchar : am o fm")
        val type: String? = readLine()
        if ((type == "am")) {
            println("usted esta escuchando la AM")
            println("escoja una emisora de 1000 a 1500")
            val type1: String? = readLine()
            println("la emisora que escucha es la: $type1")
        if ((type == "fm")) {
            println("usted esta escuchando la FM")
            println("escoja una emisora de 80 a 107")
            val type2: String? = readLine()
            println("la emisora que escucha es la: $type2")
        if ((type == "si")) {
            val ra = 0
                }
            }
        }
    }
}
