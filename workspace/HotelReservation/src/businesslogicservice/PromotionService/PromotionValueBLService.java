package businesslogicservice.PromotionService;

/**
 * ������ֵ�߼���ӿ�
 * @author T5-SK
 *
 */


import vo.OrderVO;
import businesslogic.util.*;

import po.UserInfoPO;

public interface PromotionValueBLService {
	public OrderVO getValue(UserInfoPO user,OrderVO order,String time,PromotionHotelType hotelType);
	public OrderVO getValue(UserInfoPO user,OrderVO order,String time,PromotionWebType webType);
}