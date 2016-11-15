package vo;

import businesslogic.util.RoomType;

public class HotelConditionVO{
        
    private String  address;
		
	private String  businessDistrict;
		
	private String hotelName;
		
	private RoomType roomtype;
		
	int upLevel;
		
	int downLevel;
		
	int[] checkInTime;
		
	int[] checkOutTime;
		
	int star;
		
	int[] mark;

    public HotelConditionVO(String add,String bus,String hot,RoomType roo,int up,int down,int[] checkIn,int[] checkOut,int sta,int[] mark){
	    this.address=add;
		this.businessDistrict=bus;
		this.hotelName=hot;
		this.roomtype=roo;
		this.upLevel=up;
		this.downLevel=down;
		this.checkInTime=checkIn;
		this.checkOutTime=checkOut;
		this.star=sta;
		this.mark=mark;
	}

    public String getAdderss(){
		return address;	
	}

    public String getBusinessDistrict(){
	    return businessDistrict;
	}	
	
    public String getHotelName(){
	    return hotelName;
	}		
		
	public RoomType getRoomeType(){
	    return roomtype;
	}
		
	public int getUpLevel(){
	    return upLevel;
	}
		
	public int getDownLevel(){
	    return downLevel;
	}
		
	public int[] getCheckInTime(){
	    return checkInTime;
	}
		
	public int[] getCheckOutTime(){
	    return checkOutTime;
	}
		
	public int getStar(){
	    return star;
	}
		
	public int[] getMark(){
		return mark;
	}		
		
}