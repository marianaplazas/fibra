package models;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class TrabajdorDTO {
    @NotBlank
    int id;
    @NotBlank
    String nombre;
    @NotBlank
    String apellido;
    @NotBlank
    String cargo;
    @NotBlank
    String direccion;
    @NotBlank
    int telefono;
    int celular;
    String correo;
}
