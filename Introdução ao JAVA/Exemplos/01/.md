# Entendendo o Java
## Características 
- Compilada
- Interpretada.
- Fortemente tipada.
- Linguagem de alto nível
- Executada em uma máquina virtual - JVM

# Entendendo a JVM
## Características 
- Execução de pilhas
- Gerenciamento de memória.
- Gerenciamento de threads.
- Otimização de código(Compilação JIT-Just in time)
- Garbage Collector(GC). Limpeza da memória suja.
## Palavras reservadas:
São palavras que não podem ser usadas para criação de objetos ou classes pois o Java já utiliza as mesmas.
## Classes
Sempre incia com letra Maiúscula e representa o mundo real.
## Modificadores de Acesso
- public 
 Qualquer classe de qualquer pacote poderá ter acesso ao atributo ou métedo.
- protected
 Qualquer classe definida no mesmo pacote ou subclasse.
- Sem modificador 
 Apenas classes definidas no mesmo pacote.
- private 
 Apenas a própria classe.

## Métodos
Construtores = Definem como uma classe será contruida.<br>
Comuns =  Definem comportamentos que podem ou não ser atribuídas às regras de negócio.

## Estrutura de condição
- if-else
if (condição){
return x;
}
else {
return y;
}

- swhitch-case
switch (valor){
	case x:
		return q;
	case y:
		return w;
	defult:
		return 0;
}


## Estrutura de repetição.
- while
while(condição){
faça.
}

- do-while
do{
	faça
}while(condição)

- for 
for (condição){
faça
}
- enhanced for
for (variavel i : itens){
faça
}

## Comentário
- Em linha
 // 
- Em bloco
/**  */

## Javadoc
 è uma ferramenta para documentação no formato HTML que se baseia nos comentários do código-fonte por Tags.
## Tags
- @author
Especifica o autor da classe.
- @deprecated
identifica classes ou métodos obsoletos.
- @link 
Possibilita a definição de um link p/ outro documento local ou remoto através de um url.
- @param 
descreve um parâmetro que será passado a um método.
- @return
Descreve qual tipo de retorno.
- @see
Associa a outras classes ou métodos
- @since
Descreve desde quando uma classe ou métodos foi adicionados
- @throws 
Descreve os tipos de exceções que podem ser lançadas por um método
# Conversões
## Upcast(implícito)
- Promoção de um tipo de dado de menor capacidade para maior capacidade (tamanho).
long l; int i; l=i;
## Downcast(explícito)
- Promoção de um tipo de dado de maior capacidade para menor capacidade (tamanho).
int i; long l=100; i=(int)l;