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


}
