package de.htwberlin.visitenkarten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class VisitenkartenApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitenkartenApplication.class, args);
	}



	@Controller
	public class GreetingController {

		@GetMapping("/greeting")
		public String greeting(@RequestParam(name="name", required=false, defaultValue="Boss") String name, Model model) {
			model.addAttribute("name", name);
			return "greeting";
		}

	}
}
