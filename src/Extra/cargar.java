package Extra;
import javax.swing.JProgressBar;
import Vista.ventanaSplash;
public class cargar extends Thread {
JProgressBar progreso;
public cargar(JProgressBar progreso){
super();
this.progreso = progreso;
}
    @Override
public void run(){
for(int i=1; i<=100;i++){
progreso.setValue(i);
pausa(35);
}
}
    public void pausa(int mlSeg){
        try {
            Thread.sleep(mlSeg);
        } catch (Exception e) {
        }
    }
}
