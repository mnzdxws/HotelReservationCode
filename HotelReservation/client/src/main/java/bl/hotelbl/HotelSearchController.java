package bl.hotelbl;

import java.util.ArrayList;

import util.HotelMsg;
import vo.HotelInfoVO;

public class HotelSearchController {
	public ArrayList<HotelInfoVO> hotelList;
	
	public HotelSearchController() {
		hotelList = new ArrayList<HotelInfoVO>();
	}
	
	/**
	 * ѡ��Ƶ�����
	 *
	 */
	public HotelMsg selectCondition(HotelInfoVO hotelInfoVO){
		return new HotelMsg(hotelInfoVO.getName(),hotelInfoVO.getAddress(),
    			hotelInfoVO.getArea(),hotelInfoVO.getLevel(),hotelInfoVO.getIntroduction(),
    			hotelInfoVO.getFacility(),hotelInfoVO.isReserved());
	}
	
	/**
	 * ��ʾ�Ƶ��б�
	 * 
	 */
    public ArrayList<HotelInfoVO> showList(HotelInfoVO hotelListInfoVO){
    	return hotelList;
    }
}