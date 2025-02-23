# App-Consulta-decola-tech-2025
Novo app API REST DIO

Diagrama de classe
```mermaid

    class Conta {
        -String login
        -String senha
    }
    
    class Usuario {
        -String cpf
        -String nome
        -String email
        -String telefone
    }
    
    class Curso {
        -String codigoCurso
        -String nomeCurso
        -String descricao
        -List<String> funcionalidades
    }
    
    class Noticia {
        -String titulo
        -String conteudo
        -String dataPublicacao
        -String autor
    }
    
    Conta "1" -- "1" Usuario : pertence a
    Usuario "1" -- "*" Curso : pode se inscrever
    Curso "1" -- "*" Noticia : pode ter

```
