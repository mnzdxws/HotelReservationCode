package order;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import bl.orderbl.OrderOnWebController;
import util.OrderOnWebMsg;
import util.OrderState;
import util.ResultMsg;
import util.User;
import vo.OrderOnWebVO;

public class OrderOnWebControllerTest {

	OrderOnWebController webBLServiceImpl;
	ArrayList<OrderOnWebVO> webList;
	OrderOnWebVO web1;
	ResultMsg r1;
	OrderOnWebMsg msg1;
	
	@Before
	public void setUp(){
		webBLServiceImpl = new OrderOnWebController();
		webList = OrderOnWebController.webList;
		web1 = new OrderOnWebVO(new User("txin",100,"18805156300","151250132@smail.nju.edu.cn"),"42654645437",
				OrderState.ABNORMAL,105,"������");
		webList.add(web1);
		r1 = new ResultMsg(true, "�����ɹ���");
		msg1 = new OrderOnWebMsg(web1.getInitiator(),web1.getOrderID(),web1.getOrderState(),
				web1.getPrice(),web1.getReason());;
	}
	
	@Test
	public void testComplaintListScan(){
		ArrayList<OrderOnWebVO> webs = webBLServiceImpl.complaintListScan();
		assertEquals(webs, webList);
	}
	
	@Test
	public void testComplaintHandle(){
		ResultMsg msg1 = webBLServiceImpl.complaintHandle(web1);
		assertEquals(msg1.getMessage(), r1.getMessage());
		assertEquals(msg1.isPass(), r1.isPass());
	}
	
	@Test
	public void testAbnormalOrderScan(){
		ArrayList<OrderOnWebVO> webs = webBLServiceImpl.abnormalOrderScan();
		assertEquals(webs, webList);
	}
	
	@Test
	public void testAbnormalOrderDetail(){
		OrderOnWebMsg m1 = webBLServiceImpl.abnormalOrderDetail(web1);
		assertEquals(m1.getInitiator(), msg1.getInitiator());
		assertEquals(m1.getOrderState(), msg1.getOrderState());
		assertEquals(m1.getPrice(), msg1.getPrice());
		assertEquals(m1.getReason(), msg1.getReason());
	}

}