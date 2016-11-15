package businesslogicserviceimpl.orderblserviceimpl;

import java.util.ArrayList;

import businesslogic.util.OrderOnWebMsg;
import businesslogic.util.OrderState;
import businesslogic.util.ResultMsg;
import vo.OrderOnWebVO;

public class OrderOnWebBLServiceImpl {
	
	static ArrayList<OrderOnWebVO> webList;
	
	public OrderOnWebBLServiceImpl() {
		webList = new ArrayList<OrderOnWebVO>();
	}
	/**
	 * ��վӪ����Ա�鿴�����б�
	 *
	 * @param void
	 * @return �����б�
	 */
	public ArrayList<OrderOnWebVO> complaintListScan() {
		ArrayList<OrderOnWebVO> orderOnWebs = new ArrayList<>();
		for(int i = 0;i < webList.size(); i++){
			if(webList.get(i).getReason() != "")
				orderOnWebs.add(webList.get(i));
		}
		return orderOnWebs;
	}
	
	/**
	 * ��վӪ����Ա��������
	 *
	 * @param orderVO ����VO
	 * @return ϵͳ��ʾ��Ϣ
	 */
	public ResultMsg complaintHandle(OrderOnWebVO order){
		if(order.getReason().equals("������")){
			order.setOrderState(OrderState.UNEXECUTED);
			order.getInitiator().setCredit(order.getPrice());
			return new ResultMsg(true, "�����ɹ���");
		}else{
			order.setOrderState(OrderState.CANCELLED);
			return new ResultMsg(false, "���账��");
		}
	}
	
	/**
	 * ��վӪ����Ա�鿴�쳣�����б�
	 *
	 * @param void
	 * @return �쳣�����б�
	 */
	public ArrayList<OrderOnWebVO> abnormalOrderScan() {
		ArrayList<OrderOnWebVO> orderOnWebs = new ArrayList<>();
		for(int i = 0;i < webList.size(); i++){
			if(webList.get(i).getOrderState() == OrderState.ABNORMAL)
				orderOnWebs.add(webList.get(i));
		}
		return orderOnWebs;
	}
	
	/**
	 * ��վӪ����Ա�鿴�쳣��������
	 *
	 * @param orderVO ����VO
	 * @return ���˶�������
	 */
	public OrderOnWebMsg abnormalOrderDetail(OrderOnWebVO order){
		return new OrderOnWebMsg(order.getInitiator(),order.getOrderID(),order.getOrderState(),order.getPrice(),order.getReason());
	}
	

}