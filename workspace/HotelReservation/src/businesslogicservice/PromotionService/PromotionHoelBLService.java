package businesslogicservice.PromotionService;

import java.util.ArrayList;

import businesslogic.util.PromotionMsg;
import po.PromotionHotelPO;

/**
 * �Ƶ���������߼���ӿ�
 * @author kevin
 *
 */

public interface PromotionHoelBLService {
	//�޸Ĵ������ԣ������Ƿ��޸ĳɹ�����Ϣ
	public PromotionMsg changeBirthCut(int level,String ratio);
	
	public PromotionMsg changeOverCut(int number,String ratio);
	
	public PromotionMsg changeJoin(String businessName,String ratio) ;
	
	public PromotionMsg changeHotelCustomCut (String timeBegin,String timeOver, String ratio);
	//���Ӵ�������
	public PromotionMsg addBirthCut(int level,String ratio);
	
	public PromotionMsg addOverCut(int number,String ratio);
	
	public PromotionMsg addJoin(String businessName,String ratio) ;
	
	public PromotionMsg addHotelCustomCut (String timeBegin,String timeOver, String ratio);
	
	/**
	 * @param type
	 * 0:��ʾ��Ա���մ�������
	 * 1:��ʾ���������Żݲ���
	 * 2:��ʾ������ҵ��������
	 * 3:��ʾ�Զ����������
	 * @return ��Ӧ���������б�
	 */
	public ArrayList<PromotionHotelPO> getHotelPromotion(int type);
}