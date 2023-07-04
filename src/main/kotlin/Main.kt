import org.apache.log4j.Logger
import org.json.JSONArray

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    JSONArray("")

    Logger.getInstance("abc").info("abc")
}