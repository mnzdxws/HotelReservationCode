package bl.hotelbl;

import java.util.ArrayList;

import util.HotelMsg;
import util.ResultMsg;
import vo.HotelInfoVO;

public class HotelInfoMaintainController {
	
	public ArrayList<HotelInfoVO> hotelList;
	
	public HotelInfoMaintainController() {
		hotelList = new ArrayList<HotelInfoVO>();
	}
	
	/**
	 * ����Ƶ���Ϣ
	 *
	 */
	public HotelMsg inputHotelInfo(HotelInfoVO hotelInfoVO){
		return new HotelMsg(hotelInfoVO.getName(),hotelInfoVO.getAddress(),
    			hotelInfoVO.getArea(),hotelInfoVO.getLevel(),hotelInfoVO.getIntroduction(),
    			hotelInfoVO.getFacility(),hotelInfoVO.isReserved());
	}
	
	/**
	 * �ύ�Ƶ���Ϣ
	 * 
	 */
    public ResultMsg submitInfo(HotelInfoVO hotelInfoVO){
    	return new ResultMsg(true,"ά���ɹ�");
    }

}