# 🚀 Aprendizados sobre Collections Framework em Java

Olá! 👋 Neste repositório, compartilho um pouco do que aprendi durante minha aula sobre o **Collections Framework** em Java. Foi um conteúdo bastante enriquecedor, e resolvi registrar aqui as principais ideias e conceitos que explorei.

## ☕ Collections Framework

Aprendi que o **Collections Framework** é um conjunto de interfaces e classes que facilitam o trabalho com grupos de dados em Java. Ele oferece estruturas de dados prontas e eficientes para lidar com listas, conjuntos e mapas — tudo com muita flexibilidade e performance.

## 📋 List

A **List** é uma coleção ordenada que aceita elementos duplicados. Nela, cada elemento tem um índice, então eu posso acessar qualquer item diretamente.

### O que aprendi:
- As principais implementações são `ArrayList`, `LinkedList` e `Vector`.
- É possível adicionar, remover e acessar elementos por posição.
- Ideal quando a ordem dos elementos importa ou quando preciso de acesso rápido via índice.

```java
List<String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("Maria");
nomes.add("João"); // duplicado permitido
```

## 🟢 Set

Um **Set** representa uma coleção que **não permite elementos duplicados** e que geralmente **não mantém a ordem de inserção** (exceto em implementações específicas).

### O que aprendi:
- As principais implementações são `HashSet`, `LinkedHashSet` e `TreeSet`.
- `HashSet` é rápido, mas não garante ordem.
- `LinkedHashSet` mantém a ordem de inserção.
- `TreeSet` mantém os elementos ordenados de forma natural (ou por um Comparator).

```java
Set<String> frutas = new HashSet<>();
frutas.add("Maçã");
frutas.add("Banana");
frutas.add("Maçã"); // será ignorado
```

## 🗺️ Map

O **Map** armazena pares **chave-valor**, onde cada chave é única, e cada uma aponta para um valor.

### O que aprendi:
- As implementações mais comuns são `HashMap`, `LinkedHashMap` e `TreeMap`.
- `HashMap` é a mais usada e não garante ordem.
- `LinkedHashMap` mantém a ordem de inserção.
- `TreeMap` ordena as chaves de forma natural ou por Comparator.

```java
Map<String, Integer> idade = new HashMap<>();
idade.put("Ana", 25);
idade.put("Carlos", 30);
idade.put("Ana", 26); // sobrescreve o valor anterior
```

---

Foi um conteúdo essencial pra escrever códigos mais organizados e eficientes. Neste repositório, deixo alguns exemplos práticos do que aprendi!

