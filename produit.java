
import java.util.Date
public class produit {
    int id;
    String libélle ,marque;
    double prix;
    Date date;
    public String toString(){
        return "id:+"id
        +"\libelle:"+libelle
        +"\nmarque:"+marque
        +"\n prix:"+prix
        +"\n date exp:"+date;
    }
public produit(int id,String libelle,String marque) {

    this.id=id;
    this.libelle=libelle;
    this. marque= marque;
}
public produit() {}
public produit(int id,String libelle,String marque,double prix) {

    this.id=id;
    this.libelle=libelle;
    this. marque= marque;
    this. prix= prix;

}
public void afficher(toString()){
    System.out.println(tostring());
    /*System.out.println("id:+"id
    +"\libelle:"+libelle
    +"\nmarque:"+marque
    +"\n prix:"+prix
    );*/

} 
}