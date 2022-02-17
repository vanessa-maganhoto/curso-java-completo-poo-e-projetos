package entidades;

import java.util.Date;
import java.util.Objects;

public class EntradaLogs {

      private String usuario;
      private Date instante;

    public EntradaLogs(String usuario, Date instante) {
        this.usuario = usuario;
        this.instante = instante;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getInstante() {
        return instante;
    }

    public void setInstante(Date instante) {
        this.instante = instante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntradaLogs that = (EntradaLogs) o;
        return usuario.equals(that.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }
}
