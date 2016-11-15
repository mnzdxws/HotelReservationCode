package businesslogicserviceimpl.userblserviceimpl;

import businesslogicservice.userblservice.WebIndividualInformationManagementBLService;
import dataserviceimpl.userdataserviceimpl.UserManagementDataServiceImpl;
import vo.UserIDVO;
import vo.UserInfoVO;


/**
 * ��վӪ����Ա����վ������Ա�ĸ�����Ϣ����
 * @author Administrator
 *
 */
public class WebIndividualInformationManagementBLServiceImpl implements WebIndividualInformationManagementBLService {

	UserManagementDataServiceImpl user=new UserManagementDataServiceImpl();
	UserIDVO v;
	
	public WebIndividualInformationManagementBLServiceImpl(UserIDVO vo){
		v=vo;
	}
	
	/**
	 * �鿴������Ϣ	
	 * @param �û�IDVO
	 * @return �û�������ϢVO
	 */
	public UserInfoVO IndividualBaseInfolnquiry(UserIDVO vo){
		return (UserInfoVO)user.GetUserBaseInfo(vo);
	}
			
	/**
	 * �޸ĸ�����Ϣ	
	 * @param �û�IDVO
	 * @param �û���ϢVO
	 * @return �޸Ľ��
	 */
	public boolean IndividualBaseInfoModification(UserIDVO vo1,UserInfoVO vo2){
		return user.SetUserBaseInfo(vo1,vo2);
	}
			
}