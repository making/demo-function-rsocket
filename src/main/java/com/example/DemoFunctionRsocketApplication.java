package com.example;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoFunctionRsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFunctionRsocketApplication.class, args);
	}

	@Bean
	public Function<String, String> uppercase() {
		return v -> {
			System.out.println("Uppercasing: " + v);
			return v.toUpperCase();
		};
	}


	@Bean
	public Function<String, String> echo() {
		return v -> {
			System.out.println("Echo: " + v);
			return v;
		};
	}


	@Bean
	public Function<Person, String> reverse() {
		return p -> {
			System.out.println("Reversing: " + p);
			return new StringBuilder(p.getName()).reverse().toString();
		};
	}

	private static class Person {
		private String name;

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Person: " + this.name;
		}
	}
}
