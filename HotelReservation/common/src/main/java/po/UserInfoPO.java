package po;

import java.io.Serializable;

import util.UserType;
import util.VipType;

public class UserInfoPO implements Serializable{
	
	private static final long serialVersionUID = -7187002330817151504L;
	/**
	 * 用户ID
	 */
	private String userID;

	/**
	 * 用户姓名
	 */
	private String username;

	/**
	 * 联系方式
	 */
	private ContactPO contact;
	
	/**
	 * 用户类型
	 */
	private UserType type;
	
	/**
	 * 酒店工作人员的隶属酒店ID
	 */
	private String hotel;
	
	/**
	 * 客户信用值
	 */
	private int credit;
	
	/**
	 * 是否会员
	 */
	private boolean isMember;
	
	/**
	 * 会员类型
	 */
	private VipType vipType;
	
	public UserInfoPO() {}

	public UserInfoPO(String userID, String username, ContactPO contact) {
		this.userID = userID;
		this.username = username;
		this.contact = contact;
	}

	public String getUserID() {
		return userID;
	}

	public String getUsername() {
		return username;
	}

	public ContactPO getContact() {
		return contact;
	}
	
	public void setUserid(String userID) {
		this.userID = userID;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setContact(ContactPO contactVO) {
		this.contact = contactVO;
	}
	
	public UserType getType(){
		return type;
	}
	
	public void setType(UserType ty){
		type=ty;
	}
	
	public String getHotel(){
		return hotel;
	}	
	
	public void setHotel(String id){
		hotel = id;
	}
	
	public int getCredit() {
		return credit;
	}

	public boolean getIsMember() {
		return isMember;
	}
	
	public VipType getVipType() {
		return vipType;
	}
	
	
	public void setVipType(VipType vipType) {
		this.vipType = vipType;
	}
	
	public void setIsMember(boolean isMember) {
		this.isMember = isMember;
	}
}