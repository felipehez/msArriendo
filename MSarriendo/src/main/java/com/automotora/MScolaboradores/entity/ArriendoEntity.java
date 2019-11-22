package com.automotora.MScolaboradores.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@Document(collection = "Arriendos ")
//@Document(collection = "MicroAutomotora")
public class ArriendoEntity {

    private static final long serialVersionUID = -1L;

    @Id
    @NotNull
    private String idArriendo;
    private String fechaInicio;
    private String patenteAuto;
    private String rutCliente;
    private String rutColaborador;
    private int cantDias;
/*
    @Id
    @NotNull
    private String id;
    private String rut;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private LocalDate fechaNacimiento;
    private String tipo;
*/

}
