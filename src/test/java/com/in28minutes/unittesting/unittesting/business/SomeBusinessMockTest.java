package com.in28minutes.unittesting.unittesting.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
	
	@InjectMocks
	SomeBusinessImpl business ;

	@Mock
	SomeDataService dataServiceMock;


	@Before
	public void before() {
		business.setSomeDateService(dataServiceMock);
	}
	
	@Test
	public void calculateSumUsingDataService_basic() {
		when(dataServiceMock.reatribeAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, business.calculateSumUsingDataService());
	}
	
	@Test
	public void calculateSumUsingDataService_empty() {
		when(dataServiceMock.reatribeAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingDataService());
	}
	
	@Test
	public void calculateSumUsingDataService_oneValue() {
		when(dataServiceMock.reatribeAllData()).thenReturn(new int[] {5});
		assertEquals(5, business.calculateSumUsingDataService());
	}

}
