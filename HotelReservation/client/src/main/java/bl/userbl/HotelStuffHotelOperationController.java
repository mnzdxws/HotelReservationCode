package bl.userbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import blservice.userblservice.HotelStuffHotelOperationBlService;
import dataservice.userdataservice.UserManagementDataService;
import net.RMIManage;
import util.DataServiceType;
import util.ResultMsg;
import vo.HotelInfoVO;
import vo.OrderVO;
import vo.PromotionHotelVO;
import vo.RoomInfoVO;



/**
 * 酒店工作人员对酒店进行的操作
 * @author 曹畅
 *
 */
public class HotelStuffHotelOperationController implements HotelStuffHotelOperationBlService {

	private HotelStuff stuff;
	private UserManagementDataService userManagementDataService;
	
	
	public HotelStuffHotelOperationController(){
		userManagementDataService = (UserManagementDataService)RMIManage.
				getDataService(DataServiceType.UserManagementDataService);
		stuff=new HotelStuff(userManagementDataService);
	}
	
	
	/**
	 * 查看酒店信息	
	 * @param 酒店IDVO
	 * @return 酒店信息VO
	 */
	public HotelInfoVO HotelInformationInquiry(String hotelid){
		try {
			return stuff.HotelInformationInquiry(hotelid);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
			
	/**
	 * 修改酒店信息	
	 * @param 酒店VO
	 * @param 用户IDVO
	 * @return 修改结果
	 */
	public ResultMsg HotelInformationModification(HotelInfoVO vo1,String userid){
		try {
			return stuff.HotelInformationModification(vo1, userid);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}
			
	
	/**
	 * 管理酒店促销策略	
	 * @param 酒店IDVO
	 * @param 酒店促销策略VO
	 * @return 修改结果
	 */
	public boolean HotelStrategeManage(PromotionHotelVO vo){
		try {
			return stuff.HotelStrategeManage(vo);
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}
			
	/**
	 * 更新订单状态	
	 * @param 用户IDVO
	 * @param 订单VO
	 * @throws RemoteException 
	 */
	public ResultMsg OrderStateUpdate(String userid,OrderVO vo2) throws RemoteException{
		return stuff.OrderStateUpdate(userid, vo2);
	}
			
	/**
	 * 浏览酒店订单	
	 * @param 酒店IDVO
	 * @return 订单VO列表
	 */
	public ArrayList<OrderVO> OrderScan(String hotelid){
		try {
			return stuff.OrderScan(hotelid);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 查看酒店促销策略
	 * @param 酒店IDVO
	 * @return 酒店促销策略列表
	 */
	public ArrayList<PromotionHotelVO> HotelPromotionInquire(PromotionHotelVO promotion) {
		try {
			return stuff.HotelPromotionInquire(promotion);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 更新房间信息
	 * @param 房间信息VO
	 */
	public ResultMsg UpdateRoomState(RoomInfoVO vo) {
		try {
			return stuff.UpdateRoomState(vo);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
		
	}


	/**
	 * 增加酒店促销策略	
	 * @param 酒店IDVO
	 * @param 酒店促销策略VO
	 * @return 修改结果
	 */
	public boolean HotelStrategeAdd(PromotionHotelVO vo) {
		try {
			return stuff.HotelStrategeAdd(vo);
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}
}
