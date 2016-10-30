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

    public static String calcul(int iNbServer, int iNbClient, double dMu, double dLambda, String sTypeFile, int iEtat) {

        String retour = "=========================================\n";

        if (dMu != 0.0 || dLambda != 0.0 || iNbServer != 0 || iNbClient != 0) {
            //afin de récupérer les commandes de l'utilisateur
//            Scanner sc;
//            String input = "";
            double proba = 0.0;
            switch (sTypeFile) {
                case "MM1K":
                    FileAttenteMM1K fileMM1K = new FileAttenteMM1K(dLambda, dMu, iNbClient, iNbServer);
                    fileMM1K.init();
                    retour += " File MM1K : \n " + fileMM1K.toString();
                    //calcul de la proba à l'état iEtat en régime stationnaire
                    proba = fileMM1K.calculProbabiliteJ(iEtat);
                    retour += "\nLa probabilité de l'état " + iEtat + " à l'équilibre est " + proba;
                    break;
                case "MM1":
                    //création de la file d'attente
                    FileAttenteMM1 fileMM1 = new FileAttenteMM1(dLambda, dMu, iNbClient, iNbServer);
                    //initialisation de l'objet
                    fileMM1.init();
                    retour += "File MM1 : \n " + fileMM1.toString();
                    //calcul de la proba à l'état iEtat en régime stationnaire
                    proba = fileMM1.calculProbabiliteJ(iEtat);
                    retour += "\nLa probabilité de l'état " + iEtat + " à l'équilibre est " + proba;
                    break;
                case "MMS":
                    FileAttenteMMS fileMMS = new FileAttenteMMS(dLambda, dMu, iNbClient, iNbServer);
                    fileMMS.init();
                    retour += "File MM1S : \n " + fileMMS.toString();
                    //calcul de la proba à l'état iEtat en régime stationnaire
                    proba = fileMMS.calculProbabiliteJ(iEtat);
                    retour += "\nLa probabilité de l'état " + iEtat + " à l'équilibre est " + proba;
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
