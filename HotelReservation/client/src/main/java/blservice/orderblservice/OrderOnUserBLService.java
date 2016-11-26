package blservice.orderblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import util.OrderMsg;
import util.ResultMsg;
import vo.OrderOnUserVO;

/**
 * 客户查询个人订单信息及详情，执行订单的撤销
 * 
 * @author txin
 *
 */
public interface OrderOnUserBLService {
	
	/**
	 * 客户查看个人订单信息
	 *
	 * @param void
	 * @return 个人订单列表
	 */
	public ArrayList<OrderOnUserVO> personalOrderScan();
	
	/**
	 * 客户创建订单
	 *
	 * @param 个人订单
	 * @return void
	 * @throws RemoteException 
	 */
	public void createOrder(OrderOnUserVO orderVO);
	
	/**
	 * 客户撤销个人订单
	 *
	 * @param orderVO 订单VO
	 * @return 系统提示消息
	 */
	public ResultMsg personalOrderCancel(OrderOnUserVO orderVO);
	
	/**
	 * 客户查看个人订单详情
	 *
	 * @param OrderOnUserVO 订单VO
	 * @return 个人订单详情
	 */
	public OrderMsg personalOrderDetail(OrderOnUserVO orderVO);
	
}
