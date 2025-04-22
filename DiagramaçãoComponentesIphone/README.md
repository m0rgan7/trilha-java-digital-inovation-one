# POO - Desafio: Modelagem e Diagramação de um Componente iPhone

### 📘 Descrição

Neste desafio, você será responsável por modelar e implementar em Java a representação de um componente **iPhone**, que incorpora as funcionalidades de:

- Reprodutor Musical
- Aparelho Telefônico
- Navegador na Internet

### 📺 Contexto

Baseado no vídeo de lançamento do iPhone em 2007:  
[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)  
> Trecho relevante: de 00:15 até 00:55

---

### 🔧 Funcionalidades a Modelar

#### 🎵 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

#### 📞 Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

#### 🌐 Navegador de Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

### 📊 Diagrama UML (Mermaid)

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
