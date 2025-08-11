## Exercício 7 - Leitura de Arquivos

### Descrição
Refatoração dos exercícios 4, 5 e 6 para ler os dados de entrada a partir de arquivos-texto, onde a primeira linha indica a quantidade de execuções.

### Funcionalidades
1. **Criptografia de arquivo**: Processa múltiplos textos para criptografia
2. **Descriptografia de arquivo**: Processa múltiplos textos criptografados
3. **Validação de datas**: Valida múltiplas datas de um arquivo

### Formato dos Arquivos
```
N
entrada1
entrada2
...
entradaN
```

### Como Executar
1. Compile o arquivo `App.java`
2. Execute o programa
3. Escolha a opção desejada no menu
4. O programa criará arquivos de exemplo automaticamente se não existirem
5. Veja os resultados na tela e nos arquivos de saída

### Arquivos Utilizados
**Entrada:**
- `entrada_criptografia.txt`: Textos para criptografar
- `entrada_descriptografia.txt`: Textos para descriptografar
- `entrada_datas.txt`: Datas para validar

**Saída:**
- `saida_criptografia.txt`: Resultados da criptografia
- `saida_descriptografia.txt`: Resultados da descriptografia
- `saida_validacao_datas.txt`: Resultados da validação

### Exemplo de Arquivo de Entrada (Criptografia)
```
3
PROGRAMACAO MODULAR
JAVA E MUITO BOM
CRIPTOGRAFIA
```

### Exemplo de Arquivo de Saída (Criptografia)
```
3
PAMCAORRMOLUAAAGRX
JMVAUTIOBMOX
CAXRXXITPOGRAFIA
```
