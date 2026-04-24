package br.com.fiap3ESS.checkpoint2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome do cliente é obrigatorio")
    @Column(nullable = false)
    private String ClienteNome;

    @Column(Nullable = false)
    private LocalDate datapedido;

    @PositiveOrZero(message = "Valor não pode ser negativo")
    @Column(nullable = false)
    private Double valorTotal;

    PrePersist
