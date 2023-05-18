def lerFloat():
    while (True):
        try:
            return float(input())
        except ValueError:
            print('Número inválido!')
            continue
        
        
def organizaEntradas():
    print('Forneca o valor do salario minimo: ')
    salarioMinimo = lerFloat()
    print('Forneca o valor do seu salario')
    salarioDoUsuario = lerFloat()
    
    return salarioMinimo, salarioDoUsuario

# Calcula a proporção de um valor(valor2) em relação a outro(valor1)
# Exemplo: a proporção de peso de duas pessoas. Felipe com 80kg e Luis com 40kg
# a proporção é de 2 tendo Luis como base(divisor), 80 / 40
# valor1 é o divisor
# valor2 é o dividendo
def proporcao(valor1, valor2):
    try:
        return valor2 / valor1
    except ZeroDivisionError:
        print('Erro: Divisão por zero!')
        return 0

def main():
    salarioMinimo, salarioDoUsuario = organizaEntradas()
    # quantSM se refera a quantidade de salários mínimos recebido pelo usuário
    # em seu salário
    quantSM = round(proporcao(salarioMinimo, salarioDoUsuario), 2)
    print('Você recebe', quantSM, 'salários mínimos')
    
    
main()