def media(numeros):
    return sum(numeros) / len(numeros)

def main():
    numeros = [8, 9, 7]
    primeiraMedia = media(numeros)
    print(primeiraMedia)
    
    numeros = [4, 5, 6]
    segundaMedia = media(numeros)
    print(segundaMedia)
    
    print(primeiraMedia + segundaMedia)
    
    print(media([primeiraMedia, segundaMedia]))
    
main()
    
    