package cc.whitespace123;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * tomcat启动类<br/>
 * 
 * @author WhiteSpace123
 * @version v0.0.1
 */
@RestController
@RequestMapping("app")
@SpringBootApplication
@MapperScan("cc.whitespace123.dao")
public class App {

	@RequestMapping("demo")
	public String demo() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
