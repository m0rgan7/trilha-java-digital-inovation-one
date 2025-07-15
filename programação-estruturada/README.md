# Estruturas de Repetição: `for`, `while` e `do while`

As estruturas de repetição são fundamentais para automatizar tarefas repetitivas. Neste guia, vamos aprender como utilizar as estruturas `for`, `while` e `do while` com exemplos e explicações.

---

## Estrutura `for`

É usada quando sabemos exatamente quantas vezes um bloco de código deve ser executado.

### Sintaxe:
```c
for (inicialização; condição; incremento) {
    // Bloco de código a ser repetido
}
```
### Exemplo:
```c
int main() {
    for (int i = 0; i < 5; i++) {
        printf("Valor de i: %d\n", i);
    }
    return 0;
}
```
---

## Estrutura `do while`

Semelhante a `while`a diferença é que é usada quando o bloco precisa ser executado ao menos uma vez mesmo que seja falso logo no primeiro bloco.

### Sintaxe:
```c
do {
    // Bloco de código a ser repetido
} while (condição);
```
### Exemplo:
```c
int main() {
    int i = 0;
    do {
        System.out.printf("Valor de i: %d\n", i);
        i++;
    } while (i < 5);
    return 0;
}
```
---

## Estrutura `while`

Usada quando não sabemos quantas vezes sera executado

### Sintaxe:
 ```c
while (condição) {
    // Bloco de código a ser repetido
}
```
### Exemplo:
```c
int main() {
    int i = 0;
    while (i < 5) {
        System.out.printf("Valor de i: %d\n", i);
        i++;
    }
    return 0;
}
```
