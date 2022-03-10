package Reservas;


import java.time.LocalDate;

public class Hospede {

    private String nome;
    private String CPF;
    LocalDate dataDeNascimento;

    //Criar método para cadastrar hóspede


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
