package futebol.br.site.varzea.model.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "tb_cartaodecredito")
public class CartaoDeCredito {
    @GeneratedValue
    @Id
    private Long id;
    private String numeroDoCartao;
    private String titular;
    private Date validade;
    private String codigoDeSegurança;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getCodigoDeSegurança() {
        return codigoDeSegurança;
    }

    public void setCodigoDeSegurança(String codigoDeSegurança) {
        this.codigoDeSegurança = codigoDeSegurança;
    }

    /*Mapeamento Cartao De Credito e Usuario*/

    @ManyToOne
    @JoinColumn (name = "cartao_do_usuario")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
