package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizaDados(Endereco dados) {
        if (dados.getLogradouro() != null){
            this.logradouro = dados.getLogradouro();
        }
        if (dados.getBairro() != null){
            this.bairro = dados.getBairro();
        }
        if (dados.getCep() != null){
            this.cep = dados.getCep();
        }
        if (dados.getUf() != null){
            this.uf = dados.getUf();
        }
        if (dados.getCidade() != null){
            this.cidade = dados.getCidade();
        }
        if (dados.getNumero() != null){
            this.numero = dados.getNumero();
        }
        if (dados.getComplemento() != null){
            this.complemento = dados.getComplemento();
        }

    }
}
