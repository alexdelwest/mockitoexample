package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;

class SomeDataServicesStub implements SomeDataService{
	@Override
	public int[] reatribeAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
}
class SomeDataServicesEntyStub implements SomeDataService{
	@Override
	public int[] reatribeAllData() {
		// TODO Auto-generated method stub
		return new int[] {0};
	}
}
class SomeDataServicesOneElementStub implements SomeDataService{
	@Override
	public int[] reatribeAllData() {
		// TODO Auto-generated method stub
		return new int[] {5};
	}
}

public class SomeBusinessStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDateService(new SomeDataServicesStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSumUsingDataService_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDateService(new SomeDataServicesEntyStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSumUsingDataService_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDateService(new SomeDataServicesOneElementStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

}
