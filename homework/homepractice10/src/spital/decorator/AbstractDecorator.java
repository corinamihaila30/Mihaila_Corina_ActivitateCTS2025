package spital.decorator;

 abstract class AbstractDecorator implements IRezultat {

     public IRezultat r;

     public AbstractDecorator(Rezultat r) {
         this.r = r;
     }
 }
