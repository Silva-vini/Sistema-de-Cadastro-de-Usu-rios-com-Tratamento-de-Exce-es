# Sistema de Cadastro de Usuários com Tratamento de Exceções

Programa em Java que simula o cadastro de usuários, validando a idade mínima através de uma exception personalizada.

## Funcionalidades

- Leitura de nome e idade via `Scanner`
- Validação de idade mínima (18 anos)
- Exception customizada `IdadeInvalidaException`
- Tratamento com `try/catch/finally`

## Estrutura

- `CadastroUsuario.java` — classe principal, contém o método `main` e `cadastrarUsuario`
- `IdadeInvalidaException.java` — exception personalizada, herda de `Exception`

## Como funciona

1. O usuário informa nome e idade.
2. Se a idade for menor que 18, o método `cadastrarUsuario` lança `IdadeInvalidaException`.
3. O `catch` captura a exception e exibe a mensagem de erro.
4. Se a idade for válida, exibe mensagem de cadastro realizado com sucesso.
5. O bloco `finally` sempre exibe: `Processo de cadastro finalizado.`

## Como executar

```bash
javac CadastroUsuario.java IdadeInvalidaException.java
java CadastroUsuario
```
