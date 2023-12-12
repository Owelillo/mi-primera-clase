public class Yunque {

    private String tipo;
    private int peso;
    private boolean oxidacion;
    private boolean buenEstado;
    private double pureza;

    public Yunque (String tipoYunque, int pesoYunque){
        tipo = tipoYunque;
        peso = pesoYunque;
        oxidacion = true;  
        buenEstado = true;
        pureza = 1.0;
    }

    public String getTipo(){
        return tipo;
    }

    public int getPeso(){
        return peso;
    }

    public boolean getOxidacion(){
        return oxidacion;
    }

    public void setTipo(String tipoYunque){
        this.tipo = tipoYunque;
    }

    public void setPeso(int pesoYunque){
        this.peso = this.peso + pesoYunque;
    }

    public void oxidar(){
        oxidacion = !oxidacion;
    }
     
    public void imprimirDetalles(){
        System.out.println("Tipo: " + tipo + "peso: " + peso + "oxidacion: " + oxidacion + "pureza: " + pureza);
    }
    public String estadoYunque(){
        return "tipo: " + tipo + "peso: " + peso + "oxidación: " + oxidacion + "pureza: " + pureza;
    }
    public boolean getEstado(){
        return buenEstado;
    }
    public void setEstado(boolean nuevoEstado){
        this.buenEstado = nuevoEstado;
    
    }
    public double getPureza(){
        return pureza;
    }
    public void setPureza(double nuevaPureza){
        this.pureza = nuevaPureza;
    }
    
}