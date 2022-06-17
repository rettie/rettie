package com.rettie.rettie.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
	public String ping() {
        if (1+1==2) {
            System.out.println("asdasdasdasd");
            System.out.println("asdasd");  // move bad code
            // asdasdasdhasodhaosij
          } if (1+1==2) {
            System.out.println("asdasdsasd");
          }
		return "test";         // asdasdoasioasidjasodij
	}

}
