package cc.whitespace123.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cc.whitespace123.enity.Article;
import cc.whitespace123.mapper.ArticleMapper;
import cc.whitespace123.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	@Qualifier(value = "articleMapper")
	private ArticleMapper articleMapper;

	@Override
	public void saveArticle(Article article) {
		articleMapper.insertActicle(article);
	}

	@Override
	public void removeArticle(Article article) {
		articleMapper.deleteArticle(article);
	}

	@Override
	public void modifyArticle(Article article) {
		articleMapper.updateArticle(article);
	}

	@Override
	public Article findArticle(Article article) {
		Article target = articleMapper.selectArticle(article);
		return target;
	}

	@Override
	public List<Article> findArticles(Article article) {
		List<Article> articles = articleMapper.selectArticles(article);
		return articles;
	}
}
