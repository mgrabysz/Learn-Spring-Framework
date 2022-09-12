package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.in28minutes.learnspringframework", "com.in28minutes.dummy"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);

		runner.runGame();
	}

}
