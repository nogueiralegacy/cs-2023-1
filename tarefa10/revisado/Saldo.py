def lerFloat():
    while (True):
        try:
            return float(input())
        except ValueError:
            print('Número inválido!')
            continue
        
def organizaEntrada():
    print('Digite seu saldo: ')
    saldo = lerFloat()
    return saldo

# a taxa tem que ser fornecida em porcentagem
# Exemplo: 15% = 15
def reajustaSaldo(saldo, taxa):
    return saldo * (1 + taxa / 100)

def main():
    saldo = organizaEntrada()
    print(round(reajustaSaldo(saldo, 15), 2))
    
main()