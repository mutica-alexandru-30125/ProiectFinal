package com.benialex.proiectfinal;

import java.util.Random;
public class Vietate {

        public Vietate(){}

        public Random rand = new Random();
        public int nrPicioare(){
            return rand.nextInt(5);
        }
    }

