package br.teste.mskotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsKotlinApplication

fun main(args: Array<String>) {
	runApplication<MsKotlinApplication>(*args)
}
