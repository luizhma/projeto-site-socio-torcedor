package futebol.br.site.varzea.model.bean;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name="tb_usuario")
public class Usuario {
    @GeneratedValue
    @Id
    private Long id;
    private String nome;
    private int idade;
    private String rg;
    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*Relação Usuario Cartão de credito*/

    @OneToMany (mappedBy = "usuario")
    private List<CartaoDeCredito> cartoesDeCredito;

    public List<CartaoDeCredito> getCartaoDeCredito() {
        return cartoesDeCredito;
    }

    public void setCartaoDeCredito(List<CartaoDeCredito> cartaoDeCredito) {
        this.cartoesDeCredito = cartaoDeCredito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getIdade() == usuario.getIdade() && Objects.equals(getId(), usuario.getId()) && Objects.equals(getNome(), usuario.getNome()) && Objects.equals(getRg(), usuario.getRg()) && Objects.equals(getCpf(), usuario.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getIdade(), getRg(), getCpf());
    }
}
