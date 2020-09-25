package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoFunctionRsocketApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoFunctionRsocketApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoFunctionRsocketApplication.class, args);
	}

	@Bean
	public Function<String, String> echo() {
		return v -> {
			log.info("Echo: {}", v);
			return v;
		};
	}

	@Bean
	public Function<String, String> uppercase() {
		return v -> {
			log.info("Uppercasing: {}", v);
			return v.toUpperCase();
		};
	}

	@Bean
	public Function<String, String> lowercase() {
		return v -> {
			log.info("Lowercasing: {}", v);
			return v.toLowerCase();
		};
	}

	@Bean
	public Function<String, String> reverse() {
		return v -> {
			log.info("Reversing: {}", v);
			return new StringBuilder(v).reverse().toString();
		};
	}

	@Bean
	public Function<String, String> shuffle() {
		return v -> {
			final List<String> singles = Arrays.asList(v.split(""));
			Collections.shuffle(singles);
			return String.join("", singles);
		};
	}
}
