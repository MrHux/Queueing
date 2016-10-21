/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processstoch;

/**
 *
 * @author hux
 */
public class FileAttenteMM1K extends FileAttente{

    public FileAttenteMM1K() {
        dLambda = 0.0;
        dMu = 0.0;
        iNbClient = 0;
        iNbServer = 0;
    }
    
    public FileAttenteMM1K(double dLambda , double dMu, int iNbClient, int iNbServer){
        this.dLambda = dLambda;
        this.dMu = dMu;
        this.iNbClient = iNbClient;
        this.iNbServer = iNbServer;
    }
    
    @Override
    public void init(){
        dRho = getdRho();
        dL = getdL();
        dLq = getdLq();

    }

    @Override
    public double calculProbabiliteJ(double dJ) {
        if(dRho == 1){
            return 1/(1+ (double)iNbClient);
        } else {
            return (((1-dRho)*Math.pow(dRho, dJ))/((1-Math.pow(dRho, dJ))));
        }
    }
    
    @Override
    public void calculDureeMoyenneAttenteDansLaFile() {
        setdLq(dL-(1-calculProbabiliteJ(0)));
    }

    @Override
    public void calculDureeMoyenneAttenteDansLeSys() {
        if(dRho == 1){
            setdL(iNbClient/2);
        } else {
            setdL((dRho*(1-(iNbClient+1)*Math.pow(dRho, iNbClient) + iNbClient*Math.pow(dRho, iNbClient+1)))/((1-dRho)*(1-Math.pow(dRho, iNbClient+1))));
        }
    }

    
}
