package businesslogicserviceimpl.userblserviceimpl;

import java.util.ArrayList;

import vo.UserIDVO;
import vo.UserInfoVO;
import businesslogicservice.userblservice.WebManagerWebsiteManagementBLService;
import dataserviceimpl.userdataserviceimpl.UserManagementDataServiceImpl;



/**
 * ��վ������Ա����վ�Ĳ���
 * @author �ܳ�
 *
 */
public class WebManagerWebsiteManagementBLServiceImpl implements WebManagerWebsiteManagementBLService {

	UserManagementDataServiceImpl check;
	
	public WebManagerWebsiteManagementBLServiceImpl(){
		check=new 	UserManagementDataServiceImpl();
	}
	
	/**
	 * �鿴�û�������Ϣ
	 * @param �û�IDVO
	 * @return �û�������ϢVO
	 */
	public UserInfoVO UserInformationInquiry(UserIDVO vo){
		return check.GetUserBaseInfo(vo);
	}
			
	
	/**
	 * �޸��û���Ϣ
	 * @param �û�IDVO
	 * @param �û�������ϢVO
	 * @return �޸Ľ��
	 */
	public boolean UserInformationModification(UserIDVO vo1,UserInfoVO vo2){
		return check.SetUserBaseInfo(vo1,vo2);
	}
			
	/**
	 * ������վӪ����Ա
	 * @param �û�IDVO
	 */
	public boolean WebsiteStuffAdd(UserIDVO vo){
		return check.addWebStuff(vo);
	}

	/**
	 * �鿴��վӪ����Ա�б�
	 * @return ��վӪ����Ա�б�
	 */
	public ArrayList<UserInfoVO> WebStuffScan() {
		// TODO Auto-generated method stub
		return null;
	}
}