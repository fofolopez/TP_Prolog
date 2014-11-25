/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.util.Hashtable;
import jpl.Query;

/**
 *
 * @author adolfo
 */
public class SE {
    
    public void prueba() {
        String t1 = "consult('src/prolog/familia.pl')";
        Query q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "correcto" : "fallo"));
        
        String t2 = "mother(X,Y)";
        Query q2 = new Query(t2);
        System.out.println("La solución para " + t2 +" :");
        Hashtable s;
        while(q2.hasMoreSolutions()){
            s = q2.nextSolution();
            System.out.println("X = " + s.get("X"));
            System.out.println("Y = " + s.get("Y"));
        }
    }
    
}
