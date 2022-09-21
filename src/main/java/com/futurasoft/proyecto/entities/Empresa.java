package com.futurasoft.proyecto.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "enterprise")
@Getter
@Setter
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String nombre;
    @Column(unique = true)
    private String nit;
    private String telefono;
    private String direccion;
    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;
    @OneToMany(mappedBy = "empresa")
    private List<Transaction> transactions;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "updated_at")
    private LocalDate updatedAt;
}
