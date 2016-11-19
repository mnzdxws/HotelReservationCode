package bl.hotelbl;

import java.util.ArrayList;

import util.ResultMsg;
import util.RoomMsg;
import util.RoomState;
import vo.RoomInfoVO;

public class RoomAddController {
	public ArrayList<RoomInfoVO> roomList;
	
	public RoomAddController() {
		roomList = new ArrayList<RoomInfoVO>();
	}
	
	/**
	 * ���ӿ��ÿͷ�
	 *
	 */
	public RoomMsg addRoom(RoomInfoVO roomInfoVO){
		return new RoomMsg(roomInfoVO.getState(),roomInfoVO.getType(),roomInfoVO.getNumber(),
				roomInfoVO.getPrice());
	}
	
	/**
	 * ���¿ͷ���Ϣ
	 * 
	 */
    public ResultMsg updateRoom(RoomInfoVO roomInfoVO){
    	if(roomInfoVO.getState()==RoomState.USABLE){
    		return new ResultMsg(true,"���ӳɹ�");
    	}
    	else{
    		return new ResultMsg(false,"����ʧ��");
    	}
    	
    }
	
}