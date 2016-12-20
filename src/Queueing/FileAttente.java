/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queueing;

import MathsFunctions.Factorielle;

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
    protected double dT;

    /**
     *
     */
    public FileAttente() {
        dLambda = 0.0;
        dMu = 0.0;
        iNbClient = 0;
        iNbServer = 0;
        dT = 0;
    }

    /**
     *
     * @param dLambda
     * @param dMu
     * @param iNbClient
     * @param iNbServer
     * @param dT
     */
    public FileAttente(double dLambda, double dMu, int iNbClient, int iNbServer, double dT) {
        this.dLambda = dLambda;
        this.dMu = dMu;
        this.iNbClient = iNbClient;
        this.iNbServer = iNbServer;
        this.dT = dT;
    }

    /**
     *
     */
    public void init() {
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
    public void calculdRho() throws ArithmeticException {
        if (dLambda < dMu) {
            setdRho(dLambda / dMu);
        } else {
            throw new ArithmeticException();
        }
    }

    /**
     *
     * @param dJ
     * @return
     */
    public double calculProbabiliteJ(int dJ) {
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
        setdW(dWq + (1 / dMu));
    }

    /**
     *
     */
    public void calculDureeMoyenneAttenteDansLaFile() {
        setdWq(dLq / dLambda);
    }

    public double calculProbabiliteTemps(int iEtat) {

        return Math.exp(dT * dLambda * (-1) * (Math.pow((dT * dLambda), iEtat) / (Factorielle.Factoriel(iEtat))));

    }

    @Override
    public String toString() {
        return " NbClient : " + iNbClient
                + "\t"
                + "  NbServeur : " + iNbServer
                + "\n"
                + "  Lambda : " + dLambda
                + "\t"
                + "  Mu : " + dMu
                + "\n"
                + "  Rho : " + dRho
                + "\n"
                + "  L : " + dL
                + "\t\t"
                + "  Lq : " + dLq
                + "\n"
                + "  W : " + dW
                + "\t\t"
                + "  Wq : " + dWq;
    }

}
