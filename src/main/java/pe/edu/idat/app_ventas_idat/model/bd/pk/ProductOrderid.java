package pe.edu.idat.app_ventas_idat.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ProductOrderid implements Serializable {
    private Integer orderaid;
    private Integer productid;
}
