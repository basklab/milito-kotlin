import config.AncientBritish

data class Employee(
    val name: String,
    val wage: Int,
    val position: String,
    val colleagues: List<Employee>?
)


fun main() {
//    val classLoader = Thread.currentThread().contextClassLoader
//    val file = File(classLoader.getResource("person.yaml")!!.file)
//
//    val mapper = ObjectMapper(YAMLFactory()).registerKotlinModule()
//
//    val employee: Employee = mapper.readValue(file)

    println("Cards info ${AncientBritish.leaders}")
    println("Cards info ${AncientBritish.units}")
    println("Cards info ${AncientBritish.counts}")

    println("DONE.")
}
