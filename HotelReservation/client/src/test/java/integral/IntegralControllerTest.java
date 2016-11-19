package integral;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bl.integralbl.IntegralController;
import vo.IntegralVO;
import vo.UserInfoVO;

public class IntegralControllerTest {
	
	private IntegralController integral;
	UserInfoVO user1 ;
	UserInfoVO user2 ;
	
	@Before
	public void setUp() throws Exception {
		user1 = new UserInfoVO("10101010", "�ƿ���", "13270898633");
		user2 = new UserInfoVO("20202020", "�ƿ���", "13270898633");
	}

	
	
	@Test
	public void testChangeIntegral() {
		integral = new IntegralController();
		integral.changeIntegral(user1,100);
		IntegralVO user1Ans = new IntegralVO(100,user1.getUserid());
		IntegralVO user1Int ;
		user1Int = integral.getIntegral(user1);
		assertEquals(user1Int,user1Ans);
		
		integral = new IntegralController();
		integral.changeIntegral(user2,500);
		IntegralVO user2Ans = new IntegralVO(500,user2.getUserid());
		IntegralVO user2Int ;
		user2Int = integral.getIntegral(user1);
		assertEquals(user2Int,user2Ans);
		
	}
}

