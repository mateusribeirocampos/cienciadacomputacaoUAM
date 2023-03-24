package Unidade4_ED.Ebook.Genealogia;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate date) {
        dataNascimento = date;
    }
    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        Period period  = Period.between(dataNascimento, hoje);
        return period.getYears();
    }
}
