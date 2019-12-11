package my.spring.boot.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * date: 2019/12/11
 *
 * @author Xianjun.Ke
 */
@Component
public class MyConfiguration {

	@Autowired
	public MyConfiguration(ApplicationArguments arguments) {
		List<String> nonOptionArgs = arguments.getNonOptionArgs();
		nonOptionArgs.forEach(System.out::println);
	}
}
