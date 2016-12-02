package vo;

import java.util.ArrayList;

import bl.hotelbl.Date;
import util.RoomState;
import util.RoomType;

/**
 * 房间信息
 * @author 曹畅
 *
 */
public class RoomInfoVO {

	/**
	 * 房间状态
	 */
	private RoomState state;
	
	/**
	 * 房间号
	 */
	private String roomID;

	/**
	 * 房间类型
	 */
	private RoomType type;
	
	/**
	 * 价格
	 */
	private int price;
	
	/**
	 * 房间已经被预定的时间
	 */
	private ArrayList<Date> OrderedTime;

	public RoomInfoVO(RoomState state, RoomType type, String roomID, int price ) {
		this.state = state;
		this.type = type;
		this.roomID= roomID;
		this.price= price;
		OrderedTime=new ArrayList<Date>();
	}

	public RoomState getState() {
		return state;
	}

	public RoomType getType() {
		return type;
	}
	
	public String getNumber() {
		return roomID;
	}
	
	public int getPrice() {
		return price;
	}
	
	public  ArrayList<Date> getOrderedTime(){
		return OrderedTime;
	}
	
	/**
	 * 增加房间预定时间
	 * @param date
	 * @return
	 */
	public boolean addOrderedTime(Date date){
		for(Date time:OrderedTime){
			if(time.isConflict(date)){
				return false;
			}
		}
		OrderedTime.add(date);
		return true;
	}
	
	/**
	 * 移除一个预定时间
	 * @param date
	 * @return
	 */
	public boolean RemoveOrderedTime(Date date){
		int i=OrderedTime.indexOf(date);
		if(i==-1){
			return false;
		}
		OrderedTime.remove(i);
		return true;
	}

}	