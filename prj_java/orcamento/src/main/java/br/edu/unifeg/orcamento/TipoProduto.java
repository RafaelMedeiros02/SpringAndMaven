package.br.edu.br.unifeg.orcamento;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class TipoProduto {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String codigo;
  private String tipoProduto;

  public Long getId() {
    return this.id;
  }

  public String getCodigo() {
      return this.codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public String getTipoProduto() {
    return this.tipoProduto;
  }
  public void setTipoProduto(String tipoProduto) {
    this.tipoProduto = tipoProduto;
  }


}
