package com.pichangetheworld.pokemonsimulator;

/**
 * Pokemon Type Simulator
 * Author: pchan
 * Date: 04/02/2015
 */
public class TypeEvalHelper {
    static final double MULTIPLIERS[][] = {
//           NOR FGT FLY PSN GRD RCK BUG GST STL FIR WTR GRS ELC PSY ICE DRG DRK
/*NORMAL*/  { 1,  1,  1,  1,  1, .5,  1,  0, .5,  1,  1,  1,  1,  1,  1,  1,  1 },
/*FIGHT*/   { 2,  1, .5, .5,  1,  2, .5,  0,  2,  1,  1,  1,  1, .5,  2,  1,  2 },
/*FLYING*/  { 1,  2,  1,  1,  1, .5,  2,  1, .5,  1,  1,  2, .5,  1,  1,  1,  1 },
/*POISON*/  { 1,  1,  1, .5, .5, .5,  1, .5,  0,  1,  1,  2,  1,  1,  1,  1,  1 },
/*GROUND*/  { 1,  1,  0,  2,  1,  2, .5,  1,  2,  2,  1, .5,  2,  1,  1,  1,  1 },
/*ROCK*/    { 1, .5,  2,  1, .5,  1,  2,  1, .5,  2,  1,  1,  1,  1,  2,  1,  1 },
/*BUG*/     { 1, .5, .5, .5,  1,  1,  1, .5, .5, .5,  1,  2,  1,  2,  1,  1,  2 },
/*GHOST*/   { 0,  1,  1,  1,  1,  1,  1,  2,  1,  1,  1,  1,  1,  2,  1,  1, .5 },
/*STEEL*/   { 1,  1,  1,  1,  1,  2,  1,  1, .5, .5, .5,  1, .5,  1,  2,  1,  1 },
/*FIRE*/    { 1,  1,  1,  1,  1, .5,  2,  1,  2, .5, .5,  2,  1,  1,  2, .5,  1 },
/*WATER*/   { 1,  1,  1,  1,  2,  2,  1,  1,  1,  2, .5, .5,  1,  1,  1, .5,  1 },
/*GRASS*/   { 1,  1, .5, .5,  2,  2, .5,  1, .5, .5,  2, .5,  1,  1,  1, .5,  1 },
/*ELECTRIC*/{ 1,  1,  2,  1,  0,  1,  1,  1,  1,  1,  2, .5, .5,  1,  1, .5,  1 },
/*PSYCHIC*/ { 1,  2,  1,  2,  1,  1,  1,  1, .5,  1,  1,  1,  1, .5,  1,  1,  0 },
/*ICE*/     { 1,  1,  2,  1,  2,  1,  1,  1, .5, .5, .5,  2,  1,  1, .5,  2,  1 },
/*DRAGON*/  { 1,  1,  1,  1,  1,  1,  1,  1, .5,  1,  1,  1,  1,  1,  1,  2,  1 },
/*DARK*/    { 1, .5,  1,  1,  1,  1,  1,  2,  1,  1,  1,  1,  1,  2,  1,  1, .5 }
    };

    public static double getMultiplier(int atkType, int defType1, int defType2) {
        return MULTIPLIERS[atkType][defType1] * MULTIPLIERS[atkType][defType2];
    }
}
