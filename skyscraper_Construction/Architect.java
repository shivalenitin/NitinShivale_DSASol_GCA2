package com.nitin.skyscraper_construction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Architect {
	public Integer totalNo_Floors;
	public Integer[] totalNo_FloorSize;
	private Scanner sc;

	public void acceptUserInputs() {
		System.out.println("Enter the total number of floors in the building:: ");
		sc = new Scanner(System.in);
		totalNo_Floors = sc.nextInt();
		totalNo_FloorSize = new Integer[totalNo_Floors];

		for (int i = 1; i <= totalNo_Floors; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			totalNo_FloorSize[i - 1] = sc.nextInt();
		}
	}

	public void orderOfBuildingConstruction(Integer[] totalNo_FloorSize) {
		System.out.println("The order of the construction is as follows:");

		int j = 0;
		Integer[] totalNo_FloorSizeSorted = totalNo_FloorSize.clone();
		Arrays.sort(totalNo_FloorSizeSorted, Collections.reverseOrder());

		Stack<Integer> StackOfBuilding = new Stack<Integer>();
		

		for (int i = 0; i < totalNo_FloorSize.length; i++) {
			
			if (totalNo_FloorSize[i] == totalNo_FloorSizeSorted[j]) {
				if (i == totalNo_FloorSize.length - 1)
					j = i;
				else
					j = i + 1;

				System.out.println("Day: " + (i + 1));
				

				if (StackOfBuilding != null) {
					System.out.print(totalNo_FloorSize[i] + " ");
					while (!StackOfBuilding.isEmpty()) {
						int val = StackOfBuilding.pop();
						if (val >= totalNo_FloorSizeSorted[j]) {
							System.out.print(val + " ");
						} else {
							StackOfBuilding.push(val);
							j -= StackOfBuilding.size();
							break;
						}
					}
					System.out.println("");
				} else {
					System.out.println(totalNo_FloorSize[i]);
				}
			} else
			
			{
				System.out.println("Day:" + (i + 1));
				StackOfBuilding.push(totalNo_FloorSize[i]);
			}
		}
	}

}
