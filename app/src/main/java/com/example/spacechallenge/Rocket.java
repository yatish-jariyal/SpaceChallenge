package com.example.spacechallenge;

class Rocket implements Spaceship
{
    public double cost;
    public int weight ;
    public int cargoLimit;
    int cargoCarried;
    double coLaunchExplosion;
    double coLandCrash;


    public boolean launch()
    {
        return true;
    }
    public boolean land()
    {
        return true;
    }
    public void carry(Item item)
    {
        cargoCarried += item.weight;
    }
    public boolean canCarry(Item item)
    {
        if(cargoLimit >= cargoCarried+weight+item.weight)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}