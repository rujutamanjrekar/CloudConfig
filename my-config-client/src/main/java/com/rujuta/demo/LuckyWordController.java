/**
 * 
 */
package com.rujuta.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rujuta Manjrekar
 *
 */
@RestController
public class LuckyWordController {
	
	@Value("${lucky-word}")
	String luckyWord;
	
	@GetMapping("/lucky-word")
	public String showLuckyWord() {
		return luckyWord;
	}

}
