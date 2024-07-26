package com.monocept.decorater.test;

import com.monocept.decorater.model.CarInspection;
import com.monocept.decorater.model.ICarService;
import com.monocept.decorater.model.OilChange;
import com.monocept.decorater.model.WheelAlign;

public class CarInspectionTest {

	public static void main(String[] args) {
		CarInspection carInspection = new CarInspection();
		OilChange carWithOilChange = new OilChange(carInspection);
		WheelAlign carWithWheelAlign = new WheelAlign(carInspection);
		WheelAlign carWithFullService = new WheelAlign(new OilChange(carInspection));

	        System.out.println("Car Inspection Cost: " + carInspection.getCost());
	        System.out.println("Car Inspection with Oil Change Cost: " + carWithOilChange.getCost());
	        System.out.println("Car Inspection with Wheel Alignment Cost: " + carWithWheelAlign.getCost());
	        System.out.println("Car Inspection with Oil Change and Wheel Alignment Cost: " + carWithFullService.getCost());
	    }
	}