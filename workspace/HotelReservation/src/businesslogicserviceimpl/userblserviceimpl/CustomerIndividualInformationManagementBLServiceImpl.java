package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import businesslogicservice.userblservice.CustomerIndividualInformationManagementBLService;
import businesslogicserviceimpl.Integralblserviceimpl.IntegralImpl;
import dataserviceimpl.userdataserviceimpl.CustomerManagementDataServiceImpl;
import dataserviceimpl.userdataserviceimpl.UserManagementDataServiceImpl;
import vo.CustomerInfoVO;
import vo.HotelInfoVO;
import vo.IntegralVO;
import vo.OrderOnUserVO;
import vo.UserIDVO;
import vo.UserInfoVO;

public class CustomerIndividualInformationManagementBLServiceImpl
		implements CustomerIndividualInformationManagementBLService {
	
	UserInfoVO userInfoVO;
	ArrayList<OrderOnUserVO> orderVOs;
	ArrayList<HotelInfoVO> hotelInfoVOs;
	ArrayList<String> orderID;
	ArrayList<String> hotelID;
	IntegralVO integralVO;
	UserManagementDataServiceImpl usermanage;
	CustomerManagementDataServiceImpl customermanage;
	IntegralImpl integral;
	
	public CustomerIndividualInformationManagementBLServiceImpl(UserIDVO vo){
		usermanage=new UserManagementDataServiceImpl();
		customermanage=new CustomerManagementDataServiceImpl();
		integral=new IntegralImpl();
		userInfoVO=usermanage.GetUserBaseInfo(vo);
		orderID=customermanage.GetCustomerOrders(vo);
		hotelID=customermanage.GetCustomerHotel(vo);
		
	}
	
	
	
	public UserInfoVO IndividualBaseInfolnquiry(UserIDVO vo){
		return userInfoVO;
	}
			
	
	public boolean IndividualBaseInfoModification(UserIDVO vo1,CustomerInfoVO vo2){
		return usermanage.SetUserBaseInfo(vo1,vo2);
	}
			
	
	public ArrayList<OrderOnUserVO> IndividualOrderInquiry(UserIDVO vo){
		return orderVOs;
	}
			
	
	public ArrayList<HotelInfoVO> IndividualHotelInquiry(UserIDVO vo){
		return hotelInfoVOs;
	}
			
	
	public IntegralVO IndividualCredictInquiry(UserIDVO vo){
		return 	integralVO;
	}
			
}
