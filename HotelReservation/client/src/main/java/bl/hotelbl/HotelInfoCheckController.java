package bl.hotelbl;

import java.util.ArrayList;

import util.HotelMsg;
import vo.HotelInfoVO;

public class HotelInfoCheckController {
	public ArrayList<HotelInfoVO> hotelList;
	
	public HotelInfoCheckController() {
		hotelList = new ArrayList<HotelInfoVO>();
	}
	
	
	/**
	 * ��ʾ�Ƶ���Ϣ
	 * 
	 */
    public HotelMsg checkHotelInfo(HotelInfoVO hotelInfoVO){
    	return new HotelMsg(hotelInfoVO.getName(),hotelInfoVO.getAddress(),
    			hotelInfoVO.getArea(),hotelInfoVO.getLevel(),hotelInfoVO.getIntroduction(),
    			hotelInfoVO.getFacility(),hotelInfoVO.isReserved());
    }
      
}