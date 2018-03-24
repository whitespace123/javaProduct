package cc.whitespace123.service;

import java.util.List;

import cc.whitespace123.enity.Article;

public interface ArticleService {
	void saveArticle(Article article);

	void removeArticle(Article article);

	void modifyArticle(Article article);

	Article findArticle(Article article);

	List<Article> findArticles(Article article);
}
