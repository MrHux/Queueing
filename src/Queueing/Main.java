/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queueing;

import java.util.Scanner;

/**
 *
 * @author hux
 */
public class Main {

    /**
     * Erreur
     */
    private static String ERREUR_TYPE_FILE_ATTENTE = "Erreur Aucun type de file d'attente valable n'a été choisie";

    /**
     * Note : 1 - Processus d'arrivée 2 - Processus de service 3 - Nombre de
     * serveur dans le système 4 - Borne supérieur du nombre de client dans le
     * système 5 - Nombre de client potentiels 6 - Règle de passage
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dMu = 0.0;
        double dLambda = 0.0;
        int iNbServer = 0;
        int iNbClient = 0;

        try {
            iNbServer = Integer.parseInt(args[1]);
            //pour indiquer un nombre de client infini le paramètre doit être -1
            iNbClient = Integer.parseInt(args[2]);
            dMu = Double.parseDouble(args[3]);
            dLambda = Double.parseDouble(args[4]);
        } catch (NumberFormatException e) {
            System.out.println("Attention un des paramètres rentré n'est pas compatible. "
                    + "\n Rappel : "
                    + "\n 1 - type de file d'attente avec la notation de kendall"
                    + "\n 2 - Nb de serveur"
                    + "\n 3 - Nb de Client Maximum dans le système"
                    + "\n 4 - Mu : Nombre moyen de service rendu par unité de temps"
                    + "\n 5 - Lambda : Nombre moyen d'arrivé de client par unité de temps");
            dMu = 0.0;
            dLambda = 0.0;
            iNbServer = 0;
            iNbClient = 0;
        } catch (NullPointerException e) {
            System.out.println("Attention un des paramètres rentré n'est pas compatible. "
                    + "\n Rappel : "
                    + "\n 1 - type de file d'attente avec la notation de kendall"
                    + "\n 2 - Nb de serveur"
                    + "\n 3 - Nb de Client Maximum dans le système"
                    + "\n 4 - Mu : Nombre moyen de service rendu par unité de temps"
                    + "\n 5 - Lambda : Nombre moyen d'arrivé de client par unité de temps");
            dMu = 0.0;
            dLambda = 0.0;
            iNbServer = 0;
            iNbClient = 0;
        }

        if (dMu != 0.0 || dLambda != 0.0 || iNbServer != 0 || iNbClient != 0) {
            //afin de récupérer les commandes de l'utilisateur
            Scanner sc;
            String input = "";
            switch (args[0]) {
                case "MM1":
                    //création de la file d'attente
                    FileAttenteMM1 fileMM1 = new FileAttenteMM1(dLambda, dMu, iNbClient, iNbServer);
                    //initialisation de l'objet
                    fileMM1.init();
                    System.out.println("File MM1 : \n " + fileMM1.toString());
                    
                    //gestion du calcul des probabilités à l'éuquilibre
                    sc = new Scanner(System.in);//récupération de l'input de l'utilisateur
                    while (!"q".equals(input)) {
                        try {
                            System.out.println("\nVeuillez rentrer le chiffre de l'état pour lequel vous voulez calculer la probabilité :");
                            input = sc.nextLine();
                            Integer dJ = Integer.parseInt(input);//on récupère le chiffre
                            double proba = fileMM1.calculProbabiliteJ(dJ);
                            System.out.println("\nLa probabilité de l'état " + dJ + " à l'équilibre est " + proba);
                        } catch (NumberFormatException e) {
                            System.out.println("Le chiffre rentré est incorrecte :" + input);
                        } catch (NullPointerException e){
                            System.out.println("Le chiffre rentré est incorrecte :" + input);
                        }
                    }
                    break;
                case "MM1K":
                    FileAttenteMM1K fileMM1K = new FileAttenteMM1K(dLambda, dMu, iNbClient, iNbServer);
                    fileMM1K.init();
                    System.out.println("File MM1 : \n " + fileMM1K.toString());
                    sc = new Scanner(System.in);
                    while (!"q".equals(input)) {
                        try {
                            System.out.println("\nVeuillez rentrer le chiffre de l'état pour lequel vous voulez calculer la probabilité :");
                            input = sc.nextLine();
                            Integer dJ = Integer.parseInt(input);//on récupère le chiffre
                            double proba = fileMM1K.calculProbabiliteJ(dJ);
                            System.out.println("\nLa probabilité de l'état " + dJ + " à l'équilibre est " + proba);
                        } catch (NumberFormatException e) {
                            System.out.println("Le chiffre rentré est incorrecte :" + input);
                        } catch (NullPointerException e){
                            System.out.println("Le chiffre rentré est incorrecte :" + input);
                        }
                    }
                    break;
                case "MMS":
                    FileAttenteMMS fileMMS = new FileAttenteMMS(dLambda, dMu, iNbClient, iNbServer);
                    fileMMS.init();
                    System.out.println("File MM1 : \n " + fileMMS.toString());
                    sc = new Scanner(System.in);
                    while (!"q".equals(input)) {
                        try {
                            System.out.println("\nVeuillez rentrer le chiffre de l'état pour lequel vous voulez calculer la probabilité :");
                            input = sc.nextLine();
                            Integer dJ = Integer.parseInt(input);//on récupère le chiffre
                            double proba = fileMMS.calculProbabiliteJ(dJ);
                            System.out.println("\nLa probabilité de l'état " + dJ + " à l'équilibre est " + proba);
                        } catch (NumberFormatException e) {
                            System.out.println("Le chiffre rentré est incorrecte :" + input);
                        } catch (NullPointerException e){
                            System.out.println("Le chiffre rentré est incorrecte :" + input);
                        }
                    }
                    break;
                default:
                    System.out.println(ERREUR_TYPE_FILE_ATTENTE);
                    break;
            }

        } else {
            System.out.println("Attention un des paramètres parmi Mu, Lambda, le nombre de serveur et le nombre de client n'est pas renseigné !");
        }
    }

}
