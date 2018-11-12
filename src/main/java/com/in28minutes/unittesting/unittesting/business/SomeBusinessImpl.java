package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

private	SomeDataService someDateService;


	
	public void setSomeDateService(SomeDataService someDateService) {
	this.someDateService = someDateService;
    }

	public int calculateSum(int[] data) {
		int sum = 0;
		for(int value:data) {
			sum +=value;
		}
		return sum;
	}
	
	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDateService.reatribeAllData();
		for(int value:data) {
			sum +=value;
		}
		return sum;
	}
	
}
