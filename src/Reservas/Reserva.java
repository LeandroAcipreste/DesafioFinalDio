package Reservas;


public class Reserva {

    private Hospede hospede;
    private int quarto;
    private String data;
    protected int numerosDeDias;
    protected double valorDaDiaria;

    //Criar método para consultar quarto disponível
    //Criar método para concultar data disponível
    //Criar método para calcular valor da diária




    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumerosDeDias() {
        return numerosDeDias;
    }

    public void setNumerosDeDias(int numerosDeDias) {
        this.numerosDeDias = numerosDeDias;
    }

    public double getValorDaDiaria() {
        return valorDaDiaria;
    }

    public void setValorDaDiaria(double valorDaDiaria) {
        this.valorDaDiaria = valorDaDiaria;
    }

}
