/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class CavalloInGara implements Runnable{
    Cavallo cavallo;
    GaraPodistica campo;
    int velocità;
    Thread t;
    int conta;
    int posizione;
    
    public CavalloInGara(cavallo c,cavallo g){
        cavallo=c;
        campo=g;
        conta=0;
        velocità=0;
        t=new Thread(this);
        t.start();
        posizione=0;
    }
    
    public void run(){
        int dimPista=960;
        int dimImmagine]=79;
        while((cavallo.getCordx()+ dimImmagine)<dimPista)
            if((conta% 10)==0)
                velocità=(int)(MathRandom()*4+1);
              cavallo.getCordx()(cavallo.getCordx()+velocità);
                        conta++;
          Thread.sleep(5000);
          campo.repaint();
          
          posizione=campo.getPosizione();
          campo.controllaArrivi();
    }
    
}
