data class Recipe(
    val title: String,
    val difficulty: String = "Easy",
    val isVegetarian: Boolean = false
) {
    constructor(param_title: String) : this(param_title, "Moderate", false)

    fun findRecipes(title: String = "New recipe",
                    difficulty: String = "Easy",
                    isVegetarian: Boolean = false) : Array<Recipe>{

        return arrayOf(Recipe(title,difficulty, isVegetarian))

    }

}

fun main(args : Array<String>){

    val recipe1 = Recipe("Thai Chicken","Moderate")
    val recipe2 = Recipe("Spaghetti", isVegetarian = true)
    val recipe3 = recipe1.copy(title = "Cake British")

    val (title, diff ,isVegetarian) = recipe2
    println("\n Title is $title is ${if(isVegetarian) "vegetarian" else " not vegetarian"}")


}