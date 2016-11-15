package businesslogicservice.userblservice;

import businesslogicserviceimpl.userblserviceimpl.HotelStuffHotelOperationBlServiceImpl;
import businesslogicserviceimpl.userblserviceimpl.StuffIndividualInformationManagementBLServiceImpl;
import vo.HotelIDVO;
import vo.StuffInfoVO;
import vo.UserIDVO;

public class HotelStuff {
	
	String userid;
	UserIDVO idvo;
	HotelStuffHotelOperationBlServiceImpl hotel;
	StuffIndividualInformationManagementBLServiceImpl user;
	StuffInfoVO vo;
	
	public HotelStuff(String userid){
		this.userid=userid;
		idvo=new UserIDVO(userid);
		hotel=new HotelStuffHotelOperationBlServiceImpl();
		user=new StuffIndividualInformationManagementBLServiceImpl(idvo);
		vo=user.IndividualBaseInfolnquiry(idvo);
		//HotelIDVO id=new HotelIDVO("1234567");
		//vo=new StuffInfoVO(userid,"Tim","18192345782",id);
		//user.voi=vo;
	}
	
	public String getName(){
		return vo.getUsername();
	}
	
	public String getid(){
		return vo.getUserid();
	}
	
	public String getcontact(){
		return vo.getContact();
	}
	
	public String getHotelid(){
		HotelIDVO v = vo.getHotel();
		return v.getHotelID();
	}
	
	public boolean BaseInfoModification(StuffInfoVO vo1){
		return user.IndividualBaseInfoModification(idvo,vo1);
	}
	

}
