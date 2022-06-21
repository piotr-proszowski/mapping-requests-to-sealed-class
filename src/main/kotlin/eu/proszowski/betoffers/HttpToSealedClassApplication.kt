package eu.proszowski.betoffers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HttpToSealedClassApplication

fun main(args: Array<String>) {
	runApplication<HttpToSealedClassApplication>(*args)
}
