package bl.hotelbl;

import util.OrderOnUserMsg;
import util.ResultMsg;
import vo.HotelInfoVO;
import vo.OrderOnUserVO;

public class HotelReserveController {

	/**
	 * Ԥ���Ƶ�
	 *
	 */
	public ResultMsg reserveHotel(HotelInfoVO reserveHotelVO){
		return new ResultMsg(true,"Ԥ���ɹ�");
	}
	
	/**
	 * �����û�����
	 * 
	 */
    public OrderOnUserMsg createUserOrder(OrderOnUserVO order){
    	return new OrderOnUserMsg(order.getInitiator(),order.getOrderID(), order.getOrderState(), order.getPrice(), order.getLatestExecutionTime(), 
				order.getRoomType(), order.getRoomNumber(), order.getPeopleNumber(), order.getHasChild());
    }
	

      
}