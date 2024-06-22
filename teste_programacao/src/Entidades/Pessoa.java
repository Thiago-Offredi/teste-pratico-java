package Entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    
    public String nome;
    public LocalDate dataNascimento;

    
    public Pessoa() {
        
        this.nome = "";
        this.dataNascimento = LocalDate.now();
    }

    
    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String formatDate() {
        return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    } 
}
