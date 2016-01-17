package com.jamp.memorymanagement.autopark;

import java.util.ArrayList;
import java.util.List;

import com.jamp.memorymanagement.Car;
import com.jamp.memorymanagement.Driver;

public class AutoParkExamples {

	public static List<Driver>	drivers	= new ArrayList<Driver>();

	public static void main(String[] args) {

		for (int i = 0;; i++) {
			Driver driver = new Driver("Car " + i, new Car());
			drivers.add(driver);

			System.out.println(driver.toString() + " " + i);
		}
	}

}
