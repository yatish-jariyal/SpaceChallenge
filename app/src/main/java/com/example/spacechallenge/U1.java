package com.example.spacechallenge;

import java.util.*;
import java.lang.Math;
class U1 extends Rocket
{
	U1()
	{
		this.cost = 100*Math.pow(10,6);
		this.weight = 10000;
		this.cargoLimit = 18000;
		this.cargoCarried = 0;
	}

	public boolean launch()
	{
		coLaunchExplosion = 0.05 * cargoCarried/cargoLimit; // between 0 and 1 -> .random() -> number from 0 to 10.4
		//random number -> Math
		System.out.println("chance of launch explosion = "+coLaunchExplosion);

		double random = Math.random();
		System.out.println("random = "+random);
		if(coLaunchExplosion > random)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean land()
	{
		coLandCrash = 0.01 * cargoCarried/cargoLimit;
		double random = Math.random();
		System.out.println("chance of land crash = "+coLandCrash);
		System.out.println("random = "+random);

		if(coLandCrash > random)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}