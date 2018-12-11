package com.hui.wang.state.pattern.v1;

/**
 * 房间入住状态
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public class CheckInState implements State{

	private Room hotelManagement;

	public CheckInState(Room hotelManagement) {
		this.hotelManagement = hotelManagement;
	}

	@Override
	public void bookRoom() {
		System.out.println("该房间已经入住了...");
	}

	@Override
	public void unsubscribeRoom() {
		System.out.println("该房间已经入住了...");
	}

	@Override
	public void checkInRoom() {

	}

	@Override
	public void checkOutRoom() {
		System.out.println("退房成功....");
		hotelManagement.setState(hotelManagement.getFreeTimeState());
	}
}
