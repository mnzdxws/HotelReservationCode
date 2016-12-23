
package bl.userbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bl.BusinessLogicDataFactory;
import bl.VOPOchange;
import bl.creditbl.CreditController;
import bl.orderbl.OrderOnWebController;
import bl.promotionbl.PromotionWebController;
import dataservice.userdataservice.UserManagementDataService;
import po.UserInfoPO;
import util.PromotionWebType;
import util.ResultMsg;
import util.UserType;
import vo.CustomerInfoVO;
import vo.OrderVO;
import vo.PromotionWebVO;
import vo.UserInfoVO;

/**
 * 网站营销人员类
 * @author 曹畅
 *
 */
public class WebStuff extends User{

	private UserManagementDataService user;
	private PromotionWebController pro;
	private OrderOnWebController order;
	private CreditController inte;
	private BusinessLogicDataFactory factory=BusinessLogicDataFactory.getFactory();
	
	
	public  WebStuff(UserManagementDataService user){
		super(user);
		this.user=user;
	}
	
	
	/**
	 * 查看个人信息	
	 * @param 用户IDVO
	 * @return 用户个人信息VO
	 */
	public UserInfoVO IndividualBaseInfolnquiry(String userid)throws RemoteException{
		UserInfoPO po= user.GetWebStuffInfo(userid);
		UserInfoVO vo=(UserInfoVO)VOPOchange.POtoVO(po);
		return vo;
	}
			
	/**
	 * 修改个人信息	
	 * @param 用户IDVO
	 * @param 用户信息VO
	 * @return 修改结果
	 */
	public ResultMsg IndividualBaseInfoModification(String userid,UserInfoVO vo2)throws RemoteException{
		UserInfoPO past= user.GetWebStuffInfo(userid);
		past.setType(UserType.WebStuff);
		if(vo2.getContact()!=null){
			if(vo2.getContact().length()!=11){
				return ResultMsg.WRONG_PHONENUMBER;
			}
			past.setContact(vo2.getContact());
		}
		if(vo2.getUsername()!=null){
			past.setUsername(vo2.getUsername());
		}
		return user.SetWebStuffInfo(userid,past);
	}
	
	/**
	 * 创建网站促销策略
	 * @param 网站促销策略VO
	 */
	public ResultMsg WebsiteStrategeCreate(PromotionWebVO vo)throws RemoteException{
		PromotionWebType type=vo.getType();
		ResultMsg msg=null;
		pro = (PromotionWebController)factory.getPromotionWebBLService();
		if(type==PromotionWebType.VIP_LEVEL_PROMOTION){
			msg=pro.addLevelCut(vo.getLevel(),vo.getRatio());
		}
		else if(type==PromotionWebType.VIP_CIRCLE_PROMOTION){
			msg=pro.addCircleCut(vo.getLocation(),vo.getRatio());
		}
		else{
			msg=pro.addWebCustomCut(vo.getTimeBegin(),vo.getTimeOver(),vo.getRatio());
		}
		
		return msg;
	}
	
	/**
	 * 修改网站促销策略
	 * @param 网站促销策略VO
	 */
	public ResultMsg WebsiteStrategeMod(PromotionWebVO vo)throws RemoteException{
		PromotionWebType type=vo.getType();
		ResultMsg msg=null;
		pro = (PromotionWebController)factory.getPromotionWebBLService();
		if(type==PromotionWebType.VIP_LEVEL_PROMOTION){
			msg=pro.changeLevelCut(vo.getLevel(),vo.getRatio());
		}
		else if(type==PromotionWebType.VIP_CIRCLE_PROMOTION){
			msg=pro.changeCircleCut(vo.getLocation(),vo.getRatio());
		}
		else{
			msg=pro.changeWebCustomCut(vo.getTimeBegin(),vo.getTimeOver(),vo.getRatio());
		}
		
		return msg;
	}
	
			
	/**
	 * 查看异常订单
	 * @return 订单VO列表
	 */
	public ArrayList<OrderVO> AbnormalOrderScan()throws RemoteException{
		order = (OrderOnWebController)factory.getOrderOnWebBLService();
		return order.abnormalOrderScan();
	}
			
	/**
	 * 修改用户信用值
	 * @param 用户IDVO
	 * @param 增加值
	 * @return 修改后的用户信用值VO
	 */
	public ResultMsg UserCreditModification(String userid,int n)throws RemoteException{
		CustomerInfoVO vo=(CustomerInfoVO)VOPOchange.POtoVO(user.GetCustomerInfo(userid));
		inte=(CreditController)factory.getCreditBLService();
		return inte.addCredit(vo, n);
	}


	/**
	 * 查看网站营销策略
	 * @return 网站营销策略列表
	 */
	public ArrayList<PromotionWebVO> WebsiteStrategeInquire(PromotionWebVO vo)throws RemoteException {
		pro = (PromotionWebController)factory.getPromotionWebBLService();
		return pro.getWebPromotion(vo.getType());
	}

	/**
	 * 查看用户信用值信息
	 * @param 用户IDVO
	 * @return 用户信用信息VO
	 */
	public int userCreditInquire(String userid)throws RemoteException {
		CustomerInfoVO vo=(CustomerInfoVO)VOPOchange.POtoVO(user.GetWebStuffInfo(userid));
		inte=(CreditController)factory.getCreditBLService();
		return inte.getCredit(vo);
	}
		
	/**
	 * 浏览每日未执行订单
	 * @param today
	 * @return
	 * @throws RemoteException
	 */
	public ArrayList<OrderVO> dayUnexOrder(String today) throws RemoteException {
		order = (OrderOnWebController)factory.getOrderOnWebBLService();
		return order.dayUnexOrder(today);
	}
	
	/**
	 * 删除网站促销策略
	 * @param 网站促销策略VO
	 */
	public ResultMsg WebsiteStrategeDelete(PromotionWebVO vo)throws RemoteException{
		PromotionWebType type=vo.getType();
		ResultMsg msg=null;
		pro = (PromotionWebController)factory.getPromotionWebBLService();
		if(type==PromotionWebType.VIP_LEVEL_PROMOTION){
			msg=pro.deleteLevelCut(vo.getLevel());
		}
		else if(type==PromotionWebType.VIP_CIRCLE_PROMOTION){
			msg=pro.deleteCircleCut(vo.getLocation());
		}
		else{
			msg=pro.deleteWebCustomCut(vo.getTimeBegin(),vo.getTimeOver());
		}
		
		return msg;
	}
}