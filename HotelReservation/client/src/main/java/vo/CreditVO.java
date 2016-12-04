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
	 */
	String creditChange;
	
	/**
	 * 信用值结果
	 */
	int creditResult;
	
	public CreditVO(String time,String orderID,Action action,
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
	
}
