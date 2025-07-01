# ♟️ Sistema de Xadrez em Java

Um jogo de xadrez completo implementado em Java, executado via terminal/console.

## 📋 Sobre o Projeto

Este é um sistema de xadrez que implementa todas as regras do jogo tradicional, incluindo movimentos especiais. O jogo é jogado através do terminal, onde as peças brancas são representadas por letras maiúsculas e as pretas por letras minúsculas.

### Peças e Suas Representações
- Rei (King) = K/k
- Rainha (Queen) = Q/q
- Torre (Rook) = R/r
- Bispo (Bishop) = B/b
- Cavalo (Knight) = N/n
- Peão (Pawn) = P/p

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 17 ou superior
- Maven

### Passos para Execução

1. Clone o repositório:
```bash
git clone https://github.com/RennAraujo/chess-system-java.git
```

2. Entre na pasta do projeto:
```bash
cd chess-system-java
```

3. Compile o projeto com Maven:
```bash
mvn clean compile package
```

4. Execute o jogo:
```bash
java -jar target/chess-system-java-1.0-SNAPSHOT.jar
```

## 🎮 Como Jogar

1. O jogo é jogado por dois jogadores, alternando entre peças brancas (maiúsculas) e pretas (minúsculas)
2. As peças brancas sempre começam
3. Para mover uma peça:
   - Digite a posição de origem (ex: e2)
   - Digite a posição de destino (ex: e4)
4. O tabuleiro usa coordenadas algébricas:
   - Colunas: a-h
   - Linhas: 1-8

### Exemplo de Movimento
```
Source: e2
Target: e4
```

## 🛠️ Tecnologias Utilizadas

- Java 17
- Maven
- Orientação a Objetos
- Padrões de Projeto

## ✨ Funcionalidades

- [x] Sistema de turnos
- [x] Validação de movimentos para cada tipo de peça
- [x] Diferenciação visual entre peças brancas e pretas
- [x] Coordenadas algébricas do xadrez
- [x] Tratamento de exceções para movimentos inválidos

## 📝 Estrutura do Projeto

O projeto segue uma arquitetura em camadas:

- `application`: Interface com o usuário
- `boardgame`: Lógica genérica do tabuleiro
- `chess`: Regras específicas do xadrez
- `chess.pieces`: Implementação de cada peça

## 👥 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/NovaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/NovaFeature`)
5. Abrir um Pull Request 