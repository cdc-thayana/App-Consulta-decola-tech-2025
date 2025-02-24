package dio.me.Model;

import jakarta.persistence.*;

import javax.swing.*;

@Entity
@Table(name = "tb_user") // Define o nome da tabela no banco
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String cpf;
 private String nome = "Thayana"; // Nome padrão definido
 private String email;
 private String telefone;
 private String accountNumber;

 // Construtor padrão
 public User() {
 }

 // Getters e Setters
 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getCpf() {
  return cpf;
 }

 public void setCpf(String cpf) {
  this.cpf = cpf;
 }

 public String getNome() {
  return nome;  // Retorna o valor do campo 'nome'
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getTelefone() {
  return telefone;
 }

 public void setTelefone(String telefone) {
  this.telefone = telefone;
 }

 public String getAccountNumber() {
  return accountNumber;
 }

 public void setAccountNumber(String accountNumber) {
  this.accountNumber = accountNumber;
 }

 public SpinnerNumberModel getAccount() {
  return null;
 }
}
