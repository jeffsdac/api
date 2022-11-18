package med.voll.api.paciente;

import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import med.voll.api.endereco.Endereco;


public class Paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    @Embedded
    private Endereco endereco;



}
