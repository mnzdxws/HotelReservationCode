package vo;

import util.Action;

public class CreditVO {

	/**
	 * 时间
	 */
	String time;
	
	/**
	 * 订单ID
	 */
	String orderID;
	
	/**
	 * 执行动作
	 */
	Action action;
	
	/**
	 * 信用值变化
	 * 例：+100；-100；t100；
	 */
	String creditChange;
	
	/**
	 * 信用值结果
	 */
	int creditResult;
	
	public CreditVO(String orderID,String time,Action action,
			String creditChange,int creditResult) {
		this.time = time;
		this.orderID = orderID;
		this.action = action;
		this.creditChange = creditChange;
		this.creditResult = creditResult;
	}
	
	public int getCreditResult() {
		return creditResult;
	}
	
	public void setCreditResult(int creditResult) {
		this.creditResult = creditResult;
	}
	
	public void setAction(Action action) {
		this.action = action;
	}
	
	public void setCreditChange(String creditChange) {
		this.creditChange = creditChange;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
}
