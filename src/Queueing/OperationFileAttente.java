/*
 * Copyright (C) 2016 hux
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Queueing;

import java.util.Scanner;

/**
 *
 * @author hux
 */
public class OperationFileAttente {

    private static final String ERREUR_TYPE_FILE_ATTENTE = "Erreur Aucun type de file d'attente valable n'a été choisie";
    private static final String CONSOLE = "Attention un des paramètres rentré n'est pas compatible. "
            + "\n Rappel : "
            + "\n 1 - type de file d'attente avec la notation de kendall"
            + "\n 2 - Nb de serveur"
            + "\n 3 - Nb de Client Maximum dans le système"
            + "\n 4 - Mu : Nombre moyen de service rendu par unité de temps"
            + "\n 5 - Lambda : Nombre moyen d'arrivé de client par unité de temps";

    public static String calcul(int iNbServer, int iNbClient, double dMu, double dLambda, String sTypeFile) {
        
        String retour = "=======================================================\n";

        if (dMu != 0.0 || dLambda != 0.0 || iNbServer != 0 || iNbClient != 0) {
            //afin de récupérer les commandes de l'utilisateur
//            Scanner sc;
//            String input = "";
            switch (sTypeFile) {
                case "MM1K":
                    FileAttenteMM1K fileMM1K = new FileAttenteMM1K(dLambda, dMu, iNbClient, iNbServer);
                    fileMM1K.init();
                    System.out.println("File MM1K : \n " + fileMM1K.toString());
                    retour +=  " File MM1K : \n " + fileMM1K.toString();
//                    sc = new Scanner(System.in);
//                    while (!"q".equals(input)) {
//                        try {
//                            System.out.println("\nVeuillez rentrer le chiffre de l'état pour lequel vous voulez calculer la probabilité :");
//                            input = sc.nextLine();
//                            Integer dJ = Integer.parseInt(input);//on récupère le chiffre
//                            double proba = fileMM1K.calculProbabiliteJ(dJ);
//                            System.out.println("\nLa probabilité de l'état " + dJ + " à l'équilibre est " + proba);
//                        } catch (NumberFormatException e) {
//                            System.out.println("Le chiffre rentré est incorrecte :" + input);
//                        } catch (NullPointerException e) {
//                            System.out.println("Le chiffre rentré est incorrecte :" + input);
//                        }
//                    }
                    break;
                case "MM1":
                    //création de la file d'attente
                    FileAttenteMM1 fileMM1 = new FileAttenteMM1(dLambda, dMu, iNbClient, iNbServer);
                    //initialisation de l'objet
                    fileMM1.init();
                    System.out.println("File MM1 : \n " + fileMM1.toString());
                    retour += "File MM1 : \n " + fileMM1.toString();
//                    //gestion du calcul des probabilités à l'éuquilibre
//                    sc = new Scanner(System.in);//récupération de l'input de l'utilisateur
//                    while (!"q".equals(input)) {
//                        try {
//                            System.out.println("\nVeuillez rentrer le chiffre de l'état pour lequel vous voulez calculer la probabilité :");
//                            input = sc.nextLine();
//                            Integer dJ = Integer.parseInt(input);//on récupère le chiffre
//                            double proba = fileMM1.calculProbabiliteJ(dJ);
//                            System.out.println("\nLa probabilité de l'état " + dJ + " à l'équilibre est " + proba);
//                        } catch (NumberFormatException e) {
//                            System.out.println("Le chiffre rentré est incorrecte :" + input);
//                        } catch (NullPointerException e) {
//                            System.out.println("Le chiffre rentré est incorrecte :" + input);
//                        }
//                    }
                    break;
                case "MMS":
                    FileAttenteMMS fileMMS = new FileAttenteMMS(dLambda, dMu, iNbClient, iNbServer);
                    fileMMS.init();
                    System.out.println("File MM1S : \n " + fileMMS.toString());
                    retour += "File MM1S : \n " + fileMMS.toString();
                    
//                    sc = new Scanner(System.in);
//                    while (!"q".equals(input)) {
//                        try {
//                            System.out.println("\nVeuillez rentrer le chiffre de l'état pour lequel vous voulez calculer la probabilité :");
//                            input = sc.nextLine();
//                            Integer dJ = Integer.parseInt(input);//on récupère le chiffre
//                            double proba = fileMMS.calculProbabiliteJ(dJ);
//                            System.out.println("\nLa probabilité de l'état " + dJ + " à l'équilibre est " + proba);
//                        } catch (NumberFormatException e) {
//                            System.out.println("Le chiffre rentré est incorrecte :" + input);
//                        } catch (NullPointerException e) {
//                            System.out.println("Le chiffre rentré est incorrecte :" + input);
//                        }
//                    }
                    break;
                default:
                    System.out.println(ERREUR_TYPE_FILE_ATTENTE);
                    retour += ERREUR_TYPE_FILE_ATTENTE;
                    break;
            }

        } else {
            System.out.println("Attention un des paramètres parmi Mu, Lambda, le nombre de serveur et le nombre de client n'est pas renseigné !");
            retour += "Attention un des paramètres parmi Mu, Lambda, le nombre de serveur et le nombre de client n'est pas renseigné !";
        }
        return retour;
    }
}
