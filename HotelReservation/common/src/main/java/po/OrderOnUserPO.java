package po;

import java.io.Serializable;

import util.OrderState;
import util.RoomType;
import util.User;

/**
 * �ͻ�����VO
 * 
 * @author txin
 *
 */
public class OrderOnUserPO extends OrderPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ��������
	 */
	public String reason;
	
	/**
	 * ����ִ��ʱ��
	 */
	public String latestExecutionTime;
	
	/**
	 * ��������
	 */
	public RoomType roomType;
	
	/**
	 * ��������
	 */
	public int roomNumber;
	
	/**
	 * ��ס����
	 */
	public int peopleNumber;
	
	/**
	 * �Ƿ�Я����ͯ
	 */
	public boolean hasChild;
	
	public OrderOnUserPO(User initiator,String orderID,OrderState orderState,int price,String latestExecutionTime,
			RoomType roomType,int roomNumber,int peopleNumber,boolean hasChild) {
		this.initiator = initiator;
		this.orderID = orderID;
		this.orderState = orderState;
		this.price = price;
		this.latestExecutionTime = latestExecutionTime;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.peopleNumber = peopleNumber;
		this.hasChild = hasChild;
	}
	
	public OrderOnUserPO(String initiator,OrderState orderState,String reason){
		super();
		this.reason = reason;
	}
	
    public boolean getHasChild() {
        return hasChild;
    }

	public String getReason() {
		return reason;
	}
	
	public String getLatestExecutionTime() {
		return latestExecutionTime;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getPeopleNumber() {
		return peopleNumber;
	}
	
}