package my.spring.boot.conf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * date: 2019/12/11
 *
 * @author Xianjun.Ke
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("command line runner :" + args);
	}
}
