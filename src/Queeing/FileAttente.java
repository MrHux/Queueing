/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queeing;

/**
 *
 * @author hux
 */
public abstract class FileAttente {
    
    
    /**
     * 
     */
    protected double dLambda;
    /**
     * 
     */
    protected double dMu;
    /**
     * 
     */
    protected int iNbServer;
    /**
     * 
     */
    protected int iNbClient;
    /**
     * 
     */
    protected double dRho;
    /**
     * 
     */
    protected double dL;
    /**
     * 
     */
    protected double dLq;
    /**
     * 
     */
    protected double dW;
    /**
     * 
     */
    protected double dWq;
    
    

     /**
     *
     */
    public FileAttente() {
        dLambda = 0.0;
        dMu = 0.0;
        iNbClient = 0;
        iNbServer = 0;
    }
    
    /**
     *
     * @param dLambda
     * @param dMu
     * @param iNbClient
     * @param iNbServer
     */
    public FileAttente(double dLambda , double dMu, int iNbClient, int iNbServer){
        this.dLambda = dLambda;
        this.dMu = dMu;
        this.iNbClient = iNbClient;
        this.iNbServer = iNbServer;
    }
    
    
    /**
     *
     */
    public void init(){
    }

    /**
     *
     * @return
     */
    public double dLambda() {
        return dLambda;
    }

    /**
     *
     * @return
     */
    public double dMu() {
        return dMu;
    }

    /**
     *
     * @return
     */
    public int getiNbClient() {
        return iNbClient;
    }

    /**
     *
     * @return
     */
    public int getiNbServer() {
        return iNbServer;
    }

    /**
     *
     * @param dLambda
     */
    public void setdLambda(double dLambda) {
        this.dLambda = dLambda;
    }

    /**
     *
     * @param dMu
     */
    public void setdMu(double dMu) {
        this.dMu = dMu;
    }

    /**
     *
     * @param iNbClient
     */
    public void setiNbClient(int iNbClient) {
        this.iNbClient = iNbClient;
    }

    /**
     *
     * @param iNbServer
     */
    public void setiNbServer(int iNbServer) {
        this.iNbServer = iNbServer;
    }

    /**
     *
     * @param dL
     */
    public void setdL(double dL) {
        this.dL = dL;
    }

    /**
     *
     * @param dLq
     */
    public void setdLq(double dLq) {
        this.dLq = dLq;
    }

    /**
     *
     * @param dRho
     */
    public void setdRho(double dRho) {
        this.dRho = dRho;
    }

    /**
     *
     * @param dW
     */
    public void setdW(double dW) {
        this.dW = dW;
    }

    /**
     *
     * @param dWq
     */
    public void setdWq(double dWq) {
        this.dWq = dWq;
    }

    /**
     *
     * @return
     */
    public double getdLambda() {
        return dLambda;
    }

    /**
     *
     * @return
     */
    public double getdMu() {
        return dMu;
    }

    /**
     *
     * @return
     */
    public double getdRho() {
        return dRho;
    }
    
    
    /**
     *
     * @return
     */
    public void calculdRho(){
        
        setdRho(dLambda/dMu);
    }
    
    /**
     *
     * @param dJ
     * @return
     */
    public double calculProbabiliteJ(int dJ){
        return 0;
    }

    /**
     *
     * @return
     */
    public double getdL() {
        return dL;
    }

    /**
     *
     * @return
     */
    public double getdLq() {
        return dLq;
    }

    /**
     *
     * @return
     */
    public double getdW() {
        return dW;
    }

    /**
     *
     * @return
     */
    public double getdWq() {
        return dWq;
    }
    
    /**
     *
     * @return
     */
    public boolean conditions() {
        return false;
    }

    /**
     *
     */
    public void calculNombreMoyenClientDansLeSys() {
        setdL(dLambda * dW);
    }

    /**
     *
     */
    public void calculNombreMoyenClientDansLaFile() {
        setdLq(dWq * dLambda);
    }

    /**
     *
     */
    public void calculDureeMoyenneAttenteDansLeSys() {
        setdW(dWq + (1/dMu));
    }

    /**
     *
     */
    public void calculDureeMoyenneAttenteDansLaFile() {
        setdWq(dLq / dLambda);
    }

    @Override
    public String toString() {
        return "Lambda : "+dLambda+"\t Mu : "+dMu+"\n Rho : "+dRho+"\n L : "+dL+"\t Lq : "+dLq+"\n W : "+dW+"\t Wq : "+dWq;
    }

    
    
}
