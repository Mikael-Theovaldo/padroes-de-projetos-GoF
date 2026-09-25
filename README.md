# Padrões de Projetos GoF (Gang of Four)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Design Patterns](https://img.shields.io/badge/Design_Patterns-GoF-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow?style=for-the-badge)

<img width="1000" height="600" alt="image" src="https://github.com/user-attachments/assets/c25ce21e-8eff-479c-a5e7-50b10c504da2" />
> Repositório dedicado ao estudo e implementação dos **Padrões de Projeto (Design Patterns)** definidos pela **Gang of Four (GoF)**, utilizando a linguagem **Java**.

---

## Sobre o Projeto

Os **Padrões de Projeto GoF** são soluções reutilizáveis para problemas comuns no desenvolvimento de software orientado a objetos. Foram catalogados por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides — conhecidos como *Gang of Four* — no livro clássico **"Design Patterns: Elements of Reusable Object-Oriented Software"**.

Este repositório tem como objetivo **demonstrar na prática** a aplicação desses padrões, organizando exemplos claros e funcionais em Java.

---

## Estrutura do Repositório

```text
📦 padroes-de-projetos-GoF
 └── 📁 src
     └── 📁 dio
         └── 📁 java
             └── 📁 gof
                 ├── 📁 singleton
                 ├── 📁 strategy
                 └── 📁 facade
                 └── 📁 sub_sistemas    
                     
```

O projeto está organizado em pacotes separados por padrão, facilitando o estudo individual de cada um.

---

## Padrões Implementados

| Padrão | Categoria | Status |
|--------|-----------|--------|
| **Singleton** | Criacional | ✅ Implementado |
| **Strategy** | Comportamental | ✅ Implementado |
| **Facade** | Estrutural | ✅ Implementado |

>  Novos padrões serão adicionados gradualmente conforme o avanço dos estudos.

---

## Sobre os Padrões

### Singleton (Criacional)

Garante que uma classe tenha **apenas uma instância** e fornece um ponto global de acesso a ela.

- **Objetivo:** controlar a criação de objetos únicos (ex.: conexões, configurações, logs).
- **Exemplo prático:** uma classe `Configuracao` que mantém as configurações globais da aplicação.

---

### Strategy (Comportamental)

Define uma **família de algoritmos**, encapsula cada um e os torna **intercambiáveis** em tempo de execução.

- **Objetivo:** permitir que o algoritmo varie independentemente do cliente que o utiliza.
- **Exemplo prático:** diferentes estratégias de cálculo de frete, impostos ou ordenação, selecionáveis dinamicamente.

---

### Facade (Estrutural)

Fornece uma **interface simplificada** para um conjunto complexo de classes, bibliotecas ou subsistemas.

- **Objetivo:** esconder a complexidade e reduzir o acoplamento entre cliente e subsistemas.
- **Exemplo prático:**

```text
Cliente → Facade → Sub_sistema_A
                 → Sub_sistema_B
                 → Sub_sistema_C
```

O cliente interage apenas com a **Facade**, que internamente coordena as chamadas aos subsistemas.

---

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/Mikael-Theovaldo/padroes-de-projetos-GoF.git
   ```

2. Importe o projeto em sua IDE Java preferida (IntelliJ, Eclipse, VS Code).

3. Navegue até o pacote do padrão desejado (`singleton`, `strategy` ou `facade`) e execute a classe principal.

---

## 📚 Referências

- 📘 *Design Patterns: Elements of Reusable Object-Oriented Software* — Gamma, Helm, Johnson & Vlissides
- 🌐 [Refactoring Guru — Design Patterns](https://refactoring.guru/design-patterns)
- 🎓 [DIO — Digital Innovation One](https://www.dio.me/)

---

## 👨‍💻 Autor

**Mikael Theovaldo**

[![GitHub](https://img.shields.io/badge/GitHub-Mikael--Theovaldo-181717?style=flat&logo=github)](https://github.com/Mikael-Theovaldo)

---

## 📝 Licença

Este projeto é de uso **educacional**, destinado ao estudo de padrões de projeto. Sinta-se livre para estudar, clonar e contribuir.

---

<p align="center">
  ⭐ Se este repositório te ajudou, deixe uma estrela! ⭐
</p>
