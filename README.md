# 🚀 Triangulação Espacial - InterFatecs 2025(Problema E)

Este projeto resolve o desafio de algoritmo "Problema E - Triangulo". Mais do que apenas encontrar a solução matemática, o objetivo principal deste repositório é servir como um laboratório prático para a aplicação dos princípios de **Clean Architecture** e **SOLID** em Java, estruturando uma solução simples com padrões de sistemas escalonáveis. 

O design da arquitetura e as discussões de implementação foram desenvolvidos com o auxílio de Inteligência Artificial.

---

## 📋 Sobre o Problema

Durante uma expedição científica em um exoplaneta, sondas automatizadas estão triangulando posições com base em sinais de rádio. O sistema recebe apenas dois lados de um triângulo ($a$ e $b$) e o ângulo entre eles ($\theta$), medido em graus. 

A missão é calcular a **área** deste triângulo utilizando ponto flutuante de dupla precisão e reportar o resultado com exatamente quatro casas decimais. A fórmula matemática aplicada no núcleo do domínio é:
$$Area = \frac{1}{2} \cdot a \cdot b \cdot \sin(\theta)$$

### Entrada e Saída
*   **Entrada:** Várias linhas contendo três números reais ($a$, $b$ e $\theta$). O programa encerra a leitura ao receber a entrada `0 0 0`.
*   **Saída:** A área calculada impressa com precisão de 4 casas decimais.

**Exemplo:**
> **Entrada:**
> 
> 3.00 4.00 90.00
> 
> 5.00 7.00 60.00
> 
> 0 0 0
>
> **Saída**
> 
> 6.0000
> 
> 15.1554

---

## 🏗️ Arquitetura e Padrões Aplicados

Para fins de estudo, a solução de um único arquivo foi refatorada e dividida em camadas rigorosas, isolando a regra de negócio dos detalhes de infraestrutura (como a leitura do teclado e a impressão na tela).



O projeto está estruturado nos seguintes pacotes:

1.  **`domain` (Entidades):** O coração da aplicação. Contém apenas os dados estruturais do triângulo, sem dependências externas.
2.  **`usecase` (Casos de Uso):** Contém a regra de negócio da aplicação (o cálculo da área e a conversão de graus para radianos), orquestrando as entidades.
3.  **`adapters` (Adaptadores de Interface):** O Controlador que gerencia o fluxo de dados entre o mundo exterior e os Casos de Uso. Define as interfaces (contratos) de entrada e saída.
4.  **`infrastructure` (Infraestrutura):** A implementação concreta das interfaces, lidando com detalhes do Java como o `Scanner` para leitura e `System.out.printf` para formatação.

### Princípios SOLID Destacados
*   **S - Single Responsibility Principle (SRP):** Cada classe possui uma única razão para mudar. Classes de leitura apenas leem, classes de cálculo apenas calculam.
*   **O - Open/Closed Principle (OCP):** O sistema permite novas formas de entrada ou saída (como ler de um arquivo ou expor em uma API) criando novas classes na infraestrutura, sem alterar o caso de uso ou o controlador.
*   **D - Dependency Inversion Principle (DIP):** O controlador e as regras de negócio dependem apenas de abstrações (Interfaces), não de implementações concretas da infraestrutura. A classe `Main` atua como **Composition Root**, injetando as dependências necessárias.

---
