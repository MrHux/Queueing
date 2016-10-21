/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processstoch;

import static java.time.Clock.system;

/**
 *
 * @author hux
 */
public class FileAttenteMM1 extends FileAttente {

    @Override
    public void init() {

        if (conditions()) {
            calculNombreMoyenClientDansLeSys();
            calculNombreMoyenClientDansLaFile();
            calculDureeMoyenneAttenteDansLeSys();
            calculDureeMoyenneAttenteDansLaFile();
        } else {
            System.out.println("ERROR fonction init");
        }
    }

    @Override
    public boolean conditions() {
        boolean allOk = true;
        if (dRho >= 1) {
            allOk = false;
        }
        return allOk;
    }

    @Override
    public void calculNombreMoyenClientDansLeSys() {
        setdL(dLambda / (dMu() - dLambda()));
    }

    @Override
    public void calculNombreMoyenClientDansLaFile() {
        setdLq(dLambda * dLambda / ((dMu() - dLambda()) * dMu()));
    }

    @Override
    public void calculDureeMoyenneAttenteDansLeSys() {
        setdW(1 / (dMu() - dLambda()));
    }

    @Override
    public void calculDureeMoyenneAttenteDansLaFile() {
        setdWq(dLambda / ((dMu() - dLambda()) * dMu()));
    }

    @Override
    public double calculProbabiliteJ(double dJ) {
        return Math.pow(dRho, dJ) * (1 - dRho);
    }

}
