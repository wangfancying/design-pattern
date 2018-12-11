package com.hui.wang.state.pattern.v1;

/**
 * 房间空闲状态
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public class FreeTimeState implements State{

	private Room hotelManagement;

	public FreeTimeState(Room hotelManagement) {
		this.hotelManagement = hotelManagement;
	}

	@Override
	public void bookRoom() {
		System.out.println("您已经成功预订了...");
		hotelManagement.setState(hotelManagement.getBookedState());
	}

	@Override
	public void unsubscribeRoom() {

	}

	@Override
	public void checkInRoom() {
		System.out.println("您已经成功入住了...");
		hotelManagement.setState(hotelManagement.getCheckInState());
	}

	@Override
	public void checkOutRoom() {

	}
}
