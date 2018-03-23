package cc.whitespace123.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/test")
	public String testThis(Model model) {
		model.addAttribute("name", "陈");
		return "test";
	}

	@RequestMapping(value = "/index")
	public String testIndex() {
		return "index";
	}
}
