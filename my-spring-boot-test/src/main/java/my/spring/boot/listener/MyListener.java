package my.spring.boot.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * date: 2019/12/11
 *
 * @author Xianjun.Ke
 */
public class MyListener implements ApplicationListener<ApplicationStartingEvent> {
	public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
		System.out.println("application start " + applicationStartingEvent);
	}
}
