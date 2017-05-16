
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Jugador implements Constantes {
    public int posicionX;
    public int posicionY;
    public Escenario escenario;
   
    
    public Jugador(Escenario escenario){
    
        posicionX=0;
        posicionY=0;
        this.escenario=escenario;
       escenario.celdas[posicionX][posicionY].tipo='J';

    
    }
    void moverJugador(KeyEvent evento) {
        switch (evento.getKeyCode()) {
            case KeyEvent.VK_UP:
                moverArriba();
                break;
            case KeyEvent.VK_DOWN:
                moverAbajo();
                break;
            case KeyEvent.VK_LEFT:
                moverIzquierda();
                break;
            case KeyEvent.VK_RIGHT:
                moverDerecha();
                break;
        }
    }
     public boolean puedeMoverse(int posicionX, int posicionY){
       if(posicionX<NUMERO_CELDAS_ANCHO-1 && posicionX>-1 && posicionY<NUMERO_CELDAS_LARGO-1 && posicionY>-1 && escenario.celdas[posicionX][posicionY].tipo!='O'){
           return true;
           
       }    
       return false;
   }
    
    public void moverArriba(){
        if(posicionY>-1 && puedeMoverse (posicionX, posicionY-1 )){
           if(escenario.celdas[posicionX][posicionY-1].tipo=='P'){
               JOptionPane.showMessageDialog(null, "Perdiste", "Mensaje", JOptionPane.WARNING_MESSAGE);
               System.exit(0);
            }

            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[posicionX][--posicionY].tipo='J';
        }
    }
    
    public void moverAbajo(){
        if(posicionY<NUMERO_CELDAS_LARGO && puedeMoverse(posicionX,posicionY +1)){  
            if(escenario.celdas[posicionX][posicionY+1].tipo=='P'){
               JOptionPane.showMessageDialog(null, "Perdiste", "Mensaje", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[posicionX][++posicionY].tipo='J';
    
        }
    }
    
    public void moverIzquierda(){
        if(posicionX>0 && puedeMoverse(posicionX -1,posicionY)){
            if(escenario.celdas[posicionX-1][posicionY].tipo=='P'){
               JOptionPane.showMessageDialog(null, "Perdiste", "Mensaje", JOptionPane.WARNING_MESSAGE);
               System.exit(0);
            }
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[--posicionX][posicionY].tipo='J';
            
        }
    }
    
    public void moverDerecha(){
        if(posicionX< NUMERO_CELDAS_ANCHO && puedeMoverse(posicionX +1,posicionY)){
           if(escenario.celdas[posicionX+1][posicionY].tipo=='P'){
               JOptionPane.showMessageDialog(null, "Perdiste", "Mensaje", JOptionPane.WARNING_MESSAGE);
               System.exit(0);
            }            
            escenario.celdas[posicionX][posicionY].tipo='V';
            escenario.celdas[++posicionX][posicionY].tipo='J';
            
   
        }
    }

    public void reiniciarJgador(){
    
        posicionX=0;
        posicionY=0;
    
    }
    
    
}
