package com.hui.wang.state.pattern.v1;

/**
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public class Room {

	/**房间的三种状态，空闲状态*/
	private State freeTimeState;
	/**房间的三种状态，入住状态*/
	private State checkInState;
	/**房间的三种状态，预定状态*/
	private State bookedState;

	private State state;

	public Room() {
		freeTimeState = new FreeTimeState(this);
		checkInState = new CheckInState(this);
		bookedState = new BookedState(this);
		state = freeTimeState;
	}

	/**
	 * 预订房间
	 */
	public void bookRoom(){
		state.bookRoom();
	}

	/**
	 * 退订房间
	 */
	public void unsubscribeRoom(){
		state.unsubscribeRoom();
	}

	/**
	 * 入住
	 */
	public void checkInRoom(){
		state.checkInRoom();
	}

	/**
	 * 退房
	 */
	public void checkOutRoom(){
		state.checkOutRoom();
	}


	public State getFreeTimeState() {
		return freeTimeState;
	}

	public void setFreeTimeState(State freeTimeState) {
		this.freeTimeState = freeTimeState;
	}

	public State getCheckInState() {
		return checkInState;
	}

	public void setCheckInState(State checkInState) {
		this.checkInState = checkInState;
	}

	public State getBookedState() {
		return bookedState;
	}

	public void setBookedState(State bookedState) {
		this.bookedState = bookedState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
