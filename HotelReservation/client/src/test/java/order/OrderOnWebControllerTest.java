package order;

import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import bl.orderbl.OrderOnWeb;
import util.OrderOnWebMsg;
import util.OrderState;
import util.ResultMsg;
import util.User;
import vo.OrderOnWebVO;

public class OrderOnWebControllerTest {

	OrderOnWeb webBLServiceImpl;
	ArrayList<OrderOnWebVO> webList;
	OrderOnWebVO web1;
	ResultMsg r1;
	OrderOnWebMsg msg1;
	
	@Before
	public void setUp(){
		webBLServiceImpl = new OrderOnWeb();
		webList = new ArrayList<>();
		web1 = new OrderOnWebVO(new User("txin",100,"18805156300","151250132@smail.nju.edu.cn"),"42654645437",
				OrderState.ABNORMAL,105,"火车晚点");
		webList.add(web1);
		//r1 = new ResultMsg(true, "处理成功！");
		r1 = ResultMsg.SUCCESS;
		msg1 = new OrderOnWebMsg(web1.getInitiator(),web1.getOrderID(),web1.getOrderState(),
				web1.getPrice(),web1.getReason());;
	}
	
	@Test
	public void testComplaintListScan() throws RemoteException{
		ArrayList<OrderOnWebVO> webs = webBLServiceImpl.complaintListScan();
		assertEquals(webs, webList);
	}
	
	@Test
	public void testComplaintHandle() throws RemoteException{
		ResultMsg msg1 = webBLServiceImpl.complaintHandle(web1);
		assertEquals(msg1, r1);
		assertEquals(msg1, r1);
	}
	
	@Test
	public void testAbnormalOrderScan() throws RemoteException{
		ArrayList<OrderOnWebVO> webs = webBLServiceImpl.abnormalOrderScan();
		assertEquals(webs, webList);
	}
	
	@Test
	public void testAbnormalOrderDetail() throws RemoteException{
		OrderOnWebMsg m1 = webBLServiceImpl.abnormalOrderDetail(web1);
		assertEquals(m1.getInitiator(), msg1.getInitiator());
		assertEquals(m1.getOrderState(), msg1.getOrderState());
		assertEquals(m1.getPrice(), msg1.getPrice());
		assertEquals(m1.getReason(), msg1.getReason());
	}

}
