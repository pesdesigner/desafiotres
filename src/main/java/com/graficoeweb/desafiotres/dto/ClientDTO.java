package com.graficoeweb.desafiotres.dto;

import com.graficoeweb.desafiotres.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;
    @Size(min = 3, max = 80, message = "Nome precisa ter entre 3 e 80 caracteres")
    @NotBlank(message = "Nome é obrigatório!")
    private String name;
    @Size(min = 11, max = 11, message="CPF composto por 11 caracteres (Somente números)")
    @NotBlank(message = "CPF é obrigatório")
    private String cpf;
    @Positive(message = "A renda deve ser a partir de um valor positivo")
    private Double income;
    @PastOrPresent(message = "Data de nascimento: não pode ser data futura")
    private LocalDate birthDate;
    @PositiveOrZero(message = "Mencionar pelo menos um filho ou 0 para nenhum")
    private Integer children;

    public ClientDTO (){
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity){
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCPF();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
