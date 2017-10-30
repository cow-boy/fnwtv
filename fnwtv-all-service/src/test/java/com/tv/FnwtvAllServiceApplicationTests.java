package com.tv;

import com.tv.provider.LiveTvProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FnwtvAllServiceApplicationTests {

	@Autowired
	private LiveTvProvider liveTvProvider;

	@Test
	public void selLiveTvList() {
		Object o = liveTvProvider.selLiveTvList(null, null);
		System.out.println(o);
	}

	@Test
	public void selLiveVipList() {
		Object o = liveTvProvider.selLiveVipList();
		System.out.println(o);
	}

}
