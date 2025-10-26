# 🧮 Estruturas de Dados em Java – Listas Encadeadas

## 📚 Sobre o Projeto
Este repositório contém a implementação manual das três principais **estruturas de listas encadeadas** em Java:  
- Lista Encadeada Simples  
- Lista Duplamente Encadeada  
- Lista Encadeada Circular  

O projeto foi desenvolvido com base nas orientações do **Trabalho de Composição da 2ª Nota – Estrutura de Dados (Centro Universitário Santo Agostinho)**, com o objetivo de reforçar a compreensão sobre estruturas dinâmicas e manipulação de nós (nodes) e referências.

---

## 🧩 Estruturas Implementadas

### 1️⃣ Lista Encadeada Simples
**Descrição:**  
Cada elemento (nó) armazena um valor e uma referência para o próximo nó.  
A navegação ocorre em **apenas um sentido (do início ao fim)**.

**Operações implementadas:**
- Inserir (no final da lista)
- Buscar (por valor)
- Remover (por valor)
- Listar todos os elementos

**Exemplo de uso:**
```
javac listasimples/ListaSimples.java
java listasimples.ListaSimples
```

#### Saida Esperada
````
Lista: 10 20 30 
Busca 20: true
Lista: 10 30 
````


### 2️⃣ Lista Duplamente Encadeada

**Descrição:**
Cada nó possui ponteiros para o próximo e o anterior, permitindo navegação em **ambos os sentidos**.

**Operações implementadas:**
- Inserir (no final)
- Buscar (por valor)
- Remover (por valor)
- Listar (do início ao fim)
- Listar reverso (do fim ao início)

````
javac listadupla/ListaDupla.java
java listadupla.ListaDupla
````

### Saida Esperada
````
Lista (início → fim): 5 15 25 
Lista (fim → início): 25 15 5 
Lista (início → fim): 5 25 
````

### 3️⃣ Lista Encadeada Circular

**Descrição:**
O último nó aponta novamente para o primeiro, formando um ciclo.
Não há início ou fim fixo, a navegação é contínua.

**Operações implementadas:**
- Inserir (no final)
- Buscar (por valor)
- Remover (por valor)
- Listar todos os elementos (em ciclo)

**Exemplo de uso:**
````
javac listacircular/ListaCircular.java
java listacircular.ListaCircular
````

### Saída esperada:
````
Lista Circular: 1 2 3 
Lista Circular: 1 3 
````

---

## 🗂️ Estrutura do Repositório
````
/EstruturasDeDados
 ├── ListaSimples/
 │   └── ListaSimples.java
 ├── ListaDupla/
 │   └── ListaDupla.java
 ├── ListaCircular/
 │   └── ListaCircular.java
 └── README.md
````
