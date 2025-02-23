package dio.me.Model;

public class Curso {
    private String codigoCurso;
    private String nomeCurso;
    private String descricao;
    private String[] funcionalidades;

    public String getCodigoCurso() { return codigoCurso; }
    public void setCodigoCurso(String value) { this.codigoCurso = value; }

    public String getNomeCurso() { return nomeCurso; }
    public void setNomeCurso(String value) { this.nomeCurso = value; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String value) { this.descricao = value; }

    public String[] getFuncionalidades() { return funcionalidades; }
    public void setFuncionalidades(String[] value) { this.funcionalidades = value; }
}
