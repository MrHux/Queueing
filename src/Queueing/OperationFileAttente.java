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

    private static final String ERREUR_TYPE_FILE_ATTENTE = java.util.ResourceBundle.getBundle("Queueing/Windows").getString("ERREUR AUCUN TYPE DE FILE D'ATTENTE VALABLE N'A ÉTÉ CHOISIE");
    private static final String ERREUR_RHO = java.util.ResourceBundle.getBundle("Queueing/Windows").getString("IL FAUT RHO < 1");
    private static final String CONSOLE = "Attention un des paramètres rentré n'est pas compatible. "
            + "\n Rappel : "
            + "\n 1 - type de file d'attente avec la notation de kendall"
            + "\n 2 - Nb de serveur"
            + "\n 3 - Nb de Client Maximum dans le système"
            + "\n 4 - Mu : Nombre moyen de service rendu par unité de temps"
            + "\n 5 - Lambda : Nombre moyen d'arrivé de client par unité de temps";

    public static String calcul(int iNbServer, int iNbClient, double dMu, double dLambda, String sTypeFile, int iEtat, double dT) {

        String retour = "=========================================\n";

        if (dMu != 0.0 || dLambda != 0.0 || (iNbServer != 0 && sTypeFile.equals("MMS")) || iNbClient != 0 || (iNbServer != 0 && (sTypeFile.equals("MM1K")))) {
            //afin de récupérer les commandes de l'utilisateur
//            Scanner sc;
//            String input = "";
            double proba = 0.0;
            try {
                switch (sTypeFile) {
                    case "MM1K":
                        FileAttenteMM1K fileMM1K = new FileAttenteMM1K(dLambda, dMu, iNbClient, iNbServer, dT);
                        fileMM1K.init();
                        retour += " File MM1K : \n " + fileMM1K.toString();
                        //calcul de la proba à l'état iEtat en régime stationnaire
                        proba = fileMM1K.calculProbabiliteJ(iEtat);
                        retour += "\nLa probabilité de l'état " + iEtat + " à l'équilibre est " + proba;
                        proba = fileMM1K.calculProbabiliteTemps(iEtat);
                        retour += "\nLa probabilité qu'à un temps supérieur à " + dT + " on soit dans l'état " + iEtat + " : " + proba;
                        break;
                    case "MM1":
                        //création de la file d'attente
                        FileAttenteMM1 fileMM1 = new FileAttenteMM1(dLambda, dMu, iNbClient, 1, dT);
                        //initialisation de l'objet
                        fileMM1.init();
                        retour += "File MM1 : \n " + fileMM1.toString();
                        //calcul de la proba à l'état iEtat en régime stationnaire
                        proba = fileMM1.calculProbabiliteJ(iEtat);
                        retour += "\nLa probabilité de l'état " + iEtat + " à l'équilibre est " + proba;
                        proba = fileMM1.calculProbabiliteTemps(iEtat);
                        retour += "\nLa probabilité qu'à un temps supérieur à " + dT + " on soit dans l'état " + iEtat + " : " + proba;
                        break;
                    case "MMS":
                        FileAttenteMMS fileMMS = new FileAttenteMMS(dLambda, dMu, 0, iNbServer, dT);
                        fileMMS.init();
                        retour += "File MM1S : \n " + fileMMS.toString();
                        //calcul de la proba à l'état iEtat en régime stationnairetrue
                        proba = fileMMS.calculProbabiliteJ(iEtat);
                        retour += "\nLa probabilité de l'état " + iEtat + " à l'équilibre est " + proba;
                        proba = fileMMS.calculProbabiliteTemps(iEtat);
                        retour += "\nLa probabilité qu'à un temps supérieur à " + dT + " on soit dans l'état " + iEtat + " : " + proba;
                        break;
                    default:
                        System.out.println(ERREUR_TYPE_FILE_ATTENTE);
                        retour += ERREUR_TYPE_FILE_ATTENTE;
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println(ERREUR_RHO);
                retour += ERREUR_RHO;
            }

        } else {
            System.out.println(CONSOLE);
            retour += CONSOLE;
        }
        return retour;
    }
}
