package data.promotiondata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.promotiondataservice.PromotionHotelDataService;
import po.PromotionHotelPO;
import util.PromotionHotelType;

public class PromotionHotelDataServiceImpl implements PromotionHotelDataService{

	@Override
	public void insert(PromotionHotelPO Promotion) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PromotionHotelPO Promotion) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PromotionHotelPO Promotion) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PromotionHotelPO findByName(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PromotionHotelPO> show() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PromotionHotelPO> findByType(PromotionHotelType type) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}