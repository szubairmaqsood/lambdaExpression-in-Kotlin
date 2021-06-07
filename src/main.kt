

fun main(){
    //Lambda expression with no arguments
    val company = { println("GeeksforGeeks")}

     // it is a lamba expression which takes string as parameter and return string
    // {parameter -> implimentation}
    val upperCase1: (String) -> String = { str: String -> str.toUpperCase() } // 1
    // In this expression str type is infered
    val upperCase2: (String) -> String = { str -> str.toUpperCase() }       //2

    // as you can see beofre lamba expression things are missing so they are inferred from return type and parameter type you can not ingore both
    val upperCase3 = { str: String -> str.toUpperCase() }                 //3

    // If only one parameter is there you can use the word of it from parameter

    val upperCase5: (String) -> String = { it.toUpperCase() }                 // 5

    val upperCase6: (String) -> String = String::toUpperCase                  // 6

    println("HeLLo world");
    company();
    println(upperCase1("pakistan"));
    println(upperCase3("america"));
    println(upperCase5("japan"));
    println(upperCase6("japan"));
}