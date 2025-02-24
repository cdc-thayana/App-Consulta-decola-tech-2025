package dio.me.Model;

import java.time.LocalDate;
import jakarta.servlet.http.HttpServletRequest;


public class Noticia {
    private String titulo;
    private String conteudo;
    private LocalDate dataPublicacao;
    private String autor;

    public String getTitulo() { return titulo; }
    public void setTitulo(String value) { this.titulo = value; }

    public String getConteudo() { return conteudo; }
    public void setConteudo(String value) { this.conteudo = value; }

    public LocalDate getDataPublicacao() { return dataPublicacao; }
    public void setDataPublicacao(LocalDate value) { this.dataPublicacao = value; }

    public String getAutor() { return autor; }
    public void setAutor(String value) { this.autor = value; }
}
