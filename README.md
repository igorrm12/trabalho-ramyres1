# Senai_LLP_Variaveis_Geometria

🎯 Implementação em **Java 19** de algoritmos para cálculo de áreas de figuras geométricas.

## 📋 Descrição

Este projeto contém 7 classes Java independentes, cada uma responsável pelo cálculo de área de uma figura geométrica diferente.

## 📁 Arquivos e Fórmulas

### 1. **Retangulo.java**
- **Fórmula**: Área = base × altura
- **Recursos adicionais**: Cálculo do perímetro

### 2. **Triangulo.java**
- **Fórmula**: Área = (base × altura) / 2
- **Entrada**: Base e altura

### 3. **Circulo.java**
- **Fórmula**: Área = π × r²
- **Recursos adicionais**: Cálculo do perímetro (circunferência)

### 4. **Caixa.java**
- **Fórmula**: Área Superficial = 2 × (ab + ac + bc)
- **Recursos adicionais**: Cálculo do volume
- **Entrada**: Comprimento, largura e altura

### 5. **Piramide.java**
- **Fórmula**: Área = área_base + área_lateral
- **Onde**: 
  - área_base = lado²
  - área_lateral = 2 × lado × apótema
- **Entrada**: Lado da base e apótema

### 6. **Tubo.java** (Cilindro)
- **Fórmula**: Área = 2πr² + 2πrh
- **Recursos adicionais**: Cálculo do volume
- **Entrada**: Raio e altura

### 7. **Bola.java** (Esfera)
- **Fórmula**: Área Superficial = 4πr²
- **Recursos adicionais**: Cálculo do volume
- **Entrada**: Raio

## 🚀 Como Usar

### Compilar um arquivo:
```bash
javac Retangulo.java
```

### Executar um arquivo:
```bash
java Retangulo
```

### Exemplo de Execução:
```
=== Cálculo de Área do Retângulo ===
Digite a base: 5
Digite a altura: 3

Retângulo: Base = 5.00, Altura = 3.00, Área = 15.00, Perímetro = 16.00
```

## ✨ Características

✅ **Programação Orientada a Objetos** - Cada figura é uma classe
✅ **Validação de entrada** - Apenas valores positivos são aceitos
✅ **Interface interativa** - Entrada via Scanner
✅ **Tratamento de erros** - Exceções para dados inválidos
✅ **Documentação completa** - Javadoc em todos os métodos
✅ **Java 19** - Utilizando features modernas da linguagem
✅ **Arquivos independentes** - Cada um pode ser compilado e executado separadamente

## 💻 Requisitos

- Java 19 ou superior
- Terminal/Prompt de comando

## 📝 Notas

- Todos os cálculos utilizam precisão de ponto flutuante (`double`)
- Os resultados são exibidos com 2 casas decimais
- Cada classe inclui validação para garantir que os valores de entrada sejam positivos

## 👨‍💻 Autor

Igorrm12

## 📄 Licença

Projeto educacional - Senai LLP
