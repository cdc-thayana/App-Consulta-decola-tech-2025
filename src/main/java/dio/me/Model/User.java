package dio.me.Model;

//@Entity(name = "tb_user")
public class User {

   // @Id
    //@GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;
    private String cpf;
    private String nome = "Thayana";
    private String email;
    private String telefone;

    public String getCpf() { return cpf; }
    public void setCpf(String value) { this.cpf = value; }

    public String getNome() { return nome; }
    public void setNome(String value) { this.nome = value; }

    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String value) { this.telefone = value; }
}