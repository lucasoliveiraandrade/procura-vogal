# Enunciado
Dada uma stream, encontre o primeiro caractere Vogal, após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita no resto da stream.

O termino da leitura da stream deve ser garantido através do método hasNext(), ou seja, retorna falso para o termino da leitura da stream.

## Premissas:
Uma chamada para hasNext() retorna se a stream ainda contem caracteres para processar.

Uma chamada para getNext() retorna o próximo caractere a ser processado na stream.

Não será possível reiniciar o fluxo da leitura da stream.

Não poderá ser utilizado nenhum framework Java, apenas código nativo.


## Exemplo:

Input: aAbBABac**afe**

Output: e

No exemplo, 'e' é o primeiro caractere Vogal da stream que não se repete após a primeira Consoante 'f' o qual tem uma vogal 'a' como antecessora.