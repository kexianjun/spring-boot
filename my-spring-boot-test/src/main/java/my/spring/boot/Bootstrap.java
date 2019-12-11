package my.spring.boot;

import my.spring.boot.listener.MyListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * date: 2019/12/10
 *
 * @author Xianjun.Ke
 */
@SpringBootApplication
public class Bootstrap {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Bootstrap.class);
		app.addListeners(new MyListener());
		app.run(args);
	}
}
