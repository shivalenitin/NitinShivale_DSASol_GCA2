package com.nitin.skyscraper_driver;

import com.nitin.skyscraper_construction.Architect;

public class BuildingDriver {
	/*
	 * Your friend is a chief architect, who is working on building a skyscraper, in Mumbai. The
       construction is in such a way that the floors will be constructed in other factories and they will be
       assembled. All the sizes will be distinct.The skyscraper needs to be constructed in N days with the following conditions :
       a) Every day a floor is constructed in a separate factory of distinct size.
       b) The floor with the larger size must be placed at the bottom of the building.
       c) The floor with the smaller size must be placed at the top of the building.
       Note: A floor cannot be assembled in the building until all floors larger in size are placed.
             As a friend he wants you to build a small program that will help him analyze the construction
             process, to avoid manual work and errors.
	 */

		public static void main(String[] args) {
		Architect  skyscraper = new Architect();
		 skyscraper.acceptUserInputs();
		 skyscraper.orderOfBuildingConstruction( skyscraper.totalNo_FloorSize);
	}

}
