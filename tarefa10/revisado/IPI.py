class Peca:
    def __init__(self, codigo, valor, quantidade):
        self.codigo = codigo
        self.valor = valor
        self.quantidade = quantidade
        
    def getValorEstocado(self):
        return self.valor * self.quantidade
    
    

def lerInt():
    while (True):
        try:
            return int(input())
        except ValueError:
            print('Número inválido!')
            continue
        
def lerFloat():
    while (True):
        try:
            return float(input())
        except ValueError:
            print('Número inválido!')
            continue
        
        
def organizaEntradaPeca(identificador):
    print('Forneca o codigo da peca ', identificador, ': ')
    codigo = input()
    print('Forneca o valor da peca ', identificador, ': ')
    valor = lerFloat()
    print('Forneca a quantidade da peca ', identificador, ': ')
    quantidade = lerInt()
    
    return codigo, valor, quantidade
    

def organizaEntradas(quantidadePecas):
    print('Forneca o IPI em porcentagem: ')
    print('Exemplo: 15% -> 15')
    IPI = lerFloat()
    pecas = []
    for indice in range(1, quantidadePecas + 1):
        codigo, valor, quantidade = organizaEntradaPeca(indice)
        pecas.append(Peca(codigo, valor, quantidade))

    return IPI, pecas

def calculaValorTotal(IPI, pecas):
    valorTotal = 0
    for peca in pecas:
        valorTotal += peca.getValorEstocado()
        
    return valorTotal * (1 + IPI / 100)
        

def main():
    quantidadePecas = 2
    IPI, pecas = organizaEntradas(quantidadePecas)
    print('O valor total é: ', calculaValorTotal(IPI, pecas))
    
main()
    

