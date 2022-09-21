package com.futurasoft.proyecto.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email", unique = true)
    private String emailEmpleado;
    @Column(name = "password")
    private String password;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "empleado")
    @JsonIgnoreProperties("user")
    private Profile profile;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private EnumRoleName rolEmpleado;

    @OneToMany(mappedBy = "empleado")
    private List<Transaction> transactions;
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Column(name = "created_at")
    private LocalDate createdAt;
}