package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import businesslogicservice.userblservice.CustomerHotelOperationBlService;
import businesslogicserviceimpl.hotelblserviceimpl.HotelEvaluateBLServiceImpl;
import businesslogicserviceimpl.hotelblserviceimpl.HotelReserveBLServiceImpl;
import businesslogicserviceimpl.hotelblserviceimpl.HotelSearchBLServiceImpl;
import businesslogicserviceimpl.orderblserviceimpl.OrderOnUserBLServiceImpl;
import vo.HotelEvaluateVO;
import vo.HotelIDVO;
import vo.HotelInfoVO;
import vo.OrderOnUserVO;
import vo.VipVO;


/**
 * �ͻ��ԾƵ�Ĳ���
 * 
 * @author �ܳ�
 *
 */
public class CustomerHotelOperationBLServiceImpl implements CustomerHotelOperationBlService {
	String userID;
	HotelSearchBLServiceImpl hotel;
	HotelInfoVO cond;
	HotelReserveBLServiceImpl reserve;
	HotelEvaluateBLServiceImpl eval;
	OrderOnUserBLServiceImpl order;
	
	public CustomerHotelOperationBLServiceImpl(String userID){
		this.userID=userID;
		hotel=new HotelSearchBLServiceImpl();
		reserve=new HotelReserveBLServiceImpl();
		eval=new HotelEvaluateBLServiceImpl();
		order=new OrderOnUserBLServiceImpl();
	}

	
	/**
	 * ��������ľƵ������������ط��������ľƵ���ϢVO�б�
	 * @param ɸѡ����VO
	 * @return �Ƶ���ϢVO�б�
	 */
	public ArrayList<HotelInfoVO> HotelSearch(HotelInfoVO vo){
		cond=vo;
		return hotel.showList(cond);
	}		
	
	
	/**
	 * ��ĳһ�Ƶ����ɶ���
	 * @param �Ƶ�IDVO
	 * @param ����VO
	 *
	 */
	public void OederCreat(HotelIDVO vo1,OrderOnUserVO vo2){
	    order.createOrder(vo2);
		
	}
			

	/**
	 * ���۾Ƶ�	
	 * @param �Ƶ�����VO
	 */
	public void HotelEvaluate(HotelEvaluateVO vo){
		eval.inputEvaluate(vo);
	}
			
	
	/**
	 * �����Ա
	 * @param �Ƶ�IDVO
	 * @param ��Ա��ϢVO
	 */
	public void MemberRegisterApply(HotelIDVO vo1,VipVO vo2){
		
	}


}