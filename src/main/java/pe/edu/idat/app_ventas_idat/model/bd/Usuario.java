package pe.edu.idat.app_ventas_idat.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    private String nomusaurio;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private Boolean activo;
    @ManyToMany(cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol",
    joinColumns = @JoinColumn(name = "idusaurio"),
    inverseJoinColumns = @JoinColumn(name = "idrol"))
    private Set<Rol> roles;
}
