def lerInt():
    while (True):
        try:
            return int(input())
        except ValueError:
            print('Número inválido!')
            continue

# Recebe um número inteiro e retorna o antecessor e o sucessor desse número
def proximidade(inteiro):
    return inteiro - 1, inteiro + 1

def organizaEntrada():
    print('Digite um número inteiro: ')
    numero = lerInt()
    return numero

def main():
    numero = organizaEntrada()
    antecessor, sucessor = proximidade(numero)
    print('O antecessor é: ', antecessor)
    print('O sucessor é: ', sucessor)
    
main()
    
    