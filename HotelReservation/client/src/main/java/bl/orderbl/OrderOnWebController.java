package bl.orderbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import blservice.orderblservice.OrderOnWebBLService;
import dataservice.creditdataservice.CreditDataService;
import dataservice.orderdataservice.OrderDataService;
import net.RMIManage;
import util.DataServiceType;
import util.ResultMsg;
import vo.OrderVO;

public class OrderOnWebController implements OrderOnWebBLService{

	private OrderOnWeb orderOnWeb;
	private OrderDataService orderOnWebDataService;
	private CreditDataService creditDataService;
	
	public OrderOnWebController() {
		orderOnWebDataService = (OrderDataService)RMIManage.
				getDataService(DataServiceType.OrderDataService);
		creditDataService = (CreditDataService)RMIManage.
				getDataService(DataServiceType.CreditDataService);
		orderOnWeb = new OrderOnWeb(orderOnWebDataService,creditDataService);
	}

	@Override
	public ArrayList<OrderVO> abnormalOrderScan() {
		try {
			return orderOnWeb.abnormalOrderScan();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OrderVO abnormalOrderDetail(String ID) {
		try {
			return orderOnWeb.abnormalOrderDetail(ID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public ArrayList<OrderVO> dayUnexOrder(String today) {
		try {
			return orderOnWeb.dayUnexOrder(today);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResultMsg abnormalOrderCancel(String ID, boolean b) {
		try {
			return orderOnWeb.abnormalOrderCancel(ID, b);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
