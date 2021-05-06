public class pindala {
	//Karel Nurmetalo
	//5/6/2021
 public static double kuup(String c) {
 float pikkus = Float.parseFloat(c);
 double s = pikkus*pikkus*pikkus;
 return s;
 }
 
 public static double risttahukas(String a, String h, String c) {
 float pikkus = Float.parseFloat(a);
 float laius = Float.parseFloat(c);
 float korgus = Float.parseFloat(h);
 double s = pikkus * laius * korgus;
 return s;
 }
 
 public static double silinder(String a, String h) {
 float alus = Float.parseFloat(a);
 float korgus = Float.parseFloat(h);
 double pi =  Math.PI;
 double ruut = alus * alus;
 double s = pi * ruut * korgus;
 return s;
 }
}