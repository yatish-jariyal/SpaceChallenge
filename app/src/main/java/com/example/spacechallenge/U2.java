package com.example.spacechallenge;

import java.util.*;
import java.lang.Math;
class U2 extends Rocket
{
U2()
	{
		this.cost = 120*Math.pow(10,6);
		this.weight = 18000;
		this.cargoLimit = 29000;
		this.cargoCarried = 0;
	}

	public boolean launch()
	{
		coLaunchExplosion = 0.04 * cargoCarried/cargoLimit;
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
		coLandCrash = 0.08 * cargoCarried/cargoLimit;
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