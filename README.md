# Api Teste Studio Sol - Felipe Ribeiro

## Sobre a execução


## Sobre a solução
Para solucionar o problema do teste foi utilizado o conceito de programação dinâmica, que busca divisão do problema
em subproblemas, e os soluciona vez por vez. O algoritmo de referência foi o `Algoritmo de Kadane`, uma solução popular para o
problema apresentado no teste.

Em uma explicação sussinta, assumindo o vetor abaixo:

|0|1|2|3|4|5|n|
|---|---|---|---|----|----|---|
| **5** | **8** | **4** | **3** | **-7** | **-1** | 6 |

Tomando no vetor os itens em destaque (índices 0 a 5) como o subvetor a ser analizado, e que sua soma é dada por ultimoMaximo, tem-se
    
    somaMaximaSubVetor = ultimoMaximo + vetor[n-1]

Se avaliarmos o subvetor com o término em `n-2`, pode-se calcular assim:

    somaMaximaSubVetor[n-2] = somaMaximaSubVetor[n-3] + vetor[n-2]

Chegando a:

    somaMaximaSubVetor[i] = somaMaximaSubVetor[i-1] + vetor[i]

Em seguida avalia-se o valor do elemento em relação à soma máxima, já que este é um vetor de tamanho 1

    somaMaximaSubVetor[i] = Max(vetor[i], somaMaximaSubVetor[i-1] + vetor[i]) 


Dessa forma o problema foi dividido em `n` subproblemas, encontrando a soma máxima em cada índice, iterando assim somente uma vez no vetor. Com esse princípio e a referência do `Algoritmo de Kadane` foi implementada a lógica.