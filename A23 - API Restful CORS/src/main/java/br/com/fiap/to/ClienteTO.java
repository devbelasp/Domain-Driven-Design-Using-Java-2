package br.com.fiap.to;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public class ClienteTO {
    private Long codigo;
    @NotBlank private String nome;
    @NotBlank private String cpf;
    @Email private String email;
    @Past private LocalDate dataDeNascimento;

    public ClienteTO() {
    }

    public ClienteTO(Long codigo, String nome, String cpf, String email, LocalDate dataDeNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
