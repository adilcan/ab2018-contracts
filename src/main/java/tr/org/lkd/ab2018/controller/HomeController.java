package tr.org.lkd.ab2018.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on January, 2018
 *
 * @author adilcan
 */

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("hello")
	public String sayHello() {

		return "index";
	}
}
