package com.fjavmv.cpestados.cpestados.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter @Setter @ToString
public class CodigoPostal {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "d_codigo")
    private String d_codigo;

    @Column(name = "d_asenta")
    private String d_asenta;

    @Column(name = "d_tipo_asenta")
    private String d_tipo_asenta;

    @Column(name = "d_mnpio")
    private String d_mnpio;

    @Column(name = "d_estado")
    private String d_estado;

    @Column(name = "d_ciudad")
    private String d_ciudad;

    @Column(name = "d_CP")
    private String d_CP;

    @Column(name = "c_estado")
    private String c_estado;

    @Column(name = "c_oficina")
    private String c_oficina;

    @Column(name = "c_CP")
    private String c_CP;

    @Column(name = "c_tipo_asenta")
    private String c_tipo_asenta;

    @Column(name = "c_mnpio")
    private String c_mnpio;

    @Column(name = "id_asenta_cpcons")
    private String id_asenta_cpcons;

    @Column(name = "d_zona")
    private String d_zona;

    @Column(name = "c_cve_ciudad")
    private String c_cve_ciudad;

}



