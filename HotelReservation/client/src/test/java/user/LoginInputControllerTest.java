package user;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import bl.userbl.LoginInputController;
import vo.LoginInputVO;

public class LoginInputControllerTest {

	
		
		LoginInputVO vo;
		LoginInputController im;
		
		@Before
		public void setUp() {
			vo=new LoginInputVO("Tom","123456789");
			im=new LoginInputController();
		}

		@Test
		public void testLogin() {
			boolean result=im.LogIn(vo);
			assertEquals(result,false);
		}
		
		@Test
		public void testLogout(){
			boolean result=im.LogOut(true);
			assertEquals(result,true);
		}
		
		@Test
		public void testregister(){
		    String result=im.Register(vo);
		    assertEquals(result,"000000001");
		}
	

}