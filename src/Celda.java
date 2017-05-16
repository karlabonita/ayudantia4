
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Celda extends JComponent implements Constantes{
    public int x;
    public int y;
    public char tipo;
    
    //constructor 
    public Celda(int x, int y, char tipo){
        this.x=x;
        this.y=y;
        this.tipo=tipo;
    
    }
    
    public void esPared(){
        tipo='O';
    
    }
    
    public void esFinal(){
        tipo='F';
    
    }
    
    //metodo para dibujar casilla
    @Override
    public void paintComponent(Graphics g){
        switch(tipo){
            case 'J':g.setColor(Color.BLUE);g.fillRect(x,y,PIXEL_CELDA,PIXEL_CELDA);break;
            case 'V':g.setColor(Color.YELLOW);break;
            case 'F':g.drawLine(x, y, PIXEL_CELDA, PIXEL_CELDA); g.drawLine(x+32, y, x, y+32);break;
            case 'O':g.fillOval(x, y, PIXEL_CELDA, PIXEL_CELDA);
            case 'P':g.fillOval(x,y,PIXEL_CELDA,PIXEL_CELDA);
       
        }
        g.drawRect(x, y, PIXEL_CELDA, PIXEL_CELDA);
    
    }
}
