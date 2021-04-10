import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import config.AncientBritish
import java.io.File

data class Employee(val name: String,
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

    println("Cards info ${AncientBritish.employee.leaders}")
    println("Cards info ${AncientBritish.employee.units}")
    println("Cards info ${AncientBritish.employee.counts}")

    println("DONE.")
}
