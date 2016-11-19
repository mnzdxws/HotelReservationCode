package vip;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import bl.vipbl.VipController;
import util.VipType;
import vo.VipVO;

public class VipControllerTest {
	int level;
	int integral;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testchangeLevelNeed() {
		level = 1;
		integral = 100;
		VipController vip = new VipController();
		vip.changeLevelNeed(level, integral);
		assertEquals(vip.searchLevelNeed(),new VipVO("null", new ArrayList<int[][]>(), level, VipType.COMMON_VIP));
	}

}