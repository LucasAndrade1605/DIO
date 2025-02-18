# DIO - Decola Tech 2025
Como atividade do Módulo 02, foi proposto o desenvolvimento de uma API Restful.
Este projeto apresenta a construção de uma API para gerenciamento de uma biblioteca, permitindo o cadastro, consulta e manutenção de livros e autores.

## Diagrama de Classes
```mermaid
classDiagram
    class Livro {
        +Long id
        +String titulo
        +String genero
        +String isbn
        +Date dataPublicacao
        +Boolean disponivel
        +Autor autor
    }

    class Autor {
        +Long id
        +String nome
        +List<Livro> livros
    }

    Livro --> Autor
    Autor --> Livro
