package my.spring.boot.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * date: 2019/12/11
 *
 * @author Xianjun.Ke
 */
@Component
public class RandomValueTest {
	@Value("${my.secret}")
	private String mySecret;
	@Value("${my.number}")
	private int myNumber;
	@Value("${my.bignumber}")
	private long myBigNumber;
	@Value("${my.uuid}")
	private String myUuid;
	@Value("${my.number.less.than.ten}")
	private int thenTen;
	@Value("${my.number.in.range}")
	private int range;

	@PostConstruct
	public void postConstruct() {
		System.out.println("mySecret : " + mySecret);
		System.out.println("myNumber : " + myNumber);
		System.out.println("myBigNumber : " + myBigNumber);
		System.out.println("myUuid : " + myUuid);
		System.out.println("thenTen : " + thenTen);
		System.out.println("range : " + range);
	}
}
