def lerInt():
    while (True):
        try:
            return int(input())
        except ValueError:
            print('Número inválido!')
            continue
        
def converteMesEmDias(mes):
    return mes * 30

def converteAnoEmDias(ano):
    return ano * 365

def converteIdadeEmDias(ano, mes, dia):
    return converteAnoEmDias(ano) + converteMesEmDias(mes) + dia

def organizarEntradas():
    print('Digite sua idade em anos, meses e dias: ')
    print('Anos: ')
    ano = lerInt()
    print('Meses: ')
    mes = lerInt()
    print('Dias: ')
    dia = lerInt()
    return ano, mes, dia

def main():
    ano, mes, dia = organizarEntradas()
    print('Sua idade em dias é: ', converteIdadeEmDias(ano, mes, dia))
        
main()