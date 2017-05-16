
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class Pelota extends TimerTask implements Constantes{
    public int posX;
    public int posY;
     public Escenario escenario;
    
    public Pelota(int _posX, int _posY, Escenario _escenario){
    
        posX= _posX;
        posY=_posY;
        escenario = _escenario;
        escenario.celdas[posX][posY].tipo='P';
    }
    
    
    
    @Override
    public void run() {
     
        
        escenario.celdas[posX][posY].tipo='V';
        if(posY<=NUMERO_CELDAS_LARGO-1){           
            if(posY==NUMERO_CELDAS_LARGO-1){
                posY=0;
            }
            else {
                posY++;
            }
            if(posX==escenario.jugador.posicionX && posY==escenario.jugador.posicionY){
                //
                
                //JOptionPane.showMessageDialog(null, "Perdiste", "Mensaje", JOptionPane.WARNING_MESSAGE);
                //System.exit(0);
            }
            escenario.celdas[posX][posY].tipo='P';
            escenario.dondeSeDibuja.repaint();
        }
        
        
    }
    
}
