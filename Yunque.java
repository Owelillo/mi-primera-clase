public class Yunque {

    private String tipo;

    private int peso;

    private boolean oxidacion;

    public Yunque (String tipoYunque, int pesoYunque){
        tipo = tipoYunque;
        peso = pesoYunque;
        oxidacion = true;  
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
}