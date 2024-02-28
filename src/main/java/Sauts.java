        
/**
* Indiquer le ou les numeros de TP et d'exercice.
*
* @author (votre nom)
*/
import java.util.Scanner;
        
public class Sauts
{
    /** Retourne une valeur entière saisie au clavier comprise entre 
    deux valeurs
    * @param pfMin IN la valeur minimale
    * @param pfMax IN la valeur maximale
    * @return valeur entière comprise entre pfMin et pfMax (inclus)
    */
    public static int saisieIntMinMax(int pfMin, int pfMax){
            int saisie;
            Scanner clavier = new Scanner(System.in) ;
        
            System.out.println("Donnez une valeur comprise entre " + pfMin + " et " + pfMax + " :") ;
            saisie = clavier.nextInt() ;
            while (saisie < pfMin || saisie > pfMax){
                System.out.println("Donnez une valeur comprise entre " + pfMin + " et " + pfMax + " :") ;
                saisie = clavier.nextInt() ;
            }
            return saisie;
    }
        
            
    /** Retourne une valeur entière saisie au clavier au moins égale à pfMin
    * @param pfMin IN la valeur minimale
    * @return valeur entière au moins égale à pfMin
    */
    public static int saisieIntMin(int pfMin){
            int saisie ;
            Scanner clavier = new Scanner(System.in) ;
            System.out.println("Donnez une valeur au moins égale à " + pfMin + " :") ;
                saisie = clavier.nextInt() ;
            while (saisie < pfMin){
                System.out.println("Donnez une valeur au moins égale à " + pfMin + " :") ;
                saisie = clavier.nextInt() ;
            }
            return saisie ;
    }
        
        
    /** Retourne une valeur réelle saisie au clavier au moins egale à pfMin
    * @param pfMin IN la valeur minimale
    * @return valeur réelle au moins égale à pfMin
    */
    public static double saisieDoubleMin(double pfMin){
            double saisie ;
            Scanner clavier = new Scanner(System.in) ;
            System.out.println("Donnez une valeur au moins égale à " + pfMin + " :") ;
                saisie = clavier.nextDouble() ;
            while (saisie < pfMin){
                System.out.println("Donnez une valeur au moins égale à " + pfMin + " :") ;
                saisie = clavier.nextDouble() ;
            }
            return saisie ;
    }
        
            
    /** Saisit nbSaisies réels positifs ou nuls au clavier et les stocke dans le tableau tab
    * @param pfNbSaisies IN nombre de réels à saisir
    * @param pfTab OUT le tableau où stocker les saisies
    */
    public static void saisieTabD (int pfNbSaisies, double pfTab[]) {
            int i ;
            Scanner clavier = new Scanner(System.in) ;
            for (i = 0 ; i < pfNbSaisies ; i++) {
                System.out.println("Valeur n°" + (i+1) + " :");
                pfTab[i] = saisieDoubleMin(0);
            }
    }       
        
            
    /** Calcule et retourne la moyenne des sauts
    * @param pfNbSauts IN le nombre de sauts
    * @param pfTab INle tableau contenant les valeurs de chaque saut
    * prec : .............
    * @return la moyenne des sauts
    */
    public static double moyenneSauts(int pfNbSauts, double pfTab[]) {
            
                double somme = 0;
                double moyenne = 0;
                
                for (int i = 0; i < pfNbSauts; i++)
                {
            
                    somme += pfTab[i];
                
                }
            
                if (pfNbSauts != 0)
                {
            
                    moyenne = somme / pfNbSauts;
                
                }
            
                return moyenne;
    }
    
    public static double meilleurSaut (int nbtab, double tab[]) {
        
        double sautmax = tab[0];
    
        for (int i = 0; i < nbtab; i++) {
        
            if (tab[i] > sautmax){
            
                sautmax = tab[i];
            
            }
        
        }
        
        return sautmax;
    
    }
    
    public static double pireSaut (int nbtab, double tab[]) {
        
        double sautmin = tab[0];
    
        for (int i = 0; i < nbtab; i++) {
        
            if (tab[i] < sautmin){
            
                sautmin = tab[i];
            
            }
        
        }
        
        return sautmin;
    
    }
        
    /** Programme principal : 
    *  - saisit tous les sauts
    *  - calcule et affiche la moyenne des sauts
    *  - calcule et affiche le meilleur saut
    *  - calcule et affiche le pire saut
    */
        public static void main(String [] args) {
        
        int nbsauts;
        double tabsauts[];
        tabsauts = new double [15];
        /* --- Saisie des sauts --- */
        nbsauts = saisieIntMinMax(0, 15);
        saisieTabD(nbsauts, tabsauts);
        
        /* --- Moyenne des sauts --- */
        System.out.println("La moyenne des Sauts : " + moyenneSauts(nbsauts, tabsauts));

        /* --- Meilleur saut --- */
        System.out.println("La meilleur Saut : " + meilleurSaut(nbsauts, tabsauts));

        /* --- Pire saut --- */
        System.out.println("La pire Saut : " + pireSaut(nbsauts, tabsauts));

    }

}

