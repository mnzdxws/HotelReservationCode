package data;

import static org.junit.Assert.*;

import java.awt.Window.Type;
import java.rmi.RemoteException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import data.vipdata.VipDataSerivceImpl;
import dataservice.vipdataservice.VipDataService;
import po.BusinessVipPO;
import po.CommonVipPO;
import po.LevelSystemPO;
import util.ResultMsg;

public class VipDataServiceImplTest {

	private VipDataSerivceImpl impl;
	
	@Before
	public void setUp() throws Exception {
		impl = new VipDataSerivceImpl();
	}

//	@Test
//	public void testAdd() throws RemoteException {
//		LevelSystemPO levelSystemPO = new LevelSystemPO(1, 100);
//		vip = new VipDataSerivceImpl();	
//			
//		vip.insertL(levelSystemPO);
//		System.out.println(levelSystemPO.getLevels());
//		System.out.println(levelSystemPO.getCredits());
//		assertEquals(levelSystemPO.getLevels(), 1);
//	}
	
	@Test
	public void testFindByL() throws RemoteException{
		LevelSystemPO po = impl.findL(1);
		System.out.println(po.getLevels());
		System.out.println(po.getCredits());
	}

}
