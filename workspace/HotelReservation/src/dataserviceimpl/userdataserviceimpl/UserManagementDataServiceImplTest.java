package dataserviceimpl.userdataserviceimpl;


import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import vo.HotelIDVO;
import vo.LoginInputVO;
import vo.UserIDVO;
import vo.UserInfoVO;

public class UserManagementDataServiceImplTest {

	UserManagementDataServiceImpl impl;
	LoginInputVO log;
	UserIDVO vo;
	
	@Before
	public void setUp(){
		impl=new UserManagementDataServiceImpl();
		log=new LoginInputVO("123456789","123456789");
		vo=new UserIDVO("123456798");
	}
	
	@Test
	public void testGetLoginInfo() throws RemoteException{
		assertEquals(impl.GetLoginInfo(log),"123456789");
	}
	
	@Test
	public void testAddUser() throws RemoteException{
		log=new LoginInputVO(" ","123456");
		assertEquals(impl.AddUser(log),"000000000");
	}
	
	
	@Test
	public void testGetUserBaseInfo() throws RemoteException{
		assertEquals(impl.GetUserBaseInfo(vo),null);
	}

	@Test
	public void testSetUserBaseInfo() throws RemoteException{
		UserInfoVO v=new UserInfoVO("123456798","Lily","12345678765");
		assertEquals(impl.SetUserBaseInfo(vo, v),true);
	}
	
	@Test
	public void testaddHotelStuff() throws RemoteException{
		HotelIDVO o=new HotelIDVO("123456");
		assertEquals(impl.addHotelStuff(o,vo),true);
	}
	
	public void testaddWebStuff() throws RemoteException{
		vo=new UserIDVO("123546789");
		assertEquals(impl.addWebStuff(vo),true);
	}
}
