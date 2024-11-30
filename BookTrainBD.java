/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soa.jaxrslabs.booktrain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmed
 */
    public class BookTrainBD { 
        private static List<Train> trains = new ArrayList<Train>();  
        static { 

            trains.add(new Train("TR123", "Sfax", "Tunis", 1250)); 

            trains.add(new Train("TR127", "Sfax", "Tunis", 1420)); 

            trains.add(new Train("TR129", "Sfax", "Sousse", 1710)); 

        } 
        public static List<Train> getTrains() { 
            return trains; 
        } 

    } 
