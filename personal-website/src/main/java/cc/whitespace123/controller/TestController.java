package cc.whitespace123.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.whitespace123.enity.Article;
import cc.whitespace123.enity.User;
import cc.whitespace123.service.ArticleService;

@Controller
public class TestController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/test")
	public String testThis(Model model) {
		Article article = new Article();
		article.setId(1);
		User user = new User();
		user.setId(1);
		article.setUserId(user);
		Article target = articleService.findArticle(article);
		model.addAttribute("title", target.getTitle());
		model.addAttribute("content", target.getContent());
		model.addAttribute("type", target.getType());
		model.addAttribute("id", target.getUserId().getId());
		return "test";
	}

	@RequestMapping(value = "/index")
	public String testIndex() {
		return "index";
	}

}
