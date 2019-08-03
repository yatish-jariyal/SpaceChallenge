package com.example.spacechallenge;

import java.util.*;
import java.io.File;
class Main
{
	public static void main(String args[]) throws Exception
	{

		File filephase1 = new File("C:\\Users\\Yatish\\AndroidStudioProjects\\SpaceChallenge\\app\\src\\main\\java\\com\\example\\spacechallenge\\Phase1.txt");
		File filephase2 = new File("C:\\Users\\Yatish\\AndroidStudioProjects\\SpaceChallenge\\app\\src\\main\\java\\com\\example\\spacechallenge\\Phase2.txt");

		Simulation sim = new Simulation();
		ArrayList<Item> loaded1 = sim.loadItems(filephase1);
		ArrayList<Item> loaded2 = sim.loadItems(filephase2);

		//simulation for u1 phase 1.
		ArrayList<Rocket> u1rocketsp1 = sim.loadU1(loaded1);
		double budgetu1p1 = sim.runSimulation(u1rocketsp1);
		System.out.println("Total budget for U1 Phase 1" + billion(budgetu1p1));

				//simulation for u1 phase 2.
		ArrayList<Rocket> u1rocketsp2 = sim.loadU1(loaded2);
		double budgetu1p2 = sim.runSimulation(u1rocketsp2);
		System.out.println("Total budget for U1 Phase 2" + billion(budgetu1p2));

		//simulation for u2 phase 1.
		ArrayList<Rocket> u2rocketsp1 = sim.loadU2(loaded1);
		double budgetu2p1 = sim.runSimulation(u2rocketsp1);
		System.out.println("Total budget for U2 Phase 1" + billion(budgetu2p1));

				//simulation for u2 phase 2.
		ArrayList<Rocket> u2rocketsp2 = sim.loadU2(loaded2);
		double budgetu2p2 = sim.runSimulation(u2rocketsp2);
		System.out.println("Total budget for U2 Phase 2" + billion(budgetu2p2));
	}
	public static String billion(double budget)
	{
		// 120,000,000
		String billion = ""+(budget/Math.pow(10,9)) +" Billions";
		return billion;
	}
}