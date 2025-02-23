# App-Consulta-decola-tech-2025
Novo app API REST DIO

classDiagram


    class Conta {
        +String login
        +String senha
    }
    class Titular {
        +String cpf
        +String nome
        +String email
        +String telefone
    }
    class Curso {
        +String codigoCurso
        +String nomeCurso
        +String descricao
        +List<String> funcionalidades
    }
    Conta --> Titular : possui
    Titular --> Curso : cadastrado em

