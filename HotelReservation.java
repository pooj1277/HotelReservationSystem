package com.bridgelabz.HotelReservationSystem;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	private ArrayList<Hotel> hotelArrList = new ArrayList<Hotel>();

	public void addToHotelArrayList(Hotel h) {
		hotelArrList.add(h);
	}

	public void printHotelArrList() {
		System.out.println("Updated Hotel array list is : ");
		System.out.println(getHotelArrList());
		System.out.println();
	}

	public List<Hotel> getHotelArrList() {
		return hotelArrList;
	}
}

/*
import java.util.ArrayList;

public class HotelReservation {
	ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	
	public void addHotel(String hotelName, String customerType, String dayType, int rate) {
		hotels.add(new Hotel(hotelName,customerType, dayType,rate));
	}
	
	public void cheapestHotel( String dayType) {
		if(dayType=="Weekday") {
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
		
		HotelReservation Hotels = new HotelReservation();
		Hotels.addHotel("LakeWood","Regular","Weekday",110);
		Hotels.addHotel("LakeWood","Rewards","Weekday",80);
		Hotels.addHotel("LakeWood","Regular","Weekend",90);
		Hotels.addHotel("LakeWood","Rewards","Weekday",80);
		
		Hotels.addHotel("BridgeWood", "Regular","Weekday", 160);
		Hotels.addHotel("BridgeWood", "Rewards","Weekday", 110);
		Hotels.addHotel("BridgeWood", "Regular","Weekend", 60);
		Hotels.addHotel("BridgeWood", "Rewards","Weekend", 50);
		
		Hotels.addHotel("BridgeWood", "Regular","Weekday", 220);
		Hotels.addHotel("BridgeWood", "Rewards","Weekday", 100);
		Hotels.addHotel("BridgeWood", "Regular","Weekend", 150);
		Hotels.addHotel("BridgeWood", "Rewards","Weekend", 40);
	}
}
*/