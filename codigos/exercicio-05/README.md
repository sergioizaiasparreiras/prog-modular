## Exercício 5 - Descriptografia de String

### Descrição
Expansão do exercício 4, adicionando a funcionalidade de reverter o processo de criptografia para obter a mensagem original.

### Funcionalidades
- **Criptografar**: Mesmo processo do exercício 4
- **Descriptografar**: Reverte o processo de criptografia

### Como Funciona a Descriptografia
1. Organiza o texto criptografado em matriz preenchendo por colunas
2. Lê a matriz por linhas
3. Remove os caracteres de preenchimento 'X' do final

### Como Executar
1. Compile o arquivo `App.java`
2. Execute o programa
3. Escolha entre criptografar ou descriptografar
4. Digite o texto conforme a opção escolhida

### Exemplo de Uso
```
MENU:
1. Criptografar texto
2. Descriptografar texto

Opção 1:
Texto: "JAVA E BOM"
Resultado: "JMVAUTIOBMOX"

Opção 2:
Texto criptografado: "JMVAUTIOBMOX"
Resultado: "JAVAEBOM"
```
