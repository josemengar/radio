package radio
fun main(args : Array<String>) {
   val ra: Int = 1
    while (ra != 0){
        println("Quieres apagar la radio : 1")
        println("AM o FM")
        val type:String?= readLine()
        if ((type== "am"))
            println("usted esta escuchando la AM")
            println("escoja una emisora de 1000 a 1500")
            val am = 1000..1500
            val type1:String?= readLine()
            if ((type1 in am ))
                println(type1)



    }
}