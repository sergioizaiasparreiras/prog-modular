## Exercício 6 - Validação de Data

### Descrição
Um programa que verifica se uma data no formato `DD/MM/AAAA` é válida, informando o erro específico (dia, mês ou ano) caso não seja.

### Validações Realizadas
- **Formato**: Deve ser exatamente DD/MM/AAAA
- **Ano**: Entre 1 e 9999
- **Mês**: Entre 1 e 12
- **Dia**: Válido para o mês e ano específicos
- **Anos bissextos**: Considera corretamente fevereiro com 29 dias

### Como Executar
1. Compile o arquivo `App.java`
2. Execute o programa
3. Digite uma data no formato DD/MM/AAAA
4. Veja o resultado da validação

### Funcionalidades Extras
- Testes automáticos com várias datas
- Demonstração de anos bissextos
- Explicação detalhada dos erros

### Exemplo de Uso
```
Data: 29/02/2024
Resultado: VÁLIDA - Data 29/02/2024 está correta

Data: 29/02/2023
Resultado: INVÁLIDA - Dia 29 não existe no mês 2/2023

Data: 31/04/2023
Resultado: INVÁLIDA - Dia 31 não existe no mês 4/2023

Data: 15/13/2023
Resultado: INVÁLIDA - Mês deve estar entre 1 e 12
```
