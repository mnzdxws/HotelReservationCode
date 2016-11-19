package bl.orderbl;

import java.util.ArrayList;

import util.OrderOnHotelMsg;
import util.OrderState;
import util.ResultMsg;
import vo.OrderOnHotelVO;

public class OrderOnHotelController {
	
	public static ArrayList<OrderOnHotelVO> hotelList;
	
	public OrderOnHotelController() {
		hotelList = new ArrayList<OrderOnHotelVO>();
	}
	
	/**
	 * �Ƶ깤����Ա�鿴�Ƶ궩���б�
	 *
	 * @param void
	 * @return �Ƶ궩���б�
	 */
	public ArrayList<OrderOnHotelVO> hotelOrderScan() {
		return hotelList;
	}
	
	/**
	 * �Ƶ깤����Ա�鿴�Ƶ궩������
	 *
	 * @param orderVO ����VO
	 * @return �Ƶ궩������
	 */
	public OrderOnHotelMsg hotelOrderDetail(OrderOnHotelVO order) {
		return new OrderOnHotelMsg(order.getInitiator(),order.getOrderID(), order.getOrderState(), order.getPrice(), 
				order.getCheckInTime(), order.getCheckOutTime(), order.getLatestExecutionTime(), 
				order.getRoomType(), order.getRoomNumber(), order.getPeopleNumber(), order.getHasChild());
	}
	
	/**
	 * �Ƶ깤����Ա�޸Ķ���״̬
	 *
	 * @param orderVO ����VO
	 * @return ϵͳ��ʾ��Ϣ
	 */
	public ResultMsg hotelOrderModify(OrderOnHotelVO order) {
		if(order.getOrderState() == OrderState.UNEXECUTED) {
			order.setOrderState(OrderState.EXECUTED);
			return new ResultMsg(true, "ִ�гɹ���");
		}else{
			return new ResultMsg(false, "����״̬�����޸ģ�");
		}
	}
	

}