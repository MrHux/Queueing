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
public abstract class FileAttente {
    protected double dLambda;
    protected double dMu;
    protected int iNbServer;
    protected int iNbClient;
    protected double dRho;
    protected double dL;
    protected double dLq;
    protected double dW;
    protected double dWq;

    public FileAttente() {
    }
    
    public void init(){
    }

    public double dLambda() {
        return dLambda;
    }

    public double dMu() {
        return dMu;
    }

    public int getiNbClient() {
        return iNbClient;
    }

    public int getiNbServer() {
        return iNbServer;
    }

    public void setdLambda(double dLambda) {
        this.dLambda = dLambda;
    }

    public void setdMu(double dMu) {
        this.dMu = dMu;
    }

    public void setiNbClient(int iNbClient) {
        this.iNbClient = iNbClient;
    }

    public void setiNbServer(int iNbServer) {
        this.iNbServer = iNbServer;
    }

    public void setdL(double dL) {
        this.dL = dL;
    }

    public void setdLq(double dLq) {
        this.dLq = dLq;
    }

    public void setdRho(double dRho) {
        this.dRho = dRho;
    }

    public void setdW(double dW) {
        this.dW = dW;
    }

    public void setdWq(double dWq) {
        this.dWq = dWq;
    }

    public double getdLambda() {
        return dLambda;
    }

    public double getdMu() {
        return dMu;
    }
    
    public double getdRho(){
        
        return dMu/dLambda;
    }
    
    public double calculProbabiliteJ(double dJ){
        return 0;
    }

    public double getdL() {
        return dL;
    }

    public double getdLq() {
        return dLq;
    }

    public double getdW() {
        return dW;
    }

    public double getdWq() {
        return dWq;
    }
    
    public boolean conditions() {
        return false;
    }

    public void calculNombreMoyenClientDansLeSys() {
        
    }

    public void calculNombreMoyenClientDansLaFile() {
        
    }

    public void calculDureeMoyenneAttenteDansLeSys() {
        setdWq(dLq / dLambda);
    }

    public void calculDureeMoyenneAttenteDansLaFile() {
        setdW(dWq + (1/dMu));
    }

    
    
}
