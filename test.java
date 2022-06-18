import java.text.SimpleDateFormat
import java.util.Date;
class test{
    public static void main(String[] args) throws ParseException {
      produit p = new produit();
      System.out.println(p);
      produit p1 = new produit(1021,lait,delice );
      produit p2 = new produit(2510, "Yaourt" , "Vitalait" );
      
      System.out.println(p1);
      System.out.println(--------------------------------------); 
      System.out.println(p2);
      produit p3 = new produit(3250, "Tomate", "Sicam" , 1.200 );
     // System.out.println(p3);
     p3.afficher();
     p1.prix=0.7;
     System.out.println(p1);
     p2.prix=0.5;
     System.out.println(p2);
   SimpleDateFormat sdf = new    SimpleDateFormat("dd-MM-yyyy");
   Date d= sdf.parse("14-20-2020");
   produit p4=new produit("3250" , "Tomate" , "sicam ",  1200 , d);
   p4.afficher();
    } 
}