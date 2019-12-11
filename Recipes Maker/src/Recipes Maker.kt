fun main () {
    val menu: String = """
            
              :: Bienvenido a Recipe Maker :: 
              
              
              Selecciona la opción deseada 
            1. Hacer una receta 
            2. Ver mis recetas 
            3. Salir
        """.trimIndent()
    val ingredientes = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite","Menú Principal")
    val recetas: MutableList<String> = mutableListOf()
    do {
        println("$menu")
        val opcionmenu: String? = readLine()
        when (opcionmenu) {
            "1" -> makeRecipe(ingredientes,recetas)
            "2" -> viewRecipe(recetas)
            "3" -> println("Ha seleccionado Salir")
            else -> println("Opción incorrecta.Presione opción 1 a 3")
           }
    }while (opcionmenu.equals("3").not())
}

fun makeRecipe(ingredientes : List<String>,recetas: MutableList<String>)
{
    println("Hacer receta \n Selecciona por categoría el ingrediente que buscas")
    for ((index, ingrediente) in ingredientes.withIndex()) {
        println("${index.plus(1)}. $ingrediente")
    }
    do {
        val opcioningrediente: Int? = readLine()?.toInt()
        when (opcioningrediente) {
            in 1..8 -> {
                recetas.add(ingredientes[opcioningrediente!!.minus(1)])
                println("Agregaste \"${ingredientes[opcioningrediente!!.minus(1)]}\" a tu receta, agrega otro")
            }
            9 -> println("Saldrás al menú principal")
            else -> println("Opción incorrecta.Presione opción 1 a 9")
        }
    } while (opcioningrediente!!.equals(9).not())
}

fun viewRecipe(recetas: MutableList<String>) {
    println("Ver mis recetas  \n ")
    recetas.forEach() {
        println(it)
    }
}