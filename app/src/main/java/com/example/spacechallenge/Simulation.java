package com.example.spacechallenge;

import java.util.*;
import java.io.File;
class Simulation

{
	public ArrayList<Item> loadItems(File file) throws Exception
	{

		ArrayList<Item> itemlist = new ArrayList<>();
		Scanner src = new Scanner(file);

		while(src.hasNextLine())
		{
			String s = src.nextLine();
			String a[] = s.split("=");
			String name = a[0];
			int weight = Integer.parseInt(a[1]);
			Item item = new Item(name, weight);
			itemlist.add(item);
		}
		System.out.println("Items loaded");
		return itemlist;

	}
	public ArrayList<Rocket> loadU1(ArrayList<Item> itemlist)
	{
		U1 u1 = new U1();
		ArrayList<Rocket> u1Rockets = new ArrayList<>();
		for(int i=0; i<itemlist.size(); i++)
		{
			if(u1.canCarry(itemlist.get(i)))
			{
				//u1 can carry item
				u1.carry(itemlist.get(i));
			}
			else
			{
				
				u1Rockets.add(u1);
				u1 = new U1();
				//add u1 to arraylist
				//create new u1
			}
		}
		System.out.println("U1 rockets loaded");
		return u1Rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> itemlist)
	{
		U2 u2 = new U2();
		ArrayList<Rocket> u2Rockets = new ArrayList<>();
		for(int i=0; i<itemlist.size(); i++)
		{
			if(u2.canCarry(itemlist.get(i)))
			{
				//u2 can carry item
				u2.carry(itemlist.get(i));
			}
			else
			{
				
				u2Rockets.add(u2);
				u2 = new U2();
				//add u1 to arraylist
				//create new u2
			}
		}
		System.out.println("U2 rockets loaded");
		return u2Rockets;
	}

	public double runSimulation(ArrayList<Rocket> rockets)
	{
		double budget =0;
		for(int i=0; i<rockets.size(); i++)
		{
			Rocket r = rockets.get(i);
			
			budget += r.cost;
			while(r.launch() == false)
			{
				System.out.println("Launch failed");

				budget += r.cost;
			}
			System.out.println("Launch successful");
			while(r.land() == false)
			{
				System.out.println("Landing failed");

				budget += r.cost;
			}
			System.out.println("Land successful");

			
		}
		return budget;
	}
}

